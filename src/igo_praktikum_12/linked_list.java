package igo_praktikum_12;
import java.util.LinkedList; // import LinkedList

public class linked_list {

    public static void main(String[] args) {
        // mendeklarasi LinkedList dengan nama fruit bertipe data String
        LinkedList <String> fruit = new LinkedList<>();
        
        fruit.add("Jeruk"); // cetak perintah add array yaitu "Jeruk" Index ke 0
        fruit.add("Jambu"); // cetak perintah add array yaitu "Jambu" Index ke 1
        fruit.add("Apel"); // cetak perintah add array yaitu "Apel" Index ke 2
        fruit.add("Melon"); // cetak perintah add array yaitu "Melon" Index ke 3
        fruit.add("Semangka"); // cetak perintah add array yaitu "Semangka" Index ke 4
        fruit.add("Nanas"); // cetak perintah add array yaitu "Nanas"); " Index ke 5
        fruit.add("Sirsak"); // cetak perintah add array yaitu "Sirsak" Index ke 6
        
        System.out.println("Saya suka makan buah " + fruit); // cetak variabel fruit 
        // cetak variabel fruit.size() yaitu jumlah count panjang array atau variabel fruit
        System.out.println("Di rumah saya setiap harinya menyediakan " + fruit.size() + " macam buah-buahan");
    }
}