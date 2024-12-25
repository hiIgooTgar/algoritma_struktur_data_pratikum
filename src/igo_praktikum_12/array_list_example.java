package igo_praktikum_12;
public class array_list_example {

    public static void main(String[] args) {
        int[] anArray; // deklarasi variabel yang bersifat array dengan tipe data integer
        anArray = new int[10]; // menginisialisasi anArray dengan panjang array 10
        
        // menginisialisasi variabel anArray dari index ke 0 - 9
        anArray[0] = 100; // 
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        
        // cetak hasil variabel anArray dari index ke 0 - 9
        System.out.println("Element index ke 0 :" + anArray[0]);
        System.out.println("Element index ke 1 :" + anArray[1]);
        System.out.println("Element index ke 2 :" + anArray[2]);
        System.out.println("Element index ke 3 :" + anArray[3]);
        System.out.println("Element index ke 4 :" + anArray[4]);
        System.out.println("Element index ke 5 :" + anArray[5]);
        System.out.println("Element index ke 6 :" + anArray[6]);
        System.out.println("Element index ke 7 :" + anArray[7]);
        System.out.println("Element index ke 8 :" + anArray[8]);
        System.out.println("Element index ke 9 :" + anArray[9]);
    }
}