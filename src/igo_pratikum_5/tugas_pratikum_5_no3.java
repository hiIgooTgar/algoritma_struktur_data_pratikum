package igo_pratikum_5;
import java.util.Scanner;

public class tugas_pratikum_5_no3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        String nameDay = "";
        
        
        System.out.println("Senin : 1");
        System.out.println("Selasa : 2");
        System.out.println("Rabu : 3");
        System.out.println("kamis : 4");
        System.out.println("Jum'at : 5");
        System.out.println("Sabtu : 6");
        System.out.println("Minggu : 7");
        System.out.println("");
        
        System.out.print("Masukkan angka hari (1-7) : ");
        day = input.nextInt();
        
        System.out.println("");
        System.out.print("Hari : ");
        
         switch(day) {
            case 1 :
                System.out.println("Senin");
                break;
            case 2 :
                System.out.println("Selasa");
                break;
            case 3 :
                System.out.println("Rabu");
                break;
            case 4 :
                System.out.println("Kamis");
                break;
            case 5 :
                System.out.println("Jum'at");
                break;
            case 6 :
                System.out.println("Sabtu");
                break;
            case 7 :
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Angka tidak valis!");
            
        }
        
        
    }
    
}
