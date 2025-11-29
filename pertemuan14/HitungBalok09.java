package pertemuan14;

import java.util.Scanner;

public class HitungBalok09 {
    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }
    static  int hitungVolume(int tinggi, int a, int b) {
        int luas = hitungLuas(a, b);
        int volume = luas * tinggi;
        return volume;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        vol = hitungVolume(t, p, l);

        System.out.println("Luas persegi panjang adalah " +L);
        System.out.println("Volume balok adalah " +vol);

        input.close();

    }
}

/*PERTANYAAN*/

/*1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan 
luas persegi panjang dan volume balok!
Jawaban: -  Ketika program dijalankan, eksekusi dimulai dari method main(). Program pertama-tama meminta pengguna memasukkan panjang, 
            lebar, dan tinggi. Setelah nilai-nilai tersebut diterima, program memanggil fungsi hitungLuas(p, l) untuk menghitung luas 
            persegi panjang berdasarkan input panjang dan lebar. Nilai hasil perhitungan dikembalikan ke main() lalu disimpan dan ditampilkan.
         -  Setelah itu, program memanggil fungsi hitungVolume(t, p, l). Fungsi ini terlebih dahulu memanggil fungsi hitungLuas(p, l) 
            untuk mendapatkan nilai luas alas, kemudian mengalikan hasilnya dengan tinggi untuk mendapatkan volume balok. Nilai volume 
            tersebut dikembalikan ke main() dan kemudian ditampilkan sebagai output akhir.
            Jadi, urutan eksekusi program berjalan dari input data-pemanggilan fungsi hitungLuas-pemanggilan fungsi hitungVolume-
            menampilkan luas-menampilkan volume.*/

/*2.  Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. 
Jelaskan secara singkat alur jalannya 
program sampai output tersebut muncul. 
Jawaban: - Output program:
            Masukkan panjang: 4
            Masukkan lebar: 3
            Masukkan tinggi: 5
            Luas persegi panjang adalah 12
            Volume balok adalah 60 
          - Alur jalannya program
            Saat program dijalankan, main() meminta tiga input dari pengguna: panjang, lebar, dan tinggi. Setelah nilai 4, 3, dan 5 dimasukkan, 
            program memanggil fungsi hitungLuas(4, 3) yang mengalikan panjang dan lebar sehingga menghasilkan 12. Nilai 12 dikembalikan ke main() 
            dan ditampilkan sebagai luas persegi panjang. Selanjutnya program memanggil hitungVolume(5, 4, 3). Fungsi ini menghitung luas alas 
            dengan memanggil hitungLuas(4, 3) yang kembali menghasilkan 12, lalu mengalikannya dengan tinggi 5 sehingga volume menjadi 60. Nilai 
            60 dikembalikan ke main() dan ditampilkan sebagai volume balok.*/

/*3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut! 
-------- Kode program terdapat di file "ProgramKu09.java" -------*/

/*4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai 
kembalian atau tidak? Jelaskan!  
Jawaban: -  Fungsi harus menggunakan parameter ketika fungsi tersebut membutuhkan data dari luar agar bisa melakukan tugasnya. Tanpa parameter, 
            fungsi tidak akan punya nilai yang diperlukan untuk dihitung.Contohnya pada program kade atau balok, fungsi hitungLuas(p, l) butuh panjang dan lebar dari 
            luar. Kalau tidak ada parameter, fungsi tidak bisa menghitung apa pun. Fungsi tidak perlu parameter jika semua data sudah tersedia di dalam fungsi 
            atau tidak membutuhkan input apa pun. Misalnya fungsi Menu() hanya menampilkan daftar menu, jadi tidak butuh parameter.
        -   Fungsi harus memiliki nilai kembalian ketika fungsi itu melakukan perhitungan dan hasilnya dibutuhkan kembali oleh bagian program lain. Contohnya, 
            hitungVolume() menghasilkan nilai volume yang harus dipakai di main(). Sebaliknya, fungsi tidak perlu memiliki nilai kembalian jika fungsi tersebut 
            hanya melakukan tindakan, seperti mengeksekusi proses yang tidak memerlukan hasil perhitungan. Misalnya daftarPengunjung() atau Menu() hanya mencetak, 
            jadi tidak butuh return.*/

/*5.  Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume 
di Percobaan 5
Jawaban: Fungsi menggunakan parameter ketika fungsi tersebut membutuhkan nilai dari luar agar bisa melakukan perhitungan. Fungsi hitungLuas(p, l) harus memakai parameter 
karena luas hanya dapat dihitung jika panjang dan lebar diberikan oleh pengguna. Tanpa parameter, fungsi tidak akan mengetahui nilai panjang dan lebar sehingga perhitungannya 
tidak bisa dilakukan. Sementara itu, fungsi boleh dibuat tanpa parameter apabila fungsi tersebut tidak membutuhkan data dari luar. Misalnya fungsi yang hanya menampilkan teks 
atau melakukan proses yang datanya sudah tersedia di dalam fungsi itu sendiri. Dalam konteks Percobaan 5, baik hitungLuas maupun hitungVolume memang harus memakai parameter, 
karena dua-duanya membutuhkan nilai panjang, lebar, dan tinggi yang dimasukkan pengguna. Jika tidak menggunakan parameter, fungsi tidak akan mampu menghitung luas ataupun volume 
dengan benar.*/

/*6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, 
dan hitungVolume. 
Jawaban: Fungsi perlu memiliki nilai kembalian (return value) ketika hasil perhitungannya masih dibutuhkan oleh bagian program lain. Pada Percobaan 5, hitungLuas dan hitungVolume 
memakai return value karena hasil luas dan volume harus dikembalikan ke main() untuk ditampilkan. Sebaliknya, fungsi tidak perlu memiliki return value jika hanya menjalankan aksi 
3tanpa harus mengembalikan hasil. Contohnya adalah fungsi main() yang hanya mengatur jalannya program, sehingga tidak perlu mengembalikan nilai apa pun. */