package igo_pratikum_7;

public class matriks {

    public static void main(String[] args) {
         /* dibawah ini adalah array dan cara buat kode arraynya. Apa yang dimaksud dengan array?
        Array merupakan kumpulan data yang memiliki tipe data yang sama. 
        tiap data tersebut di bedakan dengan index dalam array tersebut, 
        index dari tiap array dimulai dari [0]. Singkatnya Array mampu menyimpan banyak data 
        dalam satu variabel. namun kode dibawah ini mengandung array di dalam array
        */
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // penjelasan : length digunakan untuk menentukan panjang atau ukuran arra
        /* Misal nilai awalnya i = 0; kondisionalnya adalah i kurang dari variabel matrix.length;
        dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = 0; i < matrix.length; i++) {
            /* Misal nilai awalnya j = 0; kondisionalnya adalah j kurang dari variabel matrix.length;
            dan diiterasikan bertambahkan 1 / ++ increment */
            for(int j = 0; j < matrix.length; j++) {
                // Cetak perintah variabel matrix
                System.out.print(matrix[i][j] + " ");
            }
            // Cetak perintah
            System.out.println();
        }
    }
    
}
