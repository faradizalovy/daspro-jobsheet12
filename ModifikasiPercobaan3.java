import java.util.Scanner;

public class ModifikasiPercobaan3 {
    public static void Menu() {
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga09 (int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    //===== Modifikasi SOAL NOMOR 3: menambahkan parameter kodePromo =====
    public static int hitungDenganPromo(int hargaTotal, String kodePromo) {
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            int potongan = hargaTotal / 2; 
            System.out.println("Mendapatkan Diskon 50%");
            return hargaTotal - potongan;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            int potongan = (hargaTotal * 30) / 100; 
            System.out.println("Mendapatkan Diskon 30%");
            return hargaTotal - potongan;
        } else {
            System.out.println("\nKode promo invalid. Tidak ada diskon");
            return hargaTotal;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();

        //===== Modifikasi SOAL NOMOR 4: bisa pesan banyak jenis menu =====
        System.out.print("Berapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenis = sc.nextInt();

        int totalKeseluruhan = 0;

        for (int i = 0; i < jumlahJenis; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            int totalPerMenu = hitungTotalHarga09(pilihanMenu, banyakItem);
            totalKeseluruhan += totalPerMenu;
        }

        System.out.println("\nTotal harga sebelum diskon: Rp " + totalKeseluruhan);
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();

        int totalSetelahPromo = hitungDenganPromo(totalKeseluruhan, kodePromo);
        System.out.println("Total yang harus dibayar: Rp " + totalSetelahPromo);
    }
}
