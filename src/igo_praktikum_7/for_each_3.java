package igo_praktikum_7;

public class for_each_3 {

    public static void main(String[] args) {
        // mendeklarasikan variabel
        String kata = "Java";
        
        /* Melakukan perulangan For Each yaitu membuat tipe data beserta elemenya
         yaitu char huruf dan membuat kumpulan datanya yaitu dari variabel kata. namum 
         terdapat sintax toCharArray(). Metode toCharArray() tersedia di kelas 
         String dan menyediakan cara mudah untuk mengonversi 
         setiap karakter dalam string menjadi elemen array. */
        for(char huruf : kata.toCharArray()) {
            // Cetak perintah variabel huruf
            System.out.println(huruf);
        }
    }
    
}
