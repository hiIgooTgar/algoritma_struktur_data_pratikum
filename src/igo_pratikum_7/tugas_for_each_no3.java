package igo_pratikum_7;
import java.util.Scanner; // import Scanner
public class tugas_for_each_no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Mendeklarasikan Scanner
        // cetak perintah variabel N dengan type data Integer menggunakan Scanner
        System.out.print("Masukkan value N : ");
        int N = input.nextInt();
        System.out.println("Looping 1");
         /* Misal nilai awalnya i = 1; kondisionalnya adalah i kurang dari sama dengan variabel N;
        dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = 1; i <= N; i++) {
            /* Misal nilai awalnya j = 1; kondisionalnya adalah j kurang dari variabel i;
            dan diiterasikan bertambahkan 1 / ++ increment*/
            for(int j = 1; j < i; j++) {
                // Cetak perintah
                System.out.print("*");
            }
            // Cetak perintah
            System.out.println();
        }
        System.out.println("");
        System.out.println("Looping 2");
        /* Misal nilai awalnya i = variabel N; kondisionalnya adalah i lebih dari sama dengan 0;
        dan diiterasikan berkurang 1 / -- decrement*/
        for(int i = N; i >= 0; i--) {
             /* Misal nilai awalnya j = 1; kondisionalnya adalah j kurang dari sama dengan variabel N;
            dan diiterasikan bertambahkan 1 / ++ increment*/
            for(int j = 1; j <= N; j++) {
                // jika i kurang dari j maka tampilkan "*", jika tidak maka tampilkan " "
                if(i < j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(""); // Cetak perintah
        }
    }
    
}
