package igo_pratikum_7;

public class for_each_1 {
    
    public static void main(String[] args) {
         /* dibawah ini adalah array dan cara buat kode arraynya. Apa yang dimaksud dengan array?
        Array merupakan kumpulan data yang memiliki tipe data yang sama. 
        tiap data tersebut di bedakan dengan index dalam array tersebut, 
        index dari tiap array dimulai dari [0]. Singkatnya Array mampu menyimpan banyak data 
        dalam satu variabel.
        */
        int[] angka = {1, 2, 3, 4, 5};
        
        // Melakukan perulangan For Each yaitu membuat tipe data beserta elemenya
        // yaitu int nilai dan membuat kumpulan datanya yaitu dari variabel angka yang bersifat array
        for(int nilai : angka ){
            // Cetak perintah variabel nilai
            System.out.println(nilai);
        }
    }
    
}
