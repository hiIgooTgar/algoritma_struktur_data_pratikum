package igo_pratikum_3;

public class operator_pembanding {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("=== Operator Pembanding ===");
        System.out.println("");
        
        System.out.println(a + " == " + b  + " : " + (a == b)); // Sama dengan, simbolnya ==
        System.out.println(a + " != " + b  + " : " + (a != b)); // Tidak sama dengan, simbolnya !=
        System.out.println(a + " > " + b  + " : " + (a > b)); // Lebih dari, simbolnya >
        System.out.println(a + " < " + b  + " : " + (a < b)); // Kurang dari, simbolnya <
        System.out.println(a + " >= " + b  + " : " + (a >= b)); // Lebih dari sama dengan, simbolnya >=
        System.out.println(a + " <= " + b  + " : " + (a <= b)); // Kurang dari sama dengan, simbolnya <= 
    }
    
}
