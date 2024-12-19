package igo_praktikum_3;
import java.util.Scanner;

public class tugas_pratikum3_no3 {
    
    // menyimpan variabel bersifat public (global)
    public static int penjumlahan, pengurangan, perkalian, pembagian;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan 1 : ");
        int bilangan1 = input.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        int bilangan2 = input.nextInt();
        System.out.println("");
        System.out.println("Bilangan 1 adalah = " + bilangan1);
        System.out.println("Bil2angan 2 adalah = " + bilangan2);
        System.out.println("");
        penjumlahan = bilangan1 + bilangan2;
        pengurangan = bilangan1 - bilangan2;
        perkalian = bilangan1 * bilangan2;
        if(bilangan2 != 0) {
           pembagian = bilangan1 / bilangan2;
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan");
        }
        System.out.println("Penjumlahan " + bilangan1 + " + " + bilangan2 + " = " + penjumlahan);
        System.out.println("Pengurangan " + bilangan1 + " - " + bilangan2 + " = " + pengurangan);
        System.out.println("Perkalian " + bilangan1 + " * " + bilangan2 + " = " + perkalian);
        if(bilangan2 != 0) {
            pembagian = bilangan1 / bilangan2;
            System.out.println("Pembagian " + bilangan1 + " / " + bilangan2 + " = " + pembagian); 
        }
    }
    
}
