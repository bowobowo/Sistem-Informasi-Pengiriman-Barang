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
public class Penerima {
    private String nama;
    private Alamat alamat;

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) throws Exception {
        for (char i : nama.toCharArray()){
                if (!Character.isLetter(i)){
                    throw new Exception("Harus Huruf!");
                }
        }
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public Alamat getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
}
