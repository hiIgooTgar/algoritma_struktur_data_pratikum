package igo_pratikum_3;

public class operator_aritmatika {

    public static void main(String[] args) {
      int a = 10;
      int b = 20;
        System.out.println("=== Operator Aritmatika ===");
        System.out.println("");
        
        System.out.println(a + " + " + b + " = "+ (a+b) ); // Penjumlahan dari a + b
        System.out.println(a + " - " + b + " = "+ (a-b) ); // Pengurangan dari a - b
        System.out.println(a + " * " + b + " = "+ (a*b) ); // Perkalian dari a * b
        System.out.println(a + " / " + b + " = "+ (a/b) ); // Pembagian dari a / b
        System.out.println(a + " % " + b + " = "+ (a%b) ); // Modulus (Sisa bagi) dari a % b
        System.out.println(a + " + " + 1 + " = "+ (++a) ); // Penambahan 1 dari a + 1
        System.out.println(b + " - " + 1 + " = "+ (--b) ); // Pengurangan 1 dari b - 1
        
    }
    
}
