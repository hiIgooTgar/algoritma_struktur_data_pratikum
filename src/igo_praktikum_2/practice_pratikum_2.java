package igo_pratikum_2;
import java.util.Scanner;

public class practice_pratikum_2 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("=== Menghitung Luas Persegi Panjang ===");
        System.out.println("");
        System.out.print("Masukkan Panjang : ");
        int panjang = masuk.nextInt();
        System.out.print("Masukkan Lebar : ");
        int lebar = masuk.nextInt();
        int rumus_pp = panjang * lebar;
        System.out.println("Panjangnya adalah " + panjang + " dan lebar adalah " + lebar);
        System.out.println("Jadi Luasnya Persegi Panjang tersebut adalah : " + rumus_pp);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("=== Menghitung Luas Segitiga ===");
        System.out.print("Masukkan Tinggi : ");
        int tinggiSegitiga = masuk.nextInt();
        System.out.print("Masukkan Panjang Alas : ");
        int alasSegitiga = masuk.nextInt();
        int rumusSegitiga = (alasSegitiga * tinggiSegitiga) / 2;
        System.out.println("Panjang alasnya adalah " + alasSegitiga + " dan tinggi adalah " + tinggiSegitiga);
        System.out.println("Maka Luas Segitiga tersebut adalah : " + rumusSegitiga);
    }
    
}
