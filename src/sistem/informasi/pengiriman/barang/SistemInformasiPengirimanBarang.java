
package sistem.informasi.pengiriman.barang;
import java.util.*;


public class SistemInformasiPengirimanBarang {

  
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       
       
        Pengirim pengirim1 = new Pengirim();
        System.out.println("Masukan Nama Pengirim : ");
        
        
        {boolean error = true;
       while(error) {
       try {
         pengirim1.setNama(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
        Alamat alamatPengirim1 = new Alamat();
        isiAlamat(alamatPengirim1);
        pengirim1.setAlamat(alamatPengirim1);
        
        Barang barang1 = new Barang();
        isiBarang(barang1);
        pengirim1.setBarang(barang1);
        
        Penerima penerima1 = new Penerima();
        System.out.println("Masukan Nama Penerima : ");
        
        {boolean error = true;
       while(error) {
       try {
         penerima1.setNama(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
        Alamat alamatPenerima1 = new Alamat();
        isiAlamat(alamatPenerima1);
        penerima1.setAlamat(alamatPenerima1);
        
        System.out.println("Nama Pengirim : "+pengirim1.getNama());
        cetakBarang(barang1);
        cetakAlamat(alamatPengirim1);
        
        System.out.println("Nama Penerima : "+penerima1.getNama());
        cetakAlamat(alamatPenerima1);
        
        Biaya biaya1 = new Biaya();
        layanan(biaya1);
        System.out.println("Biaya : ");
        
        System.out.println("Rp. "+biaya1.Biaya(barang1, pengirim1, penerima1));
        
        
        
    }
    
   static void layanan(Biaya biaya){
       Scanner keyboard = new Scanner(System.in);
                
        System.out.println("Jenis Layanan : ");
        System.out.println("1. Hari yang sama sampai\n2. Satu Malam sampai\n3. Tiga Hari sampai\n.4 Reguler (default) ");
        while (!keyboard.hasNextInt()) {
            System.out.println("Pilih angka dari Pilihan diatas!");
            keyboard.next();
        } biaya.setLayanan(keyboard.nextInt());
        
   }
    
    static void isiBarang(Barang barang){
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Jenis Barang : ");
        System.out.println("1. Dokumen\n2. Barang Pecah Belah\n3. Lainnya (default) ");
        while (!keyboard.hasNextInt()) {
            System.out.println("Pilih angka dari Pilihan diatas!");
            keyboard.next();
        }
        barang.setJenisBarang(keyboard.nextInt());
        
        System.out.println("berat barang (dalam KG) :");
        while (!keyboard.hasNextInt()) {
            System.out.println("Harus angka!");
            keyboard.next();
        }
        barang.setBeratBarang(keyboard.nextInt());
    }
    
    static void cetakBarang(Barang barang){
        System.out.println("Jenis Barang :"+barang.getJenisBarang());
        System.out.println("Beart Barang :"+barang.getBeratBarang());
        
    }
    
    
    
    
    
    static void isiAlamat(Alamat alamat){
        Scanner keyboard = new Scanner(System.in);
       
        System.out.println("masukan nama jalan:");
        {boolean error = true;
       while(error) {
       try {
         alamat.setJalan(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
       System.out.println("masukan nomor rumah:");
      {boolean error = true;
       while(error) {
       try {
         alamat.setNomorRumah(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
      
       System.out.println("masukan nama Kelurahan:");
        
       {boolean error = true;
        while(error){
           try {
                alamat.setKelurahan(keyboard.nextLine());
                error = false;
           } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            } 
        }
       
            
        }
         
       System.out.println("masukan nama Kecamatan:");
       {boolean error = true;
       while(error) {
       try {
         alamat.setKecamatan(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
       System.out.println("masukan nama Kabupaten/Kota:");
        {boolean error = true;
       while(error) {
       try {
         alamat.setKabupatenkota(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
        System.out.println("masukan nama Provinsi:");
        {boolean error = true;
       while(error) {
       try {
         alamat.setProvinsi(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
        System.out.println("masukan nama Negara:");
        {boolean error = true;
       while(error) {
       try {
         alamat.setNegara(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
   }
    
    
    static void cetakAlamat(Alamat alamat){
        System.out.println("Jalan           : " + alamat.getJalan());
        System.out.println("Nomor Rumah     : " + alamat.getNomorRumah());
        System.out.println("Kelurahan       : " + alamat.getKelurahan());
        System.out.println("Kecamatan       : " + alamat.getKecamatan());
        System.out.println("Kabupaten/Kota  : " + alamat.getKabupatenkota());
        System.out.println("Provinsi        : " + alamat.getProvinsi());
        System.out.println("Negara          : " + alamat.getNegara());
        
    }
    
    
   
    
    }
            
    

