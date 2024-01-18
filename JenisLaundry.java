public class JenisLaundry {
    private String jenisLaundry;
    private int harga;

    public JenisLaundry(String jenisLaundry, int harga){
        this.jenisLaundry=jenisLaundry;
        this.harga=harga;
    }

    public int hitungTotal(int harga, int jumlah){
        return harga *jumlah;
    }
}
