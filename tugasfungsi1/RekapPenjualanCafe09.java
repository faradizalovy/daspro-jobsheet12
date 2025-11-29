package tugasfungsi1;

import java.util.Scanner;

public class RekapPenjualanCafe09 {
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    static int[][] penjualan = new int [5][7];

    //input data penjualan
    static void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== INPUT DATA PENJUALAN ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " +menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    //tabel penjualan
    static void tampilData() {
        System.out.println("\n=========================== TABEL PENJUALAN ==========================");
        System.out.printf("%-15s", "Menu");
        for (int k = 1; k <= 7; k++) {
            System.out.printf("Hari %d\t", k);
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < 7; j++) {
            System.out.printf(penjualan[i][j] + "\t");
        }
        System.out.println();
    }
}
    //menu dengan total penjualan tertinggi
    static void menuTertinggi() {
        int maxTotal = 0;
        for (int j = 0; j < 7; j++) {
            maxTotal += penjualan[0][j];
        }
        String menuMax = menu[0];

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuMax = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuMax + "(Total: " + maxTotal + ")");
    }
    //rata-rata penjualan setiap menu
     static void rataRata() {
        System.out.println("\n=== RATA-RATA PENJUALAN ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / 7;
            System.out.println(menu[i] + ": " + rata);
        }
    }
    //main
    public static void main(String[] args) {

        inputData();
        tampilData();
        menuTertinggi();
        rataRata();
    }
}
