package igo_pratikum_9;

public class pratikum_9_array_3 {

    public static void main(String[] args) {
         /* mendeklarasikan array tiga dimensi dengan tipe data integer dan nama 
        variabel array nya adalah cube, dengan panjang array pertama 3 dan 
        panjang array kedua 2 serta panjang array ketiga 2 */
        int[][][] cube = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}, {{9, 10},{11, 12}}};
         
        /* Misal nilai awalnya i = 0; kondisionalnya adalah i kurang dari 3;
        dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = 0; i < 3; i++) {
            /* Misal nilai awalnya j = 0; kondisionalnya adalah i kurang dari 3;
        dan diiterasikan bertambahkan 1 / ++ increment*/
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
