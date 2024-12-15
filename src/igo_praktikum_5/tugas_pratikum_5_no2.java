package igo_pratikum_5;
// import Scanner
import java.util.Scanner;

public class tugas_pratikum_5_no2 {
    
    public static void main(String[] args) {
        // mendeklarasikan scanner
        Scanner input = new Scanner(System.in);
        // mendeklarasikan variabel
        int age;
        // cetak perintah variabel age dengan type data Integer menggunakan Scanner
        System.out.print("Masukkan usia anda : ");
        age = input.nextInt();
        // cetak perintah variabel age
        System.out.println("Usia anda : " + age);
        
        if(age < 13) { // kita cek, jika age kurang dari 13 maka tampilkan "You are a child"
            System.out.println("You are a child");
        /* jika age diantara lebih dari sama dengan 13 dan kurang dari 20
            maka tampilkan "You are a teenager" */
        } else if(age >= 13 && age < 20) {
            System.out.println("You are a teenager");
        } else { // jika age lebih dari 20 maka tampilkan "You are an adult"
            System.out.println("You are an adult");
        }
    }
    
}
