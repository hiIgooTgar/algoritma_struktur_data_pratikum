package igo_praktikum_9;
import java.util.Scanner; // import Scanner

public class praktikum_9_tugas_no_2 {
    
    public static void main(String[] args) {
        // mendeklarasikan Scanner
        Scanner input = new Scanner(System.in);
        // mendeklarasikan variabel dan memberikan inisialisasi nilai awal
        int value = 6;
         /* mendeklarasikan array dengan tipe data string dan
         nama variabel array nya adalah siswa dengan panjang array 6.
        dibawah contoh pembuatan array dengan menggabungkan deklarasi dengan instansiasi */
        String[] siswa = new String[value];
        
        /* Misal nilai awalnya i = 0; kondisionalnya adalah i kurang dari variabel value yaitu 6;
        dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = 0; i < value; i++) { 
           // menginput array siswa dengan index ke 0 sampai 5 
           System.out.print("Siswa Ke "+ i +" : ");
           siswa[i] = input.nextLine();
        }
        System.out.println("");
        System.out.println("====== DAFTAR NAMA SISWA ======");
        /* Misal nilai awalnya i = 0; kondisionalnya adalah i kurang dari variabel value yaitu 6;
        dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = 0; i < value; i++) { 
            // cetak perintah array siswa dengan index ke 0 sampai 5 
            System.out.println(siswa[i]);
        }
    }
}
