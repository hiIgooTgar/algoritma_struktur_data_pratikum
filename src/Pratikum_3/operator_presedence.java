package igo_if24c_pratikum_3;

public class operator_presedence {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        boolean nilaiBoolean = true;
        
        int Ekspresi1, Ekspresi3, Ekspresi4;
        boolean Ekspresi2;
        
        Ekspresi1 = 5+a*2-a/2+(b-2);
        Ekspresi2 = !nilaiBoolean;
        Ekspresi3 = ++a - --b;
        Ekspresi4 = 40+a*b+25;
        
        System.out.println("");
        System.out.println("Nilai Ekspresi1 = " + Ekspresi1);
        System.out.println("Nilai Ekspresi2 = " + Ekspresi2);
        System.out.println("Nilai Ekspresi3 = " + Ekspresi3);
        System.out.println("Nilai Ekspresi4 = " + Ekspresi4);
        
        
    }
    
}
