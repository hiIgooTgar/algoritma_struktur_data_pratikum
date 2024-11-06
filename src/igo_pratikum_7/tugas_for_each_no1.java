package igo_pratikum_7;

public class tugas_for_each_no1 {

    public static void main(String[] args) {
        /* dibawah ini adalah array dan cara buat kode arraynya. Apa yang dimaksud dengan array?
        Array merupakan kumpulan data yang memiliki tipe data yang sama. 
        tiap data tersebut di bedakan dengan index dalam array tersebut, 
        index dari tiap array dimulai dari [0]. Singkatnya Array mampu menyimpan banyak data 
        dalam satu variabel
        */
        String[] item = {"Java", "C++", "C", "Javascript", "PHP", "Laravel", "ReactJS", "NodeJS"};
        
        // Melakukan perulangan For Each yaitu membuat tipe data beserta elemenya
        // yaitu String value dan membuat kumpulan datanya yaitu dari variabel item yang bersifat array
        for(String value : item) {
            // Cetak perintah variabel item
            System.out.println(value);
        }
    }
    
}
