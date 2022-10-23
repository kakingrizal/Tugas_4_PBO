public class LuasPersegi {
    
    int hitungLuas(int s){
        return s * s;
    }
    
    double hitungLuas(double s){
        return (double) (s * s);
    }
    
    public static void main(String[] args) {
        LuasPersegi hasil = new LuasPersegi();
        int hasil1 = hasil.hitungLuas(5);
        double hasil2 = hasil.hitungLuas(8);
        System.out.println("Hasil Luas Persegi method pertama = " + hasil1);
        System.out.println("Hasil Luas Persegi method kedua   = " + hasil2);
    }
}
