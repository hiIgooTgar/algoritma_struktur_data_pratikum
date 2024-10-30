package igo_pratikum_5;
import java.util.Scanner;

public class tugas_pratikum_5_no5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double harga_produk;
        int jumlah_pembelian;
        double diskon;
        
        System.out.print("Masukkan harga produk : ");
        harga_produk = input.nextDouble();
        System.out.println("Masukkan jumlah pembelian : ");
        jumlah_pembelian = input.nextInt();
        
        if(jumlah_pembelian > 10) {
            if(harga_produk > 100000) {
                diskon = 15/100;
            } else {
                diskon = 10/100;
            }
        }
    }
    
}
