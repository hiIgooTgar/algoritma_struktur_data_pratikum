package igo_praktikum_4;
// import Scanner
import java.util.Scanner;

public class tugas_no1 {

    public static void main(String[] args) {
        //Mendeklarasi scanner menjadi input
        Scanner input = new Scanner(System.in);
        int angka;
        
        System.out.println("=== Ganjil Genap ===");
        System.out.println("");
        // input angka yang ingin dimasukkan
        System.out.print("Masukkan angka anda : ");
        angka = input.nextInt();
        
        // Cetak variabel angka
        System.out.println("Angka anda : " + angka);
        
        /* jika angka yang anda pilih dibagi 2 engga ada sisa atau 0 maka bilangan tersebut adalah
        bilangan genap dan jika bilangan anda ada sisa maka bilangan tersebut adalah bilangan ganjil*/
        if(angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan Genap");
        } else {
            System.out.println(angka + " adalah bilangan Ganjil");
        }
        
    }
    
}
