package igo_pratikum_5;

public class operator_logika_1 {

    public static void main(String[] args) {
        // mendeklarasikan variabel
        boolean SIM = false;
        boolean STNK = true;
        
        // kita cek, jika kita punya SIM/bernilai true(1) dan punya STNK/bernilai true(1)
        // maka tampilkan "Anda tidak ditilang!"
        if(SIM == true && STNK == true) {
            System.out.println("Anda tidak ditilang!");
        // jika tidak(else), kita tidak punya SIM/bernilai false(0) dan tidak punya STNK/bernilai false(0)
        // atau jika diantaranya memiliki bernilai false baik di Variabel SIM maupun STNK
        // maka tampilkan "Anda kena ditilang!"
        } else {
            System.out.println("Anda kena ditilang!");
        }
    }
    
}
