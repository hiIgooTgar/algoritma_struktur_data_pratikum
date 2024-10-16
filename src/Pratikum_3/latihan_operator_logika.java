package igo_if24c_pratikum_3;

public class latihan_operator_logika {

    public static void main(String[] args) {
       int bayar = 135000;
       boolean memberCard = false;
       boolean total = bayar >= 100000 && memberCard == false;
       total = !total;
        System.out.println(total);
    }
    
}
