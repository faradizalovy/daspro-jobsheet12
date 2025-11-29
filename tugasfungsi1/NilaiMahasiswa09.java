package tugasfungsi1;

import java.util.Scanner;

public class NilaiMahasiswa09 {
    //a. fungsi isianArray: mengisi nilai mahasiswa
    static void isianArray(int[] nilai, int jumlah) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }
    //b. fungsi tampilArray: menampilkan nilai mahasiswa 
    static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }
    }
    //c. fungsi hitTot: menghitung total nilai mahasiswa
    static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }
    //d. fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] dataNilai = new int[N];

        //memanggil fungsi
        isianArray(dataNilai, N);
        tampilArray(dataNilai);

        int total = hitTot(dataNilai);
        System.out.println("\nTotal nilai seluruh mahasiswa: " +total);

        sc.close();
    }
}
