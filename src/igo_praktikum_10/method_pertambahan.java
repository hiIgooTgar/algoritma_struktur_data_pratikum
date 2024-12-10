package igo_praktikum_10;

public class method_pertambahan {
    static double tambah(double value1, double value2) {
        double hasil = value1 + value2;
        return hasil;
    }
    
    public static void main(String[] args) {
        double jumlah = tambah(6, 2);
        System.out.println(jumlah);
        jumlah = tambah(jumlah, 4);
        System.out.println(jumlah);
        System.out.println(tambah(100, 100));
    }
}
