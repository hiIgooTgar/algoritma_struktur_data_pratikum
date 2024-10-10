package pratikum_2;

public class vaiabel_tipe_data {
   
    public static void main(String[] args) {
        
        
        System.out.println("== Type data in Java ==");
        System.out.println("");
        
        String typeData[] = {"Integer", "String", "Char", "Double", "Float", "Boolean", "Konstanta"};
        
        int a = 1;
        System.out.println(a + " type data is " + typeData[0]);
        
        String b = "Igo Tegar";
        System.out.println(b + " type data is " + typeData[1]);
        
        char c = 'I';
        System.out.println(c + " type data is " + typeData[2]);
        
        double d = 15/4;
        System.out.println(d + " type data is " + typeData[3]);
        
        float e = (float) 3.1;
        System.out.println(e + " type data is " + typeData[4]);
        
        boolean f = false;
        System.out.println(f + " type data is " + typeData[5]);
        
        final int g = 100;
        System.out.println(g + " type data is " + typeData[0] + " but it is constant");
        
        
    }
    
}
