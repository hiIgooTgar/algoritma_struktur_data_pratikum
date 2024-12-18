package igo_praktikum_11;

public class insertion_sort {

    public static void insertion_sort(int[] arr) {
        int n = arr.length;
        
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
    
    public static void printArry(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        
        System.out.println("Array sebelum diurutkan : ");
        printArry(arr);
        
        insertion_sort(arr);
        
        System.out.println("Array setelah diurutkan : ");
        printArry(arr);
    }
    
}
