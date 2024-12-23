package igo_praktikum_12;
import java.util.*; // import java util (all)

public class array_list_program {

    public static void main(String[] args) {
        // mendeklarasi ArrayList dengan nama arrli bertipe data Integer
        ArrayList <Integer> arrli = new ArrayList<>(); 
         /* Misal nilai awalnya i = 1; kondisionalnya adalah i kurang dari sama dengan 5;
        dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = 1; i <= 5; i++) {
            arrli.add(i); // cetak perintah arrli.add(i) 
        }
        System.out.println(arrli); // cetak perintah arrli
        arrli.remove(3); // hapus perintah arrli index ke 3
        System.out.println(arrli); // cetak perintah arrli
    }
}