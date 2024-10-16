package igo_pratikum_3;

public class operator_bitwise {

    public static void main(String[] args) {
        int a = 5; // 0101 biner
        int b = 3; // 0011 biner
        
        System.out.println("=== Operator Bitwise ===");
        System.out.println("");
        
        System.out.println(a + " & " + b + " : " + (a & b)); // 1 -> 0001
        System.out.println(a + " | " + b + " : " + (a | b)); // 7 -> 0111
        System.out.println(a + " ^ " + b + " : " + (a ^ b)); // 6 -> 0110
        
    }
    
}
