package tugasfungsi1;

public class Kubus09 {
    //fungsi menghitung volume kubus
    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }
    //fungsi menghitung luas permukaan kubus 
    static int hitungLuasPermukaan(int  sisi) {
        return 6 * sisi * sisi;
    }
    public static void main(String[] args) {
        int sisi = 5;
        System.out.println("Volume kubus: " +hitungVolume(sisi));
        System.out.println("Luas Permukaan kubus: "+hitungLuasPermukaan(sisi));
    }
}
