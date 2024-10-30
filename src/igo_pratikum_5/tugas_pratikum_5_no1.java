package igo_pratikum_5;
import java.util.Scanner;

public class tugas_pratikum_5_no1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        float nilai_ipk;
        
        System.out.print("Masukkan Nama anda : ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai IPK anda : ");
        nilai_ipk = input.nextInt();
        System.out.println("");
        
        System.out.println("Nama : " + nama);        
        System.out.println("Nilai IPK : " + nilai_ipk);
        System.out.println("");
        
        System.out.print("Predikat : ");
        
        if(nilai_ipk >= 3.5) {
            System.out.println("Cumlaude");
        } else if(nilai_ipk >= 3) {
            System.out.println("Sangat Memuaskan");
        } else if(nilai_ipk >= 2.5) {
            System.out.println("Memuaskan");
        } else if(nilai_ipk >= 2) {
            System.out.println("Cukup");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
    
}
