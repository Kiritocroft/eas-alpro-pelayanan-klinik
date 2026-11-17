public class Obat {
    private String namaObat;
    private int hargaSatuan;
    private int jumlah;

    public Obat(String namaObat, int hargaSatuan, int jumlah){
        this.namaObat = namaObat;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }

    public String getNamaObat(){
        return namaObat;
    }

    public int getHargaSatuan(){
        return hargaSatuan;
    }

    public int getJumlah(){
        return jumlah;
    }

    public int hitungHargaObat(){
        return hargaSatuan * jumlah;
    }
}
