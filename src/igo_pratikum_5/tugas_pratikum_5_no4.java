package igo_pratikum_5;
import java.util.Scanner;

public class tugas_pratikum_5_no4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        
        System.out.print("Masukkan nilai anda : ");
        nilai = input.nextInt();
        System.out.println("Nilai anda : " + nilai);
        
        if(nilai >= 80) {
            System.out.println("Nilai A");
            if(nilai >= 90) {
                System.out.println("Sempurna!");
            }
        } else if(nilai >= 60 && nilai < 80) {
            System.out.println("Nilai B");
        } else if(nilai >= 40 && nilai < 60) {
            System.out.println("Nilai C");
        } else {
            System.out.println("Nilai D");
        }
    }
    
}
