package igo_pratikum_5;
import java.util.Scanner; // import Scanner
public class tugas_pratikum_5_no5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // mendeklarasikan scanner
        // mendeklarasikan variabel
        double harga_produk;
        int jumlah_pembelian;
        double diskon;
        double total_harga;
        System.out.print("Masukkan harga produk : "); // cetak perintah variabel harga_produk dengan type data Double menggunakan Scanner
        harga_produk = input.nextDouble();
        System.out.print("Masukkan jumlah pembelian : "); // cetak perintah variabel jumlah_pembelian dengan type data Integer menggunakan Scanner
        jumlah_pembelian = input.nextInt();
        // kita cek, jika jumlah_pembelian lebih dari 10 maka kita eksekusi
        if(jumlah_pembelian > 10) {
            /* jika jumlah_pembelian lebih dari 10 dan harga_produk lebih dari 100000 maka mendapatkan diskon 15% */
            if(harga_produk > 100000) { 
                diskon = harga_produk * jumlah_pembelian * 0.15;
            /* jika jumlah_pembelian lebih dari 10 dan harga_produk kurang dari 100000 maka mendapatkan diskon 10% */
            } else {
                diskon = harga_produk * 0.1 * jumlah_pembelian;
            }
        } else {
            /* jika jumlah_pembelian kurang dari 10 dan harga_produk lebih dari 50000 maka mendapatkan diskon 5% */
             if(harga_produk > 50000) {
                diskon = harga_produk * 0.05 * jumlah_pembelian;
            /* (else) jika jumlah_pembelian kurang dari 10 dan harga_produk kurang dari 50000 maka mendapatkan diskon 2% */
            } else {
                diskon = harga_produk * 0.02 * jumlah_pembelian;
            }
        }
        // variabel total_harga rumuskan dengan harga_produk dikali jumlah_pembelian dikurangin diskon
        total_harga = (harga_produk * jumlah_pembelian) - diskon;
        // cetak total harga dengan memanggil variabel total_harga
        System.out.println("Total harga anda : " + (int) total_harga);
    }
}
