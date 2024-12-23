package igo_praktikum_12;
import java.util.LinkedList; // import LinkedList

public class linked_list_delete_element {

    public static void main(String[] args) {
        // mendeklarasi LinkedList dengan nama fruit bertipe data String
        LinkedList <String> fruit = new LinkedList<>();
        
        fruit.add("Jeruk"); // cetak perintah add array yaitu "Jeruk" Index ke 0
        fruit.add("Jambu"); // cetak perintah add array yaitu "Jambu" Index ke 1
        fruit.add("Apel"); // cetak perintah add array yaitu "Apel" Index ke 2
        fruit.add("Melon"); // cetak perintah add array yaitu "Melon" Index ke 3
        fruit.add("Semangka"); // cetak perintah add array yaitu "Semangka" Index ke 4
        
        // hapus perintah fruit pada index ke pertama array
        fruit.removeFirst();
        // hapus perintah fruit pada index ke terakhir array
        fruit.removeLast();
        // hapus perintah fruit pada index 1 array
        fruit.remove(1);
        System.out.println(fruit); // cetak perintah fruit
    }
}