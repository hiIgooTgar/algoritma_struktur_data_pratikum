package igo_pratikum_9;

public class pratikum_9_no_5 {

    public static void main(String[] args) {
          /* mendeklarasikan array dengan tipe data string dan nama variabel array nya adalah siswa 
        dengan panjang array 3 dan melakukan inisialisasi nilai awal */
        String[] siswa = {"Ahmad", "Samsul", "Chyntia"};
         /* mendeklarasikan array dengan tipe data integer dan nama variabel array nya adalah harga 
        dengan panjang array 4 dan melakukan inisialisasi nilai awal */
        int[] harga = {5000, 200, 450000, 3500};
         /* mendeklarasikan array dengan tipe data char dan nama variabel array nya adalah nilai 
        dengan panjang array 4 dan melakukan inisialisasi nilai awal */
        char[] nilai =  {'A', 'B', '$', '@'};
        
        System.out.println(siswa[0]); // cetak perintah array siswa yaitu index ke 0
        System.out.println(siswa[1]); // cetak perintah array siswa yaitu index ke 1
        System.out.println(harga[3]); // cetak perintah array harga yaitu index ke 3
        System.out.println(nilai[2]); // cetak perintah array nilai yaitu index ke 2
    } 
}
