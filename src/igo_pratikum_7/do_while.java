package igo_pratikum_7;

public class do_while {

    public static void main(String[] args) {
        // mendeklarasi variabel
        int i = 1;
        
        // Berikut kode membuat Perulangan Do While
        // kita cetak perintah perulangan dahulu dan melakukan iterasinya
        // lalu lanjut yaitu kondisionalnya
        do {
            // mencetak perintah perulangan
            System.out.println("Iterasi ke-" + i);
            // melakukan iterasikan bertambah 1 / ++ (increment)
            i++;
         /* Misal nilai awalnya i = 1; kondisionalnya adalah i kurang dari sama dengan 5 */
        } while(i <= 5);
    }
    
}
