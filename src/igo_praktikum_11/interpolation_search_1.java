package igo_praktikum_11;
public class interpolation_search_1 {
    /* Membuat sebuah method/constructor dengan nama interpolation_search_1 dengan mempunyai parameter yaitu 
    arr dengan tipe data integer serta bersifat array dan x dengan tipe data integer */
    public static int interpolation_search_1(int[] arr, int x ) {
         // mendeklarasikan variabel dan melakukan inisialisasi nilai variabel
        int low = 0;
        int high = arr.length - 1;
        /* kondisionalnya adalah low kurang dari sama dengan high dan x lebih dari sama dengan arr[low] dan 
        x kurang dari sama dengan arr[high] */
        while(low <= high && x >= arr[low] && x <= arr[high]) {
            int pos = low + ((x - arr[low]) * (high - low) / (arr[high] - arr[low])); // inisialisasi variabel pos
            if(arr[pos] == x) {  // cek, jika variabel arr[pos] sama dengan x maka
                return pos; // kembalikan variabel pos
            } else if(arr[pos] < x) { // atau jika arr[pos] < x) maka
                low = pos + 1; // lakukan inisialisasi low = pos + 1; 
            } else { // jika tidak maka
                high = pos - 1; // lakukan inisialisasi high = pos - 1; 
            }
        }
        return -1; // kembalikan -1
    }
    
    public static void main(String[] args) {
         // mendeklarasikan variabel dan melakukan inisialisasi nilai variabel
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchValue = 6;
        //  inisialisasi variabel result dengan memanggil method/constructor interpolation_search_1 dengan mempunyai parameter
        int result = interpolation_search_1(array, searchValue); 
        /* cek, jika variabel result tidak sama dengan -1 maka tampilkan ("Nilai " + searchValue + " ditemukan di indeks " + result)
        jika tidak maka tampilkan ("Nilai " + searchValue + " tidak ditemukan dalam array")*/
        if(result != -1) {
            System.out.println("Nilai " + searchValue + " ditemukan di indeks " + result);
        } else {
            System.out.println("Nilai " + searchValue + " tidak ditemukan dalam array");
        }
    }
    
}
