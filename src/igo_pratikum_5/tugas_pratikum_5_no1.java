package igo_pratikum_5;
// import Scanner
import java.util.Scanner;

public class tugas_pratikum_5_no1 {

    public static void main(String[] args) {
        // mendeklarasikan scanner
        Scanner input = new Scanner(System.in);
        // mendeklarasikan variabel
        String nama;
        float nilai_ipk;
        // cetak perintah variabel nama dengan type data String menggunakan Scanner
        System.out.print("Masukkan Nama anda : ");
        nama = input.nextLine();
        // cetak perintah variabel nilai_ipk dengan type data Float menggunakan Scanner
        System.out.print("Masukkan Nilai IPK anda : ");
        nilai_ipk = input.nextFloat();
        System.out.println("");
        // cetak perintah variabel nama dan nilai_ipk
        System.out.println("Nama : " + nama);        
        System.out.println("Nilai IPK : " + nilai_ipk);
        System.out.println("");
        // cetak perintah
        System.out.print("Predikat : ");
        
        if(nilai_ipk >= 3.5) { // kita cek, jika nilai_ipk lebih dari sama dengan 3.5 maka tampilkan "Cumlaude"
            System.out.println("Cumlaude");
        } else if(nilai_ipk >= 3.0) { // jika nilai_ipk lebih dari sama dengan 3.0 maka tampilkan "Sangat Memuaskan"
            System.out.println("Sangat Memuaskan");
        } else if(nilai_ipk >= 2.5) { // jika nilai_ipk lebih dari sama dengan 2.5 maka tampilkan "Memuaskan"
            System.out.println("Memuaskan");
        } else if(nilai_ipk >= 2.0) { // jika nilai_ipk lebih dari sama dengan 2.0 maka tampilkan "Cukup"
            System.out.println("Cukup");
        } else { // jika nilai_ipk kurang dari 2.0 maka tampilkan "Tidak Lulus"
            System.out.println("Tidak Lulus");
        }
    }
    
}
