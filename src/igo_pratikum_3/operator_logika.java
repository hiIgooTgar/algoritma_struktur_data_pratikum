package igo_pratikum_3;

public class operator_logika {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        System.out.println("=== Operator Logika ===");
        System.out.println("");
        
        System.out.println(a + " && " + b + " " + (a && b)); // Logika AND, simbolnya &&
        System.out.println(a + " || " + b + " " + (a || b)); // Logika OR, simbolnya ||
        System.out.println( "!" + a + " : " + (!a)); // Logika NOT, , simbolnya !
    }
    
}
