package pertemuan14;

public class PercobaanDua09 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
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
        Menu("Shelsa", true);
    }
}

/*PERTANYAAN*/

/*1. Apakah kegunaan parameter di dalam fungsi?*/
/*Jawaban: Parameter digunakan untuk mengirim data dari luar fungsi ke dalam fungsi, serta membuat fungsi lebih
fleksibel dan dapat digunakan berulang*/

/*2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?*/
/*Jawaban: Karena fungsi membutuhkan data dari luar (nama pelanggan dan status member) agar dapat menampilkan informasi 
yang sesuai, namaPelanggan (supaya menu bisa menampilkan nama pelanggan yang berbeda-beda) isMember (untuk membedakan
output member dan non-member). Parameter sebagai penampung nilai yang dilewatkan dari fungsi pemanggil.*/

/*3. Apakah parameter sama dengan variabel? Jelaskan.
Jawaban: Parameter adalah variabel lokal dalam fungsi, karena hanya dikenali di dalam fungsi. Bedanya, nilai parameter dikirim 
dari luar fungsi saat fungsi dipanggil. Jadi parameter sama dengan variabel lokal khusus yang nilainya ditentukan dari luar*/

/*4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa 
perbedaan output ketika isMember bernilai true dan ketika false?
Jawaban: Parameter isMember bekerja sebagai penentu status keanggotaan pelanggan. Ketika fungsi Menu() dipanggil, nilai boolean 
yang diberikan pada parameter ini akan dibaca dan digunakan dalam percabangan di dalam fungsi. Program kemudian menjalankan salah 
satu cabang sesuai nilai yang diterima, sehingga fungsi dapat menampilkan output yang berbeda berdasarkan status tersebut. Perbedaanya
adalah jika isMember bernilai TRUE, fungsi akan menampilkan bahwa pelanggan adalah member. Namun jika isMember bernilai FALSE, fungsi 
menampilkan bahwa pelanggan bukan member*/

/*5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
Jawaban: Program akan mengalami compile-time error karena fungsi membutuhkan parameter wajib. Jumlah dan tipe parameter harus sama dengan 
deklarasi fungsi.*/

/*6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan 
diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid. 
------- (Terdapat di file lain dengan nama "ModifikasiPercobaan2.java") -------*/

/*7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan 
tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris 
perintah pemanggilan fungsi menu yang benar.
------- (Terdapat di file lain dengan nama "ModifikasiPercobaan2.java") -------*/

/*8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan 
dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda. 
Jawaban: Ya, karena nilai yang digunakan fungsi tidak ditulis langsung di dalamnya, tetapi dikirim dari luar sesuai kebutuhan. Dengan begitu, fungsi 
dapat dipakai untuk banyak pelanggan tanpa harus mengubah isi kode setiap kali. Selain itu, cara ini membuat program lebih rapi dan lebih mudah dikembangkan 
karena perubahan cukup dilakukan pada tempat pemanggilan fungsi, bukan di dalam fungsi itu sendiri.*/