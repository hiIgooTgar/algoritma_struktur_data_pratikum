package igo_praktikum_11;
public class insertion_sort {
    /* Membuat sebuah method dengan nama insertion_sort dengan mempunyai parameter yaitu arr dengan tipe data integer serta bersifat array */
    public static void insertion_sort(int[] arr) {
        int n = arr.length;  // melakukan inisialisasi variabel
         // syntax untuk melakukan sorting insertion sort
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while(j >= 0 && arr[j] > key)  {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
    }
    /* Membuat sebuah method dengan nama printArray dengan mempunyai parameter yaitu arr dengan tipe data integer serta bersifat array */
    public static void printArry(int[] arr) {
        int n = arr.length; // melakukan inisialisasi variabel
        // syntax untuk menampilkan hasil array
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6}; /* mendeklarasikan variabel, yaitu varibel arr yang bersifat array dengan tipe data integer */
        System.out.println("Array sebelum diurutkan : ");
        printArry(arr); // memanggil method printArray dengan mempunyai parameter 
        insertion_sort(arr); // memanggil method insertion_sort dengan mempunyai parameter 
        System.out.println("Array setelah diurutkan : ");
        printArry(arr); // memanggil method printArray dengan mempunyai parameter 
    }
}