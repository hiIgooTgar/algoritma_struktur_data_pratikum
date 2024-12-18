package igo_praktikum_11;
public class quick_sort {
    /* Membuat sebuah method dengan nama quick_sort dengan mempunyai parameter yaitu arr dengan tipe data integer
    bersifat array dan low dengan tipe data integer serta high dengan tipe data integer */
    static void quick_sort(int[] arr, int low, int high) {
        if(low < high) { // cek, jika low kurang dari high maka lakukan inisialisasi variabel dan melakukan inisialiasi method quick_sort
            int pivotIndex = partition(arr, low, high);
            quick_sort(arr, low, pivotIndex - 1);
            quick_sort(arr, pivotIndex + 1, high);
        }
    }
    /* Membuat sebuah method dengan nama partition dengan mempunyai parameter yaitu arr dengan tipe data integer
    bersifat array dan low dengan tipe data integer serta high dengan tipe data integer */
    static int partition(int[] arr, int low, int high) {
        // melakukan inisialisasi variabel
        int pivot = arr[high];
        int i = low - 1;
         // syntax untuk melakukan sorting quick sort
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 6, 7, 3, 1, 15}; /* mendeklarasikan variabel, yaitu varibel arr yang bersifat array dengan tipe data integer */
        System.out.println("Original Array : ");
        printArrya(arr); // memanggil method printArray dengan mempunyai parameter 
        quick_sort(arr, 0, arr.length - 1); // memanggil method quick_sort dengan mempunyai parameter 
        System.out.println("");
        System.out.println("Sorted Array : ");
        printArrya(arr); // memanggil method printArray dengan mempunyai parameter 
    }
     /* Membuat sebuah method dengan nama printArray dengan mempunyai parameter yaitu arr dengan tipe data integer serta bersifat array */
    static void printArrya(int[] arr) {
         // syntax untuk menampilkan hasil array
        for(int value : arr) { 
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}