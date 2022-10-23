public class LuasLingkaran {
    
    int hitungLuas(int r, double phi){
        return (int) (phi * r * r);
    }
    
    double hitungLuas(double r, double phi){
        return (double) (phi * r * r);
    }
    
    public static void main(String[] args) {
        LuasLingkaran hasil = new LuasLingkaran();
        int hasil1 = hasil.hitungLuas(10, 3.14);
        double hasil2 = hasil.hitungLuas(14, 3.14);
        System.out.println("Hasil Luas Lingkaran method pertama = " + hasil1);
        System.out.println("Hasil Luas Lingkaran method kedua   = " + hasil2);
    }
    
}
