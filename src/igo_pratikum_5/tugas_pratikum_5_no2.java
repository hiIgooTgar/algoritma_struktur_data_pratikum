package igo_pratikum_5;
import java.util.Scanner;

public class tugas_pratikum_5_no2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        
        System.out.print("Masukkan usia anda : ");
        age = input.nextInt();
        System.out.println("Usia anda : " + age);
        
        if(age < 13) {
            System.out.println("You are a child");
        } else if(age >= 13 && age < 20) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are an adult");
        }
    }
    
}
