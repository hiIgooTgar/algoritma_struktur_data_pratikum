package igo_praktikum_4;
// import Scanner
import java.util.Scanner;

public class percabangan_if {

    public static void main(String[] args) {
        //Mendeklarasi scanner menjadi input
        Scanner input = new Scanner(System.in);
        
        int belanja;
        // input total belanja yang ingin dimasukkan
        System.out.print("Total Belanja : ");
        belanja = input.nextInt();
        
        
        /*Jika inputan belanja lebih dari 100000 maka muncul cetak
        "Selamat, anda mendapatkan hadiah!" dan "Terima kasih, sudah belanja disini..."
        jika kurang dari 100000 maka tampilkan "Terima kasih, sudah belanja disini..." saja*/
        if(belanja > 100000) {
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }
        
        System.out.println("Terima kasih, sudah belanja disini...");
    }
    
}
