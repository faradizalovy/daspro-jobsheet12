package pertemuan14;

public class ModifikasiPercobaan4 {
    static void daftarPengunjung (String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");

        //For-each Loop (Modifikasi Percobaan 4 Nomor 2)
        for (String nama : namaPengunjung) {
            System.out.println("- " +nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
