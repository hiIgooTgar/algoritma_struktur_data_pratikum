package igo_praktikum_11;
import java.util.Scanner; // import Scanner
public class sequential_search_3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // mendeklarasikan Scanner
        System.out.print("Masukkan berapa data yang diinginkan : ");
        int panjangData = input.nextInt();  // menginput variabel panjangData dengan tipe data integer
        int data[] = new int[panjangData]; // mendeklarasikan variabel data bersifat array
         /* Misal nilai awalnya i = 0; kondisionalnya adalah i kurang dari variabel panjangData; dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = 0; i < panjangData; i++) {
            System.out.print("Data [" + (i+1) + "] = "); // cetaik perintah (i+1)
            data[i] = input.nextInt(); // melakukan menginput, sesuai variabel panjangData
        }
        System.out.println("------------------------------------");
        System.out.print("Data Array = ");
        /* Misal nilai awalnya i = 0; kondisionalnya adalah i kurang dari sama dengan variabel panjangData - 1; dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = 0; i <= panjangData - 1; i++) {
            System.out.print(data[i] + " "); // cetaik perintah data[i] + 
        }
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.print("Masukkan data yang ingin dicari : ");
        int cari = input.nextInt();  // menginput variabel cari dengan tipe data integer
        // mendeklarasikan variabel
        int x = 0;
        boolean ketemu = false;
        /* Misal nilai awalnya i = x; kondisionalnya adalah i kurang dari variabel panjangData; dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = x; i < panjangData; i++) {
            if(cari == data[i]) {  // cek, jika variabel cari sama dengan variabel data[i] maka lakukan inisialiasasi ketemu = 1/true dan x = i
                ketemu = true; 
                x = i;
            }
        }
         // kita cek, jika variabel ketemu bersifat true maka tampilkan "Data berada pada urutan ke-" + (x+1) + ", indeks ke-" + x" jika tidak maka "Data tidak ditemukan"
        if(ketemu) { 
            System.out.println("Data berada pada urutan ke-" + (x+1) + ", indeks ke-" + x);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
