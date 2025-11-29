package pertemuan14;

public class PengunjungCafe09 {
    static void daftarPengunjung (String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " +namaPengunjung[i]);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}

/*PERTANYAAN*/

/*1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!
Jawaban: karena program pada Percobaan 4 harus menerima banyak nama pengunjung sekaligus dalam satu pemanggilan fungsi. 
Tanda tiga titik (...) disebut varargs dan berfungsi untuk menampung jumlah argumen yang tidak tetap. Dengan cara ini, fungsi 
dapat dipanggil dengan satu nama, dua nama, atau bahkan lebih banyak tanpa harus membuat parameter berulang.*/

/*2.  Modifikasi method daftarPengunjung menggunakan for-each loop. 
-------- Modifikasi terdapat pada file "ModifikasiPercobaan4.java"--------*/

/*3.   Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, 
dan berikan contohnya! 
Jawaban:Tidak, aturannya adalah sebuah metode hanya boleh memiliki satu varargs, dan varargs tersebut harus berada di parameter terakhir. 
Jika ada lebih dari satu varargs, Java tidak bisa menentukan bagaimana membagi argumen yang masuk.*/

/*4.  Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat 
dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?  
Jawaban: Jika fungsi daftarPengunjung dipanggil tanpa argumen, program tidak akan error baik saat kompilasi maupun saat dijalankan. Program 
tetap berjalan normal. Karena varargs (String... namaPengunjung) boleh menerima 0, 1, atau banyak argumen. Saat tidak ada argumen diberikan, 
Java akan membuat array kosong (length = 0).
    - Contoh pemanggilan:
        daftarPengunjung();
    - Output:
        Daftar Nama Pengunjung:
        (dan tidak ada nama yang tampil, karena array-nya kosong)*/
