package igo_pratikum_4;
// import Scanner

import java.util.Scanner;

public class tugas_02 {

    public static void main(String[] args) {
        //Mendeklarasi scanner menjadi input
        Scanner input = new Scanner(System.in);
        
        char jenisKelamin;
        double tinggiBadan;
        double beratBadanIdeal = 0;
        
        System.out.print("Masukkan jenis kelamin anda (L/P) : ");
        // input jenis kelamin
        jenisKelamin = input.next().charAt(0);
        System.out.print("Masukkan tinggi badan anda : ");
        // input tinggi badan
        tinggiBadan = input.nextDouble();
        
        // Keterangan jk = Jenis Kelamin
        /* Jika jk adalah L/l maka hitunglah berat badan dengan rumus 
         (tinggiBadan - 100) - (0.1 * (tinggiBadan - 100)) */
        if(jenisKelamin == 'L' || jenisKelamin == 'l') {
            beratBadanIdeal = (tinggiBadan - 100) - (0.1 * (tinggiBadan - 100));
        /* Jika jk adalah P/p maka hitunglah berat badan dengan rumus 
         (tinggiBadan - 100) - (0.15 * (tinggiBadan - 100) */    
        } else if(jenisKelamin == 'P' || jenisKelamin == 'p') {
            beratBadanIdeal = (tinggiBadan - 100) - (0.15 * (tinggiBadan - 100));
        }
      
        //cetak variabel jenis kelamin
        System.out.println("Jenis kelamin anda : " + jenisKelamin);
        //cetak variabel tinggi badan
        System.out.println("Tinggi badan anda : " + tinggiBadan);
        //cetak variabel berat badan ideal
        System.out.println("Berat badan anda : " + beratBadanIdeal);
        
    }
    
}
