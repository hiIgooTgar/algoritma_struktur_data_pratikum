package igo_praktikum_3;

public class operator_penugasan {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("=== Operator Penugasan ===");
        System.out.println("");
        System.out.println("Nilai a : " + a);
        
        a += 2;
        // a = 10 jadi 10 + 2 = 12
        System.out.println("Nilai a(" + a + ") setelah ditambah 2 : " + a);
        
        a *= 5;
        // a = 12. kenapa hasil a = 12? karena nilai tersebut sudah ditambahkan 2, jadi 12 * 5 = 60
        System.out.println("Nilai a(" + a + ") setelah dikali 5 : " + a);
        
        a %= 7;
        // a = 60. kenapa hasil a = 60? karena nilainya sudah dikali 5, jadi 60 / 7 = 4 (sisa bagi nya 4) or 7 x 8 = 56
        System.out.println("Nilai a(" + a + ") setelah dibagi 7 : " + a);
    }
    
}
