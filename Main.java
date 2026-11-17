import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pasien> antrean = new ArrayList<Pasien>();

        // Data uji 1: Andi, 30 tahun, Umum, Non-BPJS
        PasienNonBPJS p1 = new PasienNonBPJS(1, "Andi", 30, "Umum");
        p1.tambahObat(new Obat("Paracetamol", 1000, 10));
        p1.tambahObat(new Obat("Vitamin C", 2000, 5));
        antrean.add(p1);

        // Data uji 2: Ratna, 65 tahun, Gigi, Non-BPJS (lansia, diskon 20%)
        PasienNonBPJS p2 = new PasienNonBPJS(2, "Ratna", 65, "Gigi");
        p2.tambahObat(new Obat("Amoxicillin", 3000, 6));
        antrean.add(p2);

        // Data uji 3: Citra, 20 tahun, Umum, BPJS
        PasienBPJS p3 = new PasienBPJS(3, "Citra", 20, "Umum");
        p3.tambahObat(new Obat("Paracetamol", 1000, 6));
        antrean.add(p3);

        // Data uji tambahan 1: Dedi, 60 tahun, Anak, Non-BPJS (batas usia diskon)
        PasienNonBPJS p4 = new PasienNonBPJS(4, "Dedi", 60, "Anak");
        p4.tambahObat(new Obat("Ibuprofen", 2000, 5));
        p4.tambahObat(new Obat("Vitamin D", 1500, 4));
        antrean.add(p4);

        // Data uji tambahan 2: Siti, 70 tahun, Gigi, BPJS (lansia + BPJS)
        PasienBPJS p5 = new PasienBPJS(5, "Siti", 70, "Gigi");
        p5.tambahObat(new Obat("Amoxicillin", 3000, 4));
        p5.tambahObat(new Obat("Paracetamol", 1000, 10));
        antrean.add(p5);

        // cetak struk tiap pasien
        int totalPendapatan = 0;
        int jumlahPasien = 0;

        for (Pasien p : antrean){
            System.out.println("========================================");
            p.cetakStruk();
            totalPendapatan += (int)p.hitungTotalBayar();
            jumlahPasien++;
            System.out.println();
        }

        // rekap harian
        System.out.println("========================================");
        System.out.println("         REKAP HARIAN KLINIK            ");
        System.out.println("========================================");
        System.out.println("Jumlah Pasien    : " + jumlahPasien);
        System.out.println("Total Pendapatan : Rp" + totalPendapatan);
    }
}
