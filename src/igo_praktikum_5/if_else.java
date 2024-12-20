package igo_praktikum_5;
//import Scanner
import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        //mendeklarasikan scanner
        Scanner input = new Scanner(System.in);
        
        // mendeklarasikan variabel
        int nilai;
        String grade;
        
        //cetak perintah nilai dengan type data integer
        System.out.print("Masukkan Nilai anda : ");
        nilai = input.nextInt();
        
       
        if(nilai >= 90) { // Kita cek, jika nilai lebih dari sama dengan 90 maka tampilkan grade "A"
            grade = "A";
        } else if(nilai >= 80) { // dan jika nilai lebih dari sama dengan 80 maka tampilkan grade "B+"
            grade = "B+";
        } else if(nilai >= 70) { // dan jika nilai lebih dari sama dengan 70 maka tampilkan grade "B"
            grade = "B";
        } else if(nilai >= 60) { // dan jika nilai lebih dari sama dengan 60 maka tampilkan grade "C+"
            grade = "C+";
        } else if(nilai >= 50) { // dan jika nilai lebih dari sama dengan 50 maka tampilkan grade "C"
            grade = "C";
        } else if(nilai >= 40) { // dan jika nilai lebih dari sama dengan 40 maka tampilkan grade "D"
            grade = "D";
        } else { // dan jika nilai kurang dari 40 maka tampilkan grade "E"
            grade = "E";
        }
        
        // cetak hasil grade dengan memanggil variabel grade
        System.out.println("Grade anda : " + grade);
    }
    
}
