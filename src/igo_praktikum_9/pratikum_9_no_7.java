package igo_pratikum_9;
import java.util.Scanner; // import Scanner

public class pratikum_9_no_7 {

    public static void main(String[] args) {
        // mendeklarasikan Scanner
        Scanner input = new Scanner(System.in);
         /* mendeklarasikan array dengan tipe data string dan nama variabel array 
        nya adalah siswa dengan panjang array 3 */
        String[] siswa = new String[3];
     
        System.out.print("Siswa Pertama : ");
        siswa[0] = input.nextLine();  // menginput array siswa dengan index ke 0
        System.out.print("Siswa Kedua : ");
        siswa[1] = input.nextLine(); // menginput array siswa dengan index ke 1
        System.out.print("Siswa Ketiga : ");
        siswa[2] = input.nextLine(); // menginput array siswa dengan index ke 2
        
        System.out.println("");
        System.out.println("## Hasil ##");
        
        System.out.print("Nama Siswa adalah : ");
        // cetak perintah array siswa index ke 0, 1, dan 2
        System.out.println(siswa[0] + ", " + siswa[1] + ", " + siswa[2]);
    }
}
