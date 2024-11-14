package uts_asd;
import java.util.Scanner;

public class uts_1 {
    public static void main(System[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan panjang persegu panjang : ");
        int panjang = input.nextInt();
        
        System.out.print("Masukan luas persegi panjang : ");
        int lebar = input.nextInt();
        
        System.out.println("Panjang : " + panjang);
        System.out.println("Luas : " + lebar);
                
        int luas = panjang * lebar;
        System.out.println("Luas Persegi tersebut adalah " + luas);
        
    }
}