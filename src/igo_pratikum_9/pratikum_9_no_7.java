package igo_pratikum_9;
import java.util.Scanner;

public class pratikum_9_no_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] siswa = new String[3];
        
        System.out.print("Siswa Pertama : ");
        siswa[0] = input.nextLine();
        
        System.out.print("Siswa Kedua : ");
        siswa[1] = input.nextLine();
        
        System.out.print("Siswa Ketiga : ");
        siswa[2] = input.nextLine();
        
        System.out.println("");
        System.out.println("## Hasil ##");
        
        System.out.print("Nama Siswa adalah : ");
        System.out.println(siswa[0] + ", " + siswa[1] + ", " + siswa[2]);
        
    }
    
}
