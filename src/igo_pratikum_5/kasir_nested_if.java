package igo_pratikum_5;
import java.util.Scanner;

public class kasir_nested_if {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int belanjaan, diskon, bayar;
        String kartu;
        
        System.out.print("Apakah ada kartu member : ");
        kartu = input.nextLine();
        System.out.print("Total belanjaan : ");
        belanjaan = input.nextInt();
        
        if(kartu.equalsIgnoreCase("ya")) {
            if(belanjaan > 500000) {
                diskon = 50000;
            } else if(belanjaan > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else {
            if(belanjaan > 100000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }   
        
        bayar = belanjaan - diskon;
        
        System.out.println("Total bayar Rp. " + bayar);
        
    }
    
}
