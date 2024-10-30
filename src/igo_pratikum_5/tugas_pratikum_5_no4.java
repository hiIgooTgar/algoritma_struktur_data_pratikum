package igo_pratikum_5;
// import Scanner
import java.util.Scanner;

public class tugas_pratikum_5_no4 {

    public static void main(String[] args) {
        // mendeklarasikan scanner
        Scanner input = new Scanner(System.in);
        // mendeklarasikan variabel
        int nilai;
        // cetak perintah variabel nilai dengan type data Integer menggunakan Scanner
        System.out.print("Masukkan nilai anda : ");
        nilai = input.nextInt();
        // cetak variabel nilai
        System.out.println("Nilai anda : " + nilai);
        // kita cek, jika nilai lebih dari sama dengan 80 maka tampilkan "Nilai A"
        if(nilai >= 80) {
            System.out.println("Nilai A");
            if(nilai >= 90) { // jika nilai lebih dari sama dengan 90 maka tampilkan "Sempurna"
                System.out.println("Sempurna!");
            }
        /* jika diantara dari nilai lebih dari sama dengan 60 dan kurang dari 80 maka tampilkan "Nilai B" */
        } else if(nilai >= 60 && nilai < 80) { 
            System.out.println("Nilai B");
        /* jika diantara dari nilai lebih dari sama dengan 40 dan kurang dari 60 maka tampilkan "Nilai C" */
        } else if(nilai >= 40 && nilai < 60) {
            System.out.println("Nilai C");
        /* jika nilai kurang dari 40 maka tampilkan "Nilai D" */
        } else {
            System.out.println("Nilai D");
        }
    }
}
