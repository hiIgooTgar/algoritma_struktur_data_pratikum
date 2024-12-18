package igo_praktikum_11;
import java.util.Scanner;

public class sequential_search_3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berapa data yang diinginkan : ");
        int panjangData = input.nextInt();
        int data[] = new int[panjangData];
        
        for(int i = 0; i < panjangData; i++) {
            System.out.print("Data [" + (i+1) + "] = ");
            data[i] = input.nextInt();
        }
        
        System.out.println("------------------------------------");
        System.out.print("Data Array = ");
        for(int i = 0; i <= panjangData-1; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.print("Masukkan data yang ingin dicari : ");
        int cari = input.nextInt();
        
        int x = 0;
        boolean ketemu = false;
        for(int i = x; i < panjangData; i++) {
            if(cari == data[i]) {
                ketemu = true;
                x = i;
            }
        }
        
        if(ketemu) {
            System.out.println("Data berada pada urutan ke-" + (x+1) + ", indeks ke-" + x);
        } else {
            System.out.println("Data tidak ditemukan");
        }
        
    }
    
}
