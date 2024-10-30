package igo_pratikum_5;
import java.util.Scanner;

public class tugas_pratikum_5_no5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double harga_produk;
        int jumlah_pembelian;
        double diskon;
        double total_harga;
        
        System.out.print("Masukkan harga produk : ");
        harga_produk = input.nextDouble();
        System.out.print("Masukkan jumlah pembelian : ");
        jumlah_pembelian = input.nextInt();
        
        if(jumlah_pembelian > 10) {
            if(harga_produk > 100000) {
                diskon = 15/100;
            } else {
                diskon = 10/100;
            }
        } else {
             if(harga_produk > 50000) {
                diskon = 5/100;
            } else {
                diskon = 2/100;
            }
        }
        
        total_harga = harga_produk * jumlah_pembelian - diskon;
        System.out.println("Total harga anda : " + (int) total_harga);
    }
    
}
