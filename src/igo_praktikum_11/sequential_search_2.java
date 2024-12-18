package igo_praktikum_11;
public class sequential_search_2 {

    public static void main(String[] args) {
        sequential_search_2 obj = new sequential_search_2(); // mendeklarasi name class
        obj.tampilkanData(); // memanggil method yaitu tampilkanData()
        obj.searching("pajero"); // memanggil method searching dengan mempunyai parameter
    }
    /* mendeklarasikan variabel, yaitu varibel allData yang bersifat array dengan tipe data String */
    String[] allData = new String[]{"Alya", "Jazz", "Splash", "Macrh", "H-RV", "Pajero"};
    private void tampilkanData() { // membuat method yaitu tampilkanData()
        /* Melakukan perulangan For Each yaitu membuat tipe data beserta elemenya adalah string data dan membuat kumpulan datanya yaitu dari 
        variabel allData yang bersifat array */
        for(String data : allData) {
            System.out.print(data + " "); // tampilkan variabel data
        }
        System.out.println("");
    }
     /* Membuat sebuah method dengan nama searching dengan mempunyai parameter yaitu karakter dengan tipe data String */
    private void searching(String karakter) {
        // mendeklarasikan variabel
        int x = 0;
        boolean ketemu = false;
         /* Misal nilai awalnya i = x; kondisionalnya adalah i kurang dari panjang array variabel allData; dan diiterasikan bertambahkan 1 / ++ increment*/
        for(int i = x; i < allData.length; i++) {
            // kita cek, jika karakter.equalsIgnoreCase(allData[i]) true maka jalankan perintah yaitu menginisialisasi variabel ketemu = true dan x = i
            /* Fungsi equalsIgnoreCase() ditujukan untuk membandingkan dua data bertipe string, apakah kedua data tersebut memiliki konten atau
            nilai yang sama dengan mengabaikan huruf besar dan kecilnya. */
            if(karakter.equalsIgnoreCase(allData[i])) {
                ketemu = true;
                x = i;
            }
        }
        // kita cek, jika variabel ketemu bersifat true maka tampilkan "Data berada pada urutan ke-" + (x+1) + ", indeks ke-" + x" jika tidak maka "Data tidak ditemukan"
        if(ketemu) {
            System.out.println("Data berada pada urutan ke-" + (x+1) + ", indeks ke-" + x);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
