package igo_praktikum_12;
import java.util.*; // import java util (all)

public class arraylist_linkedlist {

    public static void main(String[] args) {
        // mendeklarasi LinkedList dengan nama object bertipe data String
        LinkedList <String> object = new LinkedList<>();
        
        object.add("A"); // menambahkan perintah add array yaitu "A" Index ke 0
        object.add("B"); // menambahkan perintah add array yaitu "B" Index ke 1
        // menambahkan perintah addLast array yaitu "C" Index ke n / terakhrir
        object.addLast("C"); 
        
        System.out.println(object); // cetak variabel object 
        // hapus perintah variabel object yaitu pada value yang mempunyai nilai "B" 
        object.remove("B"); 
        // hapus perintah variabel object pada index ke pertama array
        object.removeFirst(); 
        // cetak variabel object 
        System.out.println("Linked list setelah operasi deletion : " + object);
    }
}