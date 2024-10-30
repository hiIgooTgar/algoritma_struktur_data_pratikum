package igo_pratikum_5;
import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String lampu;
        
        System.out.print("Masukkan warna lampu anda : ");
        lampu = input.nextLine();
        switch(lampu) {
            case "merah" :
                System.out.println("Lampu merah, berhenti");
                break;
            case "kuning" :
                System.out.println("Lampu kuning, harap hati-hati");
                break;
            case "hijau" :
                System.out.println("Lampu hijau, silahkan jalan");
                break;
            default:
                System.out.println("Warna lampu salah");
            
        }
    }
    
}
