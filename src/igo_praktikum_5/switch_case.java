package igo_praktikum_5;
// import Scanner
import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {
        // mendeklarasikan scanner
        Scanner input = new Scanner(System.in);
        
        // mendeklarasikan variabel
        String lampu;
        
        //cetak perintah variabel lampu dengan type data String menggunakan Scanner
        System.out.print("Masukkan warna lampu anda : ");
        lampu = input.nextLine();
        // Percabangan SWITCH/CASE sama dengan bentuk lain dari IF/ELSE/IF
        // kita cek variabel lampu
        switch(lampu) {
            // jika casenya sama dengan "merah" tampilkan "Lampu merah, berhenti" dan break
            case "merah" :
                System.out.println("Lampu merah, berhenti");
                break;
            // jika casenya sama dengan "kuning" tampilkan "Lampu kuning, harap hati-hati" dan break
            case "kuning" :
                System.out.println("Lampu kuning, harap hati-hati");
                break;
            // jika casenya sama dengan "hijau" tampilkan "Lampu hijau, silahkan jalan" dan break
            case "hijau" :
                System.out.println("Lampu hijau, silahkan jalan");
                break;
            // jika casenya sesuai dengan diatas maka tampilkan "Warna lampu salah" dan berakhir
            default:
                System.out.println("Warna lampu salah");
            
        }
    }
    
}
