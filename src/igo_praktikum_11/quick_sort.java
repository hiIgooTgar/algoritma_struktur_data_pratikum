package igo_praktikum_11;

public class quick_sort {

    static void quick_sort(int[] arr, int low, int high) {
        if(low < high) {
            int pivotIndex = partition(arr, low, high);
            quick_sort(arr, low, pivotIndex - 1);
            quick_sort(arr, pivotIndex + 1, high);
        }
    }
    
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
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
        int[] arr = {12, 4, 5, 6, 7, 3, 1, 15};
        
        System.out.println("Original Array : ");
        printArrya(arr);
        
        quick_sort(arr, 0, arr.length - 1);
        System.out.println("");
        
        System.out.println("Sorted Array : ");
        printArrya(arr);
    }
    
    static void printArrya(int[] arr) {
        for(int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
    
}
