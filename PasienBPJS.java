public class PasienBPJS extends Pasien {

    public PasienBPJS(int nomorAntrean, String nama, int umur, String jenisPemeriksaan){
        super(nomorAntrean, nama, umur, jenisPemeriksaan);
    }

    @Override
    public double hitungTotalBayar(){
        return hitungTotalObat();
    }

    @Override
    public void cetakStruk(){
        System.out.println("Nomor Antrean : " + getNomorAntrean());
        System.out.println("Nama Pasien   : " + getNama());
        System.out.println("Umur          : " + getUmur() + " tahun");
        System.out.println("Pemeriksaan   : " + getJenisPemeriksaan());
        System.out.println("Status        : Peserta BPJS");
        System.out.println("Jasa Dokter   : Rp" + getJasaDokter() + " (ditanggung BPJS)");
        System.out.println("Obat          :");
        for (Obat o : getDaftarObat()){
            System.out.println("  - " + o.getNamaObat() + " " + o.getJumlah() + " x Rp" + o.getHargaSatuan() + " = Rp" + o.hitungHargaObat());
        }
        System.out.println("Total Obat    : Rp" + hitungTotalObat());
        System.out.println("Total Bayar   : Rp" + (int)hitungTotalBayar());
    }
}
