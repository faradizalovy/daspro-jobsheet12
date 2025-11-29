package pertemuan14;

public class ProgramKu09 {
    public static void TampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }
    public static int Jumlah (int bil1, int bil2) {
        return (bil1 + bil2);
    }
    public static void TampilJumlah (int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1, bil2));
    }
    public static void main(String[] args) {
        int temp = Jumlah (1, 1);
        TampilJumlah(temp, 5);
    }
}

/*PERTANYAAN PERCOBAAN 5 NOMOR 3*/

/*3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program 
tersebut!  
Jawaban: -  Output program:
            1
            2
            3
            4
            5
            6
            7
            Output yang dihasilkan dari program tersebut adalah angka 1 sampai 7 yang ditampilkan secara berurutan ke bawah.
        -   Alur jalannya program:
            Fungsi main() pertama-tama memanggil fungsi Jumlah(1,1) yang menghasilkan nilai 2 dan kemudian menyimpannya ke dalam variabel temp. 
            Setelah itu, program memanggil fungsi TampilJumlah(temp, 5). Di dalam fungsi tersebut, program kembali memanggil Jumlah(bil1, bil2) 
            yaitu Jumlah(2,5) yang menghasilkan nilai 7. Nilai 7 tersebut kemudian dikirim ke fungsi TampilHinggaKei. Pada fungsi inilah angka 1 
            sampai 7 dicetak, karena perulangannya menggunakan kondisi j <= i, sehingga program menampilkan semua angka mulai dari 1 hingga 7*/
