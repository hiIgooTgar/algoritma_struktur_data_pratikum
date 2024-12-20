package igo_praktikum_5;
import java.util.Scanner; // import Scanner
public class tugas_praktikum_5_no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // mendeklarasikan scanner
        // mendeklarasikan variabel
        int day;
        String nameDay;
        System.out.println("Senin : 1 | Selasa : 2 | Rabu : 3 | kamis : 4 | Jum'at : 5 | Sabtu : 6 | Minggu : 7"); // Keterangan 1,2,3,4,5,6,7
        System.out.println("");
        System.out.print("Masukkan angka hari (1-7) : "); // cetak perintah variabel day dengan type data Integer menggunakan Scanner
        day = input.nextInt();
        System.out.println("");
        System.out.print("Hari pilihan anda : ");
        // kita cek variabel day
         switch(day) {
            case 1 : // jika casenya sama dengan 1 maka tampilkan "Senin" dan break
                System.out.println("Senin");
                break;
            case 2 : // jika casenya sama dengan 2 maka tampilkan "Selasa" dan break
                System.out.println("Selasa");
                break;
            case 3 : // jika casenya sama dengan 3 maka tampilkan "Rabu" dan break
                System.out.println("Rabu");
                break;
            case 4 : // jika casenya sama dengan 4 maka tampilkan "Kamis" dan break
                System.out.println("Kamis");
                break;
            case 5 : // jika casenya sama dengan 5 maka tampilkan "Jum'at" dan break
                System.out.println("Jum'at");
                break;
            case 6 : // jika casenya sama dengan 6 maka tampilkan "Sabtu" dan break
                System.out.println("Sabtu");
                break;
            case 7 : // jika casenya sama dengan 7 maka tampilkan "Minggu" dan break
                System.out.println("Minggu");
                break;
            default: // jika casenya tidak sesuai dengan 1,2,3,4,5,6,7 maka tampilkan "Angka tidak valis!" dan berakhir
                System.out.println("Angka tidak valis!");
        }
    }
}
