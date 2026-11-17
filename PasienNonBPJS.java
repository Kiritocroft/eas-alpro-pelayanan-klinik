public class PasienNonBPJS extends Pasien {

    public PasienNonBPJS(int nomorAntrean, String nama, int umur, String jenisPemeriksaan){
        super(nomorAntrean, nama, umur, jenisPemeriksaan);
    }

    @Override
    public double hitungTotalBayar(){
        double total = getJasaDokter() + hitungTotalObat();
        if (getUmur() >= 60){
            total = total * 0.8;
        }
        return total;
    }

    @Override
    public void cetakStruk(){
        System.out.println("Nomor Antrean : " + getNomorAntrean());
        System.out.println("Nama Pasien   : " + getNama());
        System.out.println("Umur          : " + getUmur() + " tahun");
        System.out.println("Pemeriksaan   : " + getJenisPemeriksaan());
        System.out.println("Status        : Non-BPJS");
        System.out.println("Jasa Dokter   : Rp" + getJasaDokter());
        System.out.println("Obat          :");
        for (Obat o : getDaftarObat()){
            System.out.println("  - " + o.getNamaObat() + " " + o.getJumlah() + " x Rp" + o.getHargaSatuan() + " = Rp" + o.hitungHargaObat());
        }
        System.out.println("Total Obat    : Rp" + hitungTotalObat());
        if (getUmur() >= 60){
            double sebelumDiskon = getJasaDokter() + hitungTotalObat();
            double diskon = sebelumDiskon * 0.2;
            System.out.println("Diskon Lansia : Rp" + (int)diskon + " (20%)");
        }
        System.out.println("Total Bayar   : Rp" + (int)hitungTotalBayar());
    }
}
