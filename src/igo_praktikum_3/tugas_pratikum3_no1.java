package igo_praktikum_3;
import java.util.Scanner;

public class tugas_pratikum3_no1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // input nilai Celcius menggunakan Scanner
        System.out.print("Masukkan nilai suhu Celcius = ");
        double celcius = input.nextDouble();
        
        // rumus Celcius Konversi ke Fahreinhet
        double fahreinhet= celcius*9/5+32;
        // rumus Celcius Konversi ke Reamur
        double reamur = celcius*4/5;
        // rumus Celcius Konversi ke Kelvin
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
