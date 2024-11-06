package igo_pratikum_6;

public class loopingWhileFirst {

    public static void main(String[] args) {
        // mendeklarasian variabel
        int i = 0;
        
        /* Misal nilai awalnya i = 0, kondisionalnya adalah i kurang dari 5; dan diiterasikan bertambahkan 1 */
        while(i < 5) {
            // Cetak perulangan sebanyak perintah kondisionalnya yaitu 5
            System.out.println("Perulangan ke " + i + " While");
            // dan diiterasikan bertambahkan 1 / ++(incerement)
            i++;
        }
    }
    
}
