package igo_praktikum_12;
import java.util.LinkedList; // import LinkedList

public class linked_list_select_element {

    public static void main(String[] args) {
        // mendeklarasi LinkedList dengan nama fruit bertipe data String
        LinkedList <String> fruit = new LinkedList<>();
        
        fruit.add("Jeruk"); // cetak perintah add array yaitu "Jeruk" Index ke 0
        fruit.add("Jambu"); // cetak perintah add array yaitu "Jambu" Index ke 1
        fruit.add("Apel"); // cetak perintah add array yaitu "Apel" Index ke 2
        fruit.add("Melon"); // cetak perintah add array yaitu "Melon" Index ke 3
        fruit.add("Semangka"); // cetak perintah add array yaitu "Semangka" Index ke 4
        
        // cetak perintah fruit.getFirst() yaitu array index ke pertama
        System.out.println("Data teratas : " + fruit.getFirst());
        // cetak perintah fruit.getLast() yaitu array index ke terakhir
        System.out.println("Data terbawah : " + fruit.getLast());
        // cetak perintah fruit.get(1) yaitu array index ke 1
        System.out.println("Data noIndex 1 : " + fruit.get(1));
        // cetak perintah fruit.get(3) yaitu array index ke 3
        System.out.println("Data noIndex 3 : " + fruit.get(3));
    }
}