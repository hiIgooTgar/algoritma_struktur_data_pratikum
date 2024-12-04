package igo_pratikum_9;

public class pratikum_9_no_2 {

    public static void main(String[] args) {
        /* mendeklarasikan array dengan tipe data string dan
         nama variabel array nya adalah siswa dengan panjang array 3 */
        String[] siswa;
        siswa = new String[3];
        
        siswa[0] = "Ahmad"; // mendeklarasikan array siswa yaitu index ke 0
        siswa[1] = "Samsul"; // mendeklarasikan array siswa yaitu index ke 1
        siswa[2] = "Chynita"; // mendeklarasikan array siswa yaitu index ke 2

        System.out.println(siswa[0]); // cetak perintah array siswa yaitu index ke 0
        System.out.println(siswa[1]); // cetak perintah array siswa yaitu index ke 1
        System.out.println(siswa[2]); // cetak perintah array siswa yaitu index ke 2
    }
    
}
