package igo_praktikum_11;
public class bubble_sort {
    /* Membuat sebuah method dengan nama swap dengan mempunyai parameter yaitu arr dengan tipe data integer serta
    bersifat array dan i dengan tipe data integer serta j dengan tipe data integer */
    private static void swap(int[] arr, int i, int j) {
        // melakukan inisialisasi variabel
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /* Membuat sebuah method dengan nama bubbleSort dengan mempunyai parameter yaitu arr dengan tipe data integer serta bersifat array */
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // melakukan inisialisasi variabel
        // syntax untuk melakukan sorting bubble sort
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    /* Membuat sebuah method dengan nama printArray dengan mempunyai parameter yaitu arr dengan tipe data integer serta bersifat array */
    private static void printArray(int[] arr) {
        // syntax untuk menampilkan hasil array
        for(int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};  /* mendeklarasikan variabel, yaitu varibel arr yang bersifat array dengan tipe data integer */
        System.out.println("Array sebelum sorting");
        printArray(arr); // memanggil method printArray dengan mempunyai parameter 
        bubbleSort(arr); // memanggil method bubbleSort dengan mempunyai parameter
        System.out.println("Array setelah sorting");
        printArray(arr); // memanggil method printArray dengan mempunyai parameter
    }
    
}
