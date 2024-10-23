package igo_pratikum_4;

public class percabangan_ternary {

    public static void main(String[] args) {
        // membuat variabel yaitu suka tipe datanya boolean
        // dan jawaban dengan tipe datanya string
        boolean suka = true;
        String jawaban;
        
        // ini contoh jika menggunakan bercabangan ternary hanya bersifat 
        //true (1) cetak "Iya" dan false (0) cetakan tidak;
        jawaban =  suka ? "Iya" : "Tidak";
        
        // cetak variabel jawaban
        System.out.println("Jawaban anda : " + jawaban);
    }
    
}
