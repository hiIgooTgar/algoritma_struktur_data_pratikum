package igo_praktikum_3;

public class operator_ternary {

    public static void main(String[] args) {
            boolean suka = true;
            String jawaban;
            String java = "Apakah kamu suka sama Bahasa Java = ";
            
            // Apakah kamu suka sama Bahasa Java ? jika true tampilan suka
            // jika false maka tampilan tidak
            jawaban = suka ? "suka" : "tidak";
            System.out.println(java + jawaban);
    }
    
}
