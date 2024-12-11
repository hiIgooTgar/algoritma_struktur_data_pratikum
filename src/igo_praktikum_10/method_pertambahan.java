package igo_praktikum_10;

public class method_pertambahan {
    /* Membuat sebuah method dengan nama tambah dengan mempunyai 
    parameter yaitu value1 dengan tipe data double dan value2 dengan
    tipe data double */
    static double tambah(double value1, double value2) {
        // dengan inisialisasi hasil = value1 ditambah value2
        double hasil = value1 + value2;
        return hasil; // kembalikan variabel hasil
    }
    
    public static void main(String[] args) {
        /* Mendeklarasikan variabel dan juga memanggil method tambah dengan 
        parameter value1 yaitu 6 dan value2 yaitu 2*/
        double jumlah = tambah(6, 2);
        System.out.println(jumlah); // tampilkan jumlah
        // menambahkan operasi yang diatasanya dari 8 + 4
        jumlah = tambah(jumlah, 4); 
        System.out.println(jumlah); // tampilkan jumlah
        /*memanggil method tambah dengan parameter value1 yaitu 100 dan value2 
        yaitu 100 serta langsung ditampilkan */
        System.out.println(tambah(100, 100));
    }
}
