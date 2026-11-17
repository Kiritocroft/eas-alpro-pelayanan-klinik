import java.util.ArrayList;

public class Pasien {
    private int nomorAntrean;
    private String nama;
    private int umur;
    private String jenisPemeriksaan;
    private int jasaDokter;
    private ArrayList<Obat> daftarObat;

    public Pasien(int nomorAntrean, String nama, int umur, String jenisPemeriksaan){
        this.nomorAntrean = nomorAntrean;
        this.nama = nama;
        this.umur = umur;
        this.jenisPemeriksaan = jenisPemeriksaan;
        this.daftarObat = new ArrayList<Obat>();

        if (jenisPemeriksaan.equals("Umum")){
            jasaDokter = 50000;
        } else if (jenisPemeriksaan.equals("Gigi")){
            jasaDokter = 100000;
        } else if (jenisPemeriksaan.equals("Anak")){
            jasaDokter = 75000;
        }
    }

    public int getNomorAntrean(){
        return nomorAntrean;
    }

    public String getNama(){
        return nama;
    }

    public int getUmur(){
        return umur;
    }

    public String getJenisPemeriksaan(){
        return jenisPemeriksaan;
    }

    public int getJasaDokter(){
        return jasaDokter;
    }

    public void tambahObat(Obat obat){
        daftarObat.add(obat);
    }

    public ArrayList<Obat> getDaftarObat(){
        return daftarObat;
    }

    public int hitungTotalObat(){
        int total = 0;
        for (Obat o : daftarObat){
            total += o.hitungHargaObat();
        }
        return total;
    }

    public double hitungTotalBayar(){
        return jasaDokter + hitungTotalObat();
    }

    public void cetakStruk(){
        System.out.println("Nomor Antrean : " + nomorAntrean);
        System.out.println("Nama Pasien   : " + nama);
        System.out.println("Umur          : " + umur + " tahun");
        System.out.println("Pemeriksaan   : " + jenisPemeriksaan);
        System.out.println("Jasa Dokter   : Rp" + jasaDokter);
        System.out.println("Obat          :");
        for (Obat o : daftarObat){
            System.out.println("  - " + o.getNamaObat() + " " + o.getJumlah() + " x Rp" + o.getHargaSatuan() + " = Rp" + o.hitungHargaObat());
        }
        System.out.println("Total Obat    : Rp" + hitungTotalObat());
        System.out.println("Total Bayar   : Rp" + (int)hitungTotalBayar());
    }
}
