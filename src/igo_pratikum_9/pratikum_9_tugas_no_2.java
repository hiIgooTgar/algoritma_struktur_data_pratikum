package igo_pratikum_9;
import java.util.Scanner;

public class pratikum_9_tugas_no_2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] siswa = new String[6];
        
        int value = 6;
        
        for(int i = 0; i < value; i++) { 
           System.out.print("Siswa Ke "+ i +" : ");
           siswa[i] = input.nextLine();
        }
        
        System.out.println("");
        
        System.out.println("====== DAFTAR NAMA SISWA ======");
        for(int i = 0; i < value; i++) { 
            System.out.println(siswa[i]);
        }
    }
    
}
