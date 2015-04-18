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
public class Alamat {
    private String jalan;
    private String nomorRumah;
    private String kelurahan;
    private String kecamatan;
    private String kabupatenkota;
    private String provinsi;
    private String negara;

    /**
     * @return the jalan
     */
    public String getJalan() {
        return jalan;
    }

    /**
     * @param jalan the jalan to set
     */
    public void setJalan(String jalan) throws Exception {
        for (char i : jalan.toCharArray()){
             if (!Character.isDigit(i)&&!Character.isLetter(i)){
                 throw new Exception("Hanya boleh memasukan Angka dan Huruf!");
                 }
        
        }
        this.jalan = jalan;
    }

    /**
     * @return the nomorRumah
     */
    public String getNomorRumah() {
        return nomorRumah;
    }

    /**
     * @param nomorRumah the nomorRumah to set
     */
    public void setNomorRumah(String nomorRumah) throws Exception {
                for (char i : nomorRumah.toCharArray()){
             if (!Character.isDigit(i)&&!Character.isLetter(i)){
                 throw new Exception("Hanya boleh memasukan Angka dan Huruf!");
                 
                 }
        }
        this.nomorRumah = nomorRumah;
    }

    /**
     * @return the kelurahan
     */
    public String getKelurahan() {
       return kelurahan;
    }

    /**
     * @param kelurahan1
     * @param kelurahan the kelurahan to set
     * @throws java.lang.Exception
     */
    public void setKelurahan(String kelurahan) throws Exception {
               
        for (char i : kelurahan.toCharArray()){
             if (!Character.isLetter(i)){
                 throw new Exception("Harus Huruf!");
                 }
        }
             this.kelurahan = kelurahan;
    }

    /**
     * @return the kecamatan
     */
    public String getKecamatan() {
        return kecamatan;
    }

    /**
     * @param kecamatan the kecamatan to set
     * @throws java.lang.Exception
     */
    public void setKecamatan(String kecamatan) throws Exception {
        for (char i : kecamatan.toCharArray()){
                if (!Character.isLetter(i)){
                    throw new Exception("Harus Huruf!");
        }
        }
        this.kecamatan = kecamatan;
           
    }

    /**
     * @return the kabupatenkota
     */
    public String getKabupatenkota() {
        return kabupatenkota;
    }

    /**
     * @param kabupatenkota the kabupatenkota to set
     */
    public void setKabupatenkota(String kabupatenkota) throws Exception {
        for (char i : kabupatenkota.toCharArray()){
             if (!Character.isLetter(i)){
                 throw new Exception("Harus Huruf!");
                 }
        }
        this.kabupatenkota = kabupatenkota;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi)throws Exception {
        for (char i : provinsi.toCharArray()){
             if (!Character.isLetter(i)){
                 throw new Exception("Harus Huruf!");
                 }
        }
        this.provinsi = provinsi;
    }

    /**
     * @return the negara
     */
    public String getNegara() {
        return negara;
    }

    /**
     * @param negara the negara to set
     */
    public void setNegara(String negara)throws Exception {
        for (char i : negara.toCharArray()){
             if (!Character.isLetter(i)){
                 throw new Exception("Harus Huruf!");
                 }
        }
        this.negara = negara;
    }
    
}
