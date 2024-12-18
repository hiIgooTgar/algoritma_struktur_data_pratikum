package igo_praktikum_11;

public class binary_search_1 {

    public static void main(String[] args) {
        int[] nilai = {66, 77, 80, 84, 88, 99, 100};
        binarySearchInt(nilai, 77);
    }
    
    public static void binarySearchInt(int[] angka, int key) {
        int low = 0, high = angka.length-1, median;
        boolean status = false;
        while(low <= high) {
            median = (low + high)/2;
     
            if(key == angka[median]) {
                System.out.println(key + " ditemukan pada posisi ke-" + (median+1) + " dan pada indeks ke-" + median);
                status = true;
                break;
            } else {
                if(key > angka[median]) {
                    low = median + 1;
                } else {
                    high = median - 1;
                }
            }
        }
        
        if(status == false) {
            System.out.println(key + " tidak ditemukan dalam array");
        }
    }
    
    
    
}
