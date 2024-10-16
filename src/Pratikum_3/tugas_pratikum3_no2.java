package igo_if24c_pratikum_3;
import java.util.Scanner;

public class tugas_pratikum3_no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan harga sebelum diskon Rp.");
        double uang = input.nextDouble();
        System.out.print("Masukkan diskon = %");
        double diskon = input.nextDouble();
        System.out.println("================================");
        System.out.println("");
        System.out.println("");
        
        double potongan = uang*diskon/100;
        System.out.println("Mndapatkan potongan harga sebesar " + potongan);
        System.out.println("Jadi harga setelah mendapat diskon adalah Rp." + (uang - potongan));
    }
    
}
