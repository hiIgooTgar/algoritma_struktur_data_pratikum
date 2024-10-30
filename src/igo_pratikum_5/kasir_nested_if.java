package igo_pratikum_5;
// import Scanner
import java.util.Scanner;

public class kasir_nested_if {

    public static void main(String[] args) {
        // mendeklarasikan scanner
        Scanner input = new Scanner(System.in);
        // mendeklarasikan variabel
        int belanjaan, diskon, bayar;
        String kartu;
                
        // cetak perintah variabel kartu dengan type data String menggunakan Scanner
        System.out.print("Apakah ada kartu member : ");
        kartu = input.nextLine();
        // cetak perintah variabel belanjaan dengan type data Integer menggunakan Scanner
        System.out.print("Total belanjaan : ");
        belanjaan = input.nextInt();
        
        // Ket: equalsIgnoreCase digunakan untuk membandingkan String dengan tidak memperdulikan huruf besar dan kecilnya.
        // kita cek, jika punya kartu member atau "ya" maka rumuskan berikut
        if(kartu.equalsIgnoreCase("ya")) {
            if(belanjaan > 500000) {  // jika punya kartu member dan belanjaan lebih dari 500000 mendapatkan diskon Rp. 50000
                diskon = 50000;
            } else if(belanjaan > 100000) { // jika punya kartu member dan belanjaan lebih dari 100000 mendapatkan diskon Rp. 15000
                diskon = 15000;
            } else {  // jika punya kartu member dan belanjaan kurang dari 100000 tidak mendapatkan diskon
                diskon = 0;
            }
        } else {
            if(belanjaan > 100000) { // jika tidak punya kartu member dan belanjaan lebih dari 100000 mendapatkan diskon Rp. 5000
                diskon = 5000;
            } else { // jika tidak punya kartu member dan belanjaan kurang dari 100000 tidak mendapatkan diskon
                diskon = 0;
            }
        }   
        
        // variabel bayar rumuskan dengan total belanjaan dikurangin diskon
        bayar = belanjaan - diskon;
        // cetak total bayar dengan memanggil variabel bayar
        System.out.println("Total bayar Rp. " + bayar);
        
    }
    
}
