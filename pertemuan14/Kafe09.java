package pertemuan14;

public class Kafe09 {
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
    public static void main(String[] args) {
        Menu();
    }
}

/*PERTANYAAN*/

/*1. Apakah fungsi tanpa parameter selalu harus bertipe void?*/
/*Jawaban: Tidak. Fungsi tanpa parameter tidak wajib bertipe void. Fungsi boleh mengembalikan nilai (misalnya int, String, dll)
meskipun tidak memiliki parameter*/

/*2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk 
dapat menampilkan daftar menu tanpa menggunakan fungsi! */
/*Jawaban: Ya. Fungsi hanya cara untuk mengatur atau merapikan program, sehingga semua statement juga dapat ditulis langsung di dalam
main tanpa fungsi. (Modifikasi ada di file ModifikasiPercobaaan1.java)*/

/*3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main*/
/*Jawaban:  1. Modular, menu dipisahkan menjadi satu blok fungsi sehingga program lebih terstruktur
            2. Efektf,jika menu perlu ditampilkan berkali-kali, cukup memanggil fungsi, tidak perlu menulis ulang kode (mengurangi duplikasi)
            3. Perubahan menu cukup dilakukan di satu tempat saja
            4. Kode main menjadi lebih ringkas*/

/*4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu 
tampil di layar)*/
/*Jawaban:  1. Program mulai dari main()
            2. main() menjalankan statement hingga menemukan pemanggilan Menu()
            3. Program berpindah menjalankan blok fungsi Menu()
            4. Semua statement di dalam Menu() dieksekusi (menampilkan daftar menu)
            5. Fungsi selesai, lalu kembali ke main()
            6. Program berlanjut ke statement berikutnya di main()*/