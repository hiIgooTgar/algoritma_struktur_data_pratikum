package igo_praktikum_6;

public class tugas_looping_no2 {

    public static void main(String[] args) {
        // mendeklarasian variabel
        int angka = 0;
        
        /* Misal nilai awalnya angka = 0;, kondisionalnya adalah angka kurang dari 10 */
        while(angka < 10) {
            // Cetak perulangan sebanyak perintah kondisionalnya yaitu kurang dari 10
            System.out.println("Angka ke-" + angka);
            // dan diiterasikan bertambahkan 1 / ++ (incerement)
            angka++;
        }
    }
    
}
