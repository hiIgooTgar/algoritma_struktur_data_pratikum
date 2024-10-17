package igo_pratikum_2;

import java.util.Scanner;

public class scanner {
    

    public static void main(String[] args) {
    
        Scanner coba = new Scanner(System.in);
        
        System.out.print("Masukkan NIM anda: ");
        String nim = coba.nextLine();
        System.out.print("Masukkan Nama anda: ");
        String nama = coba.nextLine();
        System.out.println("Pilih program studi : ");
        System.out.println("1. Informatika");
        System.out.println("2. Sistem Informasi"); 
        System.out.println("3. Teknologi Informasi");
        System.out.print("Masukkan pilihan anda (1/2/3) : ");
        int pilihan = coba.nextInt();
        
        String prodi;
        
        switch(pilihan) {
            case 1:
                prodi = "Informatika";
                break;
            case 2:
                prodi = "Sistem Informasi";
                break;
            case 3:
                prodi = "Teknologi Informasi";
                break;            
            default:
                prodi = "Tidak memilih program studi";
         }
        
        System.out.println(nama + " dengan NIM " + nim + " memilih program studi " + prodi);
        
    }
    
}
