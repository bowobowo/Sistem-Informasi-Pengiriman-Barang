/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.pengiriman.barang;

/**
 *
 * @author Edhi Prabowo
 */
public class Biaya {
   
   private double biayaJenis;
   private double biayaBerat;
   private double biayaJarak;
   private double biayaLayanan;
   private int layanan;
   Barang barang;
   Pengirim pengirim;
   Penerima penerima;
   
      
   private double biayaBerat (Barang barang){
       int a = barang.getBeratBarang();
       
       biayaBerat= a*7500;
       
       return biayaBerat;
   }
   
   private double biayaJarak(Pengirim pengirim, Penerima penerima){
       Alamat alamat1 = pengirim.getAlamat();
       Alamat alamat2 = penerima.getAlamat();
       
       if (!alamat1.getNegara().equalsIgnoreCase(alamat2.getNegara())){
           biayaJarak = 7.5;
       } else if (!alamat1.getProvinsi().equalsIgnoreCase(alamat2.getProvinsi())){
           biayaJarak = 2;
       } else if (!alamat1.getKabupatenkota().equalsIgnoreCase(alamat2.getKabupatenkota())){
           biayaJarak = 1.3;
       } else {
           biayaJarak = 1;
       }
       
       return biayaJarak;
   }
   
   private double biayaJenis(Barang barang){
       int a = barang.getJenisbarang();
       if(a==1){
           biayaJenis = 1.1;
       }else if (a==2){
           biayaJenis = 2;
       }else biayaJenis = 1;
       return biayaJenis;
   }
   
   private double biayaLayanan(int layanan){
       switch(layanan){
            case 1 : this.biayaLayanan = 7.5;
               break;
            case 2 : this.biayaLayanan = 5;
               break;
            case 3 : this.biayaLayanan = 3;
                break;
            default : this.biayaLayanan = 1;
                break;
       }
       return this.biayaLayanan;
   }
   
   public double Biaya (Barang barang,Pengirim pengirim, Penerima penerima ){
       double a = biayaBerat(barang);
       double b = biayaJarak(pengirim,penerima);
       double c = biayaJenis(barang);
       double d = biayaLayanan(layanan);
       
       double Biaya = a*b*c*d;
       
       return Biaya;
   }

    /**
     * @param layanan the layanan to set
     */
    public void setLayanan(int layanan) {
        this.layanan = layanan;
    }

    /**
     * @return the layanan
     */
    public int getLayanan() {
        return layanan;
    }
}

