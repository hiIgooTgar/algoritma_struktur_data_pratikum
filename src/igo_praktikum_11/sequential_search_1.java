package igo_praktikum_11;
import java.io.*; // import java io
        
public class sequential_search_1 {

    public static void main(String[] args) throws IOException {
        /* mendeklarasikan variabel, yaitu varibel data yang bersifat array dengan tipe data integer */
        int data[] = {8, 10, 6, -2, 11, 7, 1, 100};
        int cari, flag = 0; /* mendeklarasikan variabel*/
        
        /* Mendeklarasiklan perintah BufferedReader. BufferedReader adalah suatu Class di Java yang berfungsi untuk 
        menyederhanakan pembacaan teks dari suatu input stream (misalnya file). */       
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        // input data 
        System.out.print("Masukkan data yang ingin dicari : ");
        /* menginisialisasi variabel cari yaitu Integer.parseInt(in.readLine()) 
        parseInt(in.readLine()) perintah ini digunakan untuk mendapatkan tipe data primitif
        dari string tertentu. Dengan kata lain itu mengubah string menjadi angka. */
        cari = Integer.parseInt(in.readLine());
         /* Misal nilai awalnya i = 0; kondisionalnya adalah i kurang dari panjang array dari variabel data;
        dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = 0; i < data.length; i++) {
            // cek, jika variabel data[i] sama dengan variabel cari maka flag bernilai 1 atau true
            if(data[i] == cari) {
                flag = 1;
            }
        }
        // cek, jika variabel flag sama dengan 1 maka tampilkan "Data ditemukan" jika tidak maka "Data tidak ditemukan"
        if(flag == 1) {
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
