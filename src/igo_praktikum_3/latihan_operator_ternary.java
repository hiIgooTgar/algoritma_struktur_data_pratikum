package igo_praktikum_3;

public class latihan_operator_ternary {

    public static void main(String[] args) {
        int a = 5, b = 3;
        int terbesar;
        
        System.out.println("=== Operator Ternary ===");
        System.out.println("");
        
        // apakah nilai a(5) lebih besar 3? jika ya(true) maka muncul 5
        // jika tidak(false) munculkan sebaliknya
        terbesar = (a > b) ? a : b;
        System.out.println("Bilangan terbesar = " + terbesar);
    }
    
}
