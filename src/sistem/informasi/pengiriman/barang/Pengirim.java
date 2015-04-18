
package sistem.informasi.pengiriman.barang;


/**
 *
 * @author Edhi Prabowo
 */
public class Pengirim {
    private String nama;
    private Alamat alamat;
    private Barang barang;

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     * @throws java.lang.Exception
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

    /**
     * @return the barang
     */
    public Barang getBarang() {
        return barang;
    }

    /**
     * @param barang the barang to set
     */
    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    
}
