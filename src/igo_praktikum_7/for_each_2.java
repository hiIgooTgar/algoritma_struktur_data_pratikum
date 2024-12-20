package igo_praktikum_7;
// import ArrayList
import java.util.ArrayList;

/* Penjelasan ArrayList
ArrayList adalah java class yang digunakan untuk melakukan penyimpanan 
data berupa list Object berbentuk array yang ukurannya dapat berubah secara dinamis 
sesuai dengan jumlah data yang kita masukkan. */

public class for_each_2 {

    public static void main(String[] args) {
        // mendeklarasikan arrayList dengan tipe data String
        // dengan nama daftarNama
        ArrayList<String> daftarNama = new ArrayList<>();
        // Menambahkan data arrayList menggunakan add
        daftarNama.add("Alice");
        daftarNama.add("Bob");
        daftarNama.add("Charlie");
        
        // Melakukan perulangan For Each yaitu membuat tipe data beserta elemenya
        // yaitu String nama dan membuat kumpulan datanya yaitu dari variabel 
        // daftarNama yang bersifat array/arrayList
        for(String nama : daftarNama) {
            // Cetak perintah variabel nama
            System.out.println(nama);
        }
    }
    
}
