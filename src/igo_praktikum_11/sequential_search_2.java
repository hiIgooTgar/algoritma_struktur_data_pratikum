package igo_praktikum_11;

public class sequential_search_2 {

    public static void main(String[] args) {
        sequential_search_2 obj = new sequential_search_2();
        
        obj.tampilkanData();
        
        obj.searching("pajero");
    }
    
    String[] allData = new String[]{"Alya", "Jazz", "Splash", "Macrh", "H-RV", "Pajero"};
    private void tampilkanData() {
        for(String data : allData) {
            System.out.print(data + " ");
        }
        System.out.println("");
    }
    
    private void searching(String karakter) {
        int x = 0;
        boolean ketemu = false;
        for(int i = x; i < allData.length; i++) {
            if(karakter.equalsIgnoreCase(allData[i])) {
                ketemu = true;
                x = i;
            }
        }
        
        if(ketemu) {
            System.out.println("Data berada pada urutan ke-" + (x+1) + ", indeks ke-" + x);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    
}
