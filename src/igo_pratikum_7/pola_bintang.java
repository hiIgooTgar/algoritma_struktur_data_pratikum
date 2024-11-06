package igo_pratikum_7;

public class pola_bintang {

    public static void main(String[] args) {
        // mendeklarasikan variabel
        int rows = 5;
         /* Misal nilai awalnya i = 1; kondisionalnya adalah i kurang dari sama dengan
        variabel rows; dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = 1; i <= rows; i++) {
            /* Misal nilai awalnya j = 1; kondisionalnya adalah j kurang dari sama dengan 
            variabel i; dan diiterasikan bertambahkan 1 / ++ increment*/
            for(int j = 1; j <= i; j++) {
                 // Cetak perintah
                System.out.print("* ");
            }
             // Cetak perintah
            System.out.println();
        }
    }
}
