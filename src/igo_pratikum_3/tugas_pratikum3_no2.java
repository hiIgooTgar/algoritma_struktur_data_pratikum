package igo_pratikum_3;
import java.util.Scanner;

public class tugas_pratikum3_no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // input harga menggunakan Scanner
        System.out.print("Masukkan harga sebelum diskon Rp ");
        int uang = input.nextInt();
        // input diskon menggunakan Scanner
        System.out.print("Masukkan diskon = %");
        double diskon = input.nextDouble();
        System.out.println("================================");
        System.out.println("");
        System.out.println("Mndapatkan potongan harga sebesar Rp " + uang*diskon/100);
        System.out.println("");
        int total = (int) (uang*diskon/100);
        System.out.println("Jadi harga setelah mendapat diskon adalah Rp " + (uang - total));
    }
    
}
