package igo_pratikum_5;
import java.util.Scanner;


public class if_else {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nilai;
        String grade;
        
        System.out.print("Masukkan Nilai anda : ");
        nilai = input.nextInt();
        
        if(nilai >= 90) {
            grade = "A";
        } else if(nilai >= 80) {
            grade = "B+";
        } else if(nilai >= 70) {
            grade = "B";
        } else if(nilai >= 60) {
            grade = "C+";
        } else if(nilai >= 50) {
            grade = "C";
        } else if(nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        // cetak hasil
        System.out.println("Grade anda : " + grade);
    }
    
}
