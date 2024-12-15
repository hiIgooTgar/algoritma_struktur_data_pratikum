package igo_pratikum_6;

public class loopingWhileThird {

    public static void main(String[] args) {
        // mendeklarasian variabel
        int i = 1;
        
        /* Misal nilai awalnya i = 1; kondisionalnya adalah
        i kurang dari sama dengan 5 */
        while(i <= 5) {
            /* Cetak perulangan sebanyak perintah kondisionalnya
            yaitu kurang dari sama dengan 5 */
            System.out.println("Perulangan ke " + i + " | While");
            // dan diiterasikan bertambahkan 1 / ++ (incerement)
            i++;
        }
    }
    
}
