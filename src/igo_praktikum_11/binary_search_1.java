package igo_praktikum_11;
public class binary_search_1 {

    public static void main(String[] args) {
         /* mendeklarasikan variabel, yaitu varibel nilai yang bersifat array dengan tipe data integer */
        int[] nilai = {66, 77, 80, 84, 88, 99, 100};
        binarySearchInt(nilai, 77);  // memanggil method binarySearchInt dengan mempunyai parameter
    }
    /* Membuat sebuah method dengan nama binarySearchInt dengan mempunyai parameter yaitu angka dengan tipe data integer serta
    bersifat array dan key dengan tipe data integer */
    public static void binarySearchInt(int[] angka, int key) {
        int low = 0, high = angka.length-1, median; // mendeklarasikan variabel dan melakukan inisialisasi nilai variabel
        boolean status = false;
        while(low <= high) { /* Misal nilai awalnya low = 0; kondisionalnya adalah low kurang dari sama dengan high */
            median = (low + high)/2; // melakukan inisialiasi variabel
            // cek, jika variabel key sama dengan angka[median]) maka
            if(key == angka[median]) {
                // tampilkan perintah (key + " ditemukan pada posisi ke-" + (median+1) + " dan pada indeks ke-" + median)
                System.out.println(key + " ditemukan pada posisi ke-" + (median+1) + " dan pada indeks ke-" + median); 
                status = true; // status menjadi true
                break; // dan lakukan break
            } else {
                 // cek, jika variabel key lebih dari angka[median]) maka
                if(key > angka[median]) {
                    low = median + 1; // lakukan inisialisasi low = median + 1
                } else {
                    high = median - 1; // jika tidak // lakukan inisialisasi high = median - 1
                }
            }
        }
        if(status == false) { // cek, jika variabel status sama dengan false/0 maka tampilkan (key + " tidak ditemukan dalam array")
            System.out.println(key + " tidak ditemukan dalam array");
        }
    } 
}
