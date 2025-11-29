package tugasfungsi1;

import java.util.Scanner;

public class ModifikasiNo3 {
    static Scanner sc = new Scanner(System.in);

    static String[] menu;
    static int[][] penjualan;
    static int jumlahMenu, jumlahHari;

    //input jumlah menu dan hari
    static void inputUkuran() {
        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari penjualan: ");
        jumlahHari = sc.nextInt();
        sc.nextLine();
        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];
    }
    //input data penjualan
    static void inputData() {
        System.out.println("\n=== INPUT DATA PENJUALAN ===");

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println();
            
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();

            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Penjualan " + menu[i] + " hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
    }
     static void tampilData() {
        System.out.println("\n============================= TABEL PENJUALAN =====================");

        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= jumlahHari; h++) {
            System.out.printf("Hari %d\t", h);
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }
     static void menuTertinggi() {
        int maxTotal = -1;
        String menuMax = "";

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuMax = menu[i];
            }
        }
        System.out.println("\nMenu tertinggi: " + menuMax + " (Total: " + maxTotal + ")");
    }
    static void rataRata() {
        System.out.println("\n=== RATA-RATA PENJUALAN ===");
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / jumlahHari;
            System.out.println(menu[i] + ": " + rata);
        }
    }
     public static void main(String[] args) {

        inputUkuran();
        inputData();
        tampilData();
        menuTertinggi();
        rataRata();
    }
}
