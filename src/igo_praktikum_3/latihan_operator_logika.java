package igo_praktikum_3;

public class latihan_operator_logika {

    public static void main(String[] args) {
       int bayar = 135000;
       boolean memberCard = false;
       
       /* value keduanya ini bernilai true
        karena variabel bayar(135000) lebih besar sama dengan 100000 
        dan juga variabel memberCard sama dengan false atau 0
       */
       boolean total = bayar >= 100000 && memberCard == false;
       
       // variabel total dinegasi mejadi !total
       total = !total;
       System.out.println(total);
    }
    
}
