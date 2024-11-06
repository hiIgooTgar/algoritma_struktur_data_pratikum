package igo_pratikum_6;
import java.util.Scanner;

public class tugas_looping_no3 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int input;
        System.out.println("Masukkan angka : ");
        System.out.println("Masukkan angka (0 untuk berhenti) ");
        input = inputScanner.nextInt();
       
        while(input != 0) {
            System.out.println("Masukkan angka : " + input);
            System.out.println("Masukkan angka (0 untuk berhenti) ");
            input = inputScanner.nextInt();
        }
        System.out.println("Terima kasih sudah menggunakan program ini");
    }
    
}
