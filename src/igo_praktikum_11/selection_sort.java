package igo_praktikum_11;
public class selection_sort {
     /* Membuat sebuah method dengan nama selectionSort dengan mempunyai parameter yaitu arr dengan tipe data integer serta bersifat array */
    static void selectionSort(int[] arr) {
        int n = arr.length; // melakukan inisialisasi variabel
        // syntax untuk melakukan sorting selection sort
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
     /* Membuat sebuah method dengan nama printArray dengan mempunyai parameter yaitu arr dengan tipe data integer serta bersifat array */
    static void printArray(int[] arr) {
         // syntax untuk menampilkan hasil array
        for(int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Array sebelum diurutkan : ");
        printArray(arr);
        
        selectionSort(arr);
        
        System.out.println("Array setelah diurutkan : ");
        printArray(arr);
    }
    
}
