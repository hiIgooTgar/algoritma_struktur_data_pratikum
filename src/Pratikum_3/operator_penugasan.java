package igo_if24c_pratikum_3;

public class operator_penugasan {

    public static void main(String[] args) {
        int a = 10;
        
        System.out.println("Nilai a : " + a);
        
        a += 2;
        // a = 10 jadi 10 + 2 = 12
        System.out.println("Nilai a(" + a + ") setelah ditambah 2 : " + a);
        
        a *= 5;
        // a = 12. kenapa hasil 12 karena nilai tersebut sudah ditambahkan 2, jadi 12 * 5 = 60
        System.out.println("Nilai a(" + a + ") setelah dikali 5 : " + a);
        
        a %= 7;
        // a = 60 
        System.out.println("Nilai a(" + a + ") setelah dibagi 7 : " + a);
    }
    
}
