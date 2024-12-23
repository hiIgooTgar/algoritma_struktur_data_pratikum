package igo_praktikum_12;
import java.util.LinkedList; // import LinkedList

public class linkedin_list_statements {

    public static void main(String[] args) {
        // mendeklarasi LinkedList dengan nama barang bertipe data String
        LinkedList <String> barang = new LinkedList<>();
         
        barang.add("Laptop"); // cetak perintah add array yaitu "Laptop" Index ke 0
        barang.add("Komputer"); // cetak perintah add array yaitu "Komputer" Index ke 1
        barang.add("Radio"); // cetak perintah add array yaitu "Radio" Index ke 2
        
        // kita cek, jika data array yaitu barang kosong maka
        if(barang.isEmpty()) {
            System.out.println("Data kosong"); // tampilkan "Data kosong"
        } else {
            System.out.println("Data penuh"); // jika tidak maka "Data penuh"
        }
        
        // kita cek, jika data array yaitu barang mempunyai value "Komputer" maka
        if(barang.contains("Komputer")) {
            // tampilkan "Barang ditemukan"
            System.out.println("Barang ditemukan");
        } else {
            // jika tidak maka "Barang tidak ditemukan"
            System.out.println("Barang tidak ditemukan");
        }
    }
}