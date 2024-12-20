package igo_praktikum_6;
// import Scanner
import java.util.Scanner;

public class tugas_looping_no3 {

    public static void main(String[] args) {
        // mendeklarasikan scanner
        Scanner inputScanner = new Scanner(System.in);
        // mendeklarasikan variabel
        int input;
        // cetak perintah variabel input dengan type data Integer menggunakan Scanner
        System.out.print("Masukkan angka : ");
        input = inputScanner.nextInt();
        // Keterangan : ketika angka 0 maka berhenti perulangannya
        System.out.println("Masukkan angka (0 untuk berhenti)");
        /* Misal variabel input tidak sama dengan 0 maka lakukan perulangan, jika
        inputan sama dengan 0 maka perulangan selesai */
        while(input != 0) {
             // cetak lagi perintah variabel input dengan type data Integer menggunakan Scanner
             // ketika perulangan tidak sama dengan 0
            System.out.print("Masukkan angka : ");
            input = inputScanner.nextInt();
            System.out.println("Masukkan angka (0 untuk berhenti) ");
        }
        // cetak perintah
        System.out.println("Terima kasih sudah menggunakan program ini");
    }
    
}
