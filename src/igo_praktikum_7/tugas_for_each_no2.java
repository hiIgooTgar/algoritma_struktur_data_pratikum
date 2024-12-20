package igo_praktikum_7;

public class tugas_for_each_no2 {

    public static void main(String[] args) {
        // mendeklarasikan variabel
        int angka = 1;
        
        // Berikut kode membuat Perulangan Do While
        // kita cetak perintah perulangan dahulu dan melakukan iterasinya
        // lalu lanjut yaitu kondisionalnya
        do{
            // mencetak perintah perulangan
            System.out.println("Perungan ke-" + angka + " | Do While" );
             // melakukan iterasikan bertambah 1 / ++ (increment)
            angka++;
        /* Misal nilai awalnya angka = 1; kondisionalnya adalah angka kurang dari sama dengan 10 */
        } while(angka <= 10);
    }
    
}
