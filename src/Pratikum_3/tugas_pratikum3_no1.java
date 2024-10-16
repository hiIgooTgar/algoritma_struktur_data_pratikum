package igo_if24c_pratikum_3;
import java.util.Scanner;

public class tugas_pratikum3_no1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai suhu Celcius = ");
        double celcius = input.nextDouble();
        
        double fahreinhet= celcius*9/5+3;
        double reamur = celcius*4/5;
        double kelvin = celcius + 275.15;
        System.out.println("===========================");
        System.out.println("");
        System.out.println("Hasil Konversi suhu Celcius ke Fahreinhet");
        System.out.println("---> " + celcius + " Celcius" +  " = " + fahreinhet + " Fahreinhet");
        System.out.println("");
        System.out.println("Hasil Konversi suhu Celcius ke Reamur");
        System.out.println("---> " + celcius + " Celcius " +  " = " + reamur + " Reamur");
        System.out.println("");
        System.out.println("Hasil Konversi suhu Celcius ke Kelvin");
        System.out.println("---> " + celcius + " Celcius " +  " = " + kelvin + " Kelvin");
    }
    
}
