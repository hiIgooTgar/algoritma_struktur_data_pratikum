package igo_pratikum_9;

public class pratikum_9_array_2 {

    public static void main(String[] args) {
         /* mendeklarasikan array dua dimensi dengan tipe data integer dan nama 
        variabel array nya adalah matrix, dengan panjang array pertama 3 dan 
        panjang array kedua 3 */
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        /* Misal nilai awalnya i = 0; kondisionalnya adalah i kurang dari 3;
        dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = 0; i < 3; i++) {
            /* Misal nilai awalnya j = 0; kondisionalnya adalah j kurang dari 3;
            dan diiterasikan bertambahkan 1 / ++ increment*/
            for(int j = 0; j < 3; j++) {
                // cetak perintah array dua dimensi
                System.out.print(matrix[i][j] + " " );
            }
                System.out.println("");
        }
    }
    
}
