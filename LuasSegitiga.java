public class LuasSegitiga {
    
    int hitungLuas(int a, int t){
        return a * t / 2;
    }
    
    double hitungLuas(double a, double t){
        return (double) (a * t / 2);
    }
    
    public static void main(String[] args) {
        LuasSegitiga hitung = new LuasSegitiga();
        int hasil1 = hitung.hitungLuas(9, 10);
        System.out.println("Hasil Luas segitiga method pertama = " + hasil1);
        double hasil2 = hitung.hitungLuas(5, 8);
        System.out.println("Hasil Luas segitiga method kedua   = " + hasil2);
        
    }
}
