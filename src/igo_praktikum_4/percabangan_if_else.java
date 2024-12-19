package igo_praktikum_4;
// import Scanner

import java.util.Scanner;

public class percabangan_if_else {

    public static void main(String[] args) {
        //Mendeklarasi scanner menjadi input
        Scanner input = new Scanner(System.in);
        
        int nilai;
        String nama;
        
        // input nama anda
        System.out.print("Nama anda : ");
        nama = input.nextLine();
        // input nilai anda
        System.out.print("Nilai anda : ");
        nilai = input.nextInt();
        
         /*Jika inputan lebih dari sama dengan 70 maka cetak "Selamat (varibel nama)
        , anda lulus" jika inputan kurang dari 70 maka cetak "Maaf (varibel nama)
        , anda gagal/tidak lulus"*/
        if(nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal/tidak lulus");
        }
    }
    
}
