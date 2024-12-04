package igo_pratikum_9;

public class pratikum_9_tugas_no_1 {

    public static void main(String[] args) {
           /* mendeklarasikan array dengan tipe data string dan nama variabel array 
        nya adalah siswa dengan panjang array 3 dan melakukan inisialisasi nilai awal */
         String[] siswa = {"Ahmad", "Badrun", "Chyntia"};
         siswa[1] = "Badrun"; // Mengubah isi array siswa yaitu index ke 1 dengan "Badrun"
         
         // Melakukan perulangan For Each yaitu membuat tipe data beserta elemenya
        // adalah string value dan membuat kumpulan datanya yaitu dari variabel siswa yang bersifat array
         for(String value : siswa) {
             System.out.println(value);
         }
    }
    
}
