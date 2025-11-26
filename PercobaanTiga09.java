import java.util.Scanner;

public class PercobaanTiga09 {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();

        System.out.println("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.println("Massukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        
        int hargaTotal = hitungTotalHarga09(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp " + hargaTotal);
    }
}

/*PERTANYAAN*/

/*1.Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. 
Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
Jawaban: >  Sebuah fungsi membutuhkan nilai kembalian (return value) ketika hasil dari fungsi tersebut akan dipakai kembali oleh bagian program lain, 
            misalnya untuk perhitungan atau untuk ditampilkan. Pada Percobaan 3, fungsi hitungTotalHarga09() termasuk fungsi yang membutuhkan nilai kembalian 
            karena hasil perhitungan total harga perlu digunakan oleh fungsi main(). Contoh barisnya adalah:int hargaTotal = hitungTotalHarga09(pilihanMenu, banyakItem). 
            Baris ini menunjukkan bahwa nilai yang dikembalikan oleh fungsi digunakan untuk mengisi variabel hargaTotal.
         
         >  Sebaliknya, fungsi tidak memerlukan nilai kembalian jika tugasnya hanya melakukan tindakan tertentu dan tidak menghasilkan data yang perlu digunakan kembali. 
            Pada Percobaan 3, fungsi Menu() hanya menampilkan daftar menu sehingga tidak membutuhkan return value. Contoh baris pemanggilannya adalah:  Menu();
            Baris ini menunjukkan bahwa tidak ada nilai yang dikembalikan, karena fungsi hanya menampilkan informasi tanpa menghasilkan data baru.*/

/*2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter 
yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe!
Jawaban: Fungsi hitungTotalHarga09 memiliki nilai kembalian bertipe int, karena fungsi tersebut menghasilkan total harga dalam bentuk bilangan bulat. Fungsi ini menggunakan 
dua parameter, yaitu pilihanMenu dan jumlahPesanan. Parameter pilihanMenu berfungsi untuk menentukan menu mana yang dipilih pengguna, sehingga program dapat mengambil harga yang 
sesuai dari array harga. Sementara itu, parameter jumlahPesanan menunjukkan berapa banyak item yang dipesan, sehingga total harga dapat dihitung dengan mengalikan harga menu dengan 
jumlah pesanan tersebut.*/

/*3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan 
diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada 
pengurangan total harga totalHarga. 
------------ Terdapat di file "ModifikasiPercobaan3.java" -------------*/

/*4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan 
lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?  
------------ Terdapat di file "ModifikasiPercobaan3.java" ------------- */