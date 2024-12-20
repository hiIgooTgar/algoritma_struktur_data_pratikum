package igo_praktikum_9;

public class praktikum_9_no_6 {

    public static void main(String[] args) {
          /* mendeklarasikan array dengan tipe data string dan nama variabel array 
        nya adalah siswa dengan panjang array 3 dan melakukan inisialisasi nilai awal */
        String[] siswa = {"Ahmad", "Samsul", "Chyntia"};
        
        siswa[1] = "Badrun"; // Mengubah isi array siswa yaitu index ke 1 dengan "Badrun"
        System.out.println(siswa[0]); // cetak perintah array siswa yaitu index ke 0
        System.out.println(siswa[1]); // cetak perintah array siswa yaitu index ke 1
        System.out.println(siswa[2]); // cetak perintah array siswa yaitu index ke 2
    }
}
