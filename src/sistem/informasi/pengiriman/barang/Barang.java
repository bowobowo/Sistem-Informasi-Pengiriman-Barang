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
public class Barang {
    private String jenisBarang;
    private int beratBarang;
    private int jenisbarang;
       
    
    public String getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(int jenisbarang) {
        String jenisBarang="";
        
                switch(jenisbarang){
            case 1: jenisBarang = "Dokumen";
                    break;
            case 2: jenisBarang = "Pecah Belah";
                    break;
            default: jenisBarang = "Lainnya";
                    break;
            
        
        }
        this.jenisBarang = jenisBarang;
        this.jenisbarang = jenisbarang;
    }

    /**
     * @return the beratBarang
     */
    public int getBeratBarang() {
        return beratBarang;
    }

    /**
     * @param beratBarang the beratBarang to set
     */
    public void setBeratBarang(int beratBarang) {
          
         this.beratBarang = beratBarang;
    }

    /**
     * @return the jenisbarang
     */
    public int getJenisbarang() {
        return jenisbarang;
    }
    
    
}
