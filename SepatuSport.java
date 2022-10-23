public class SepatuSport extends Sepatu{
    
    int nomer;
    String tempat_dibuat;

    public SepatuSport(String merk, String warna) {
        super(merk, warna);
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getTempat_dibuat() {
        return tempat_dibuat;
    }

    public void setTempat_dibuat(String tempat_dibuat) {
        this.tempat_dibuat = tempat_dibuat;
    }
    
    public void infoSepatu(){
        super.infoSepatu();
        System.out.println("Nomer\t\t: " + getNomer());
        System.out.println("Tempat dibuat\t: " + getTempat_dibuat());
    }
    
    public static void main(String[] args) {
        SepatuSport sepatuku = new SepatuSport("Adidas", "Putih");
        sepatuku.setNomer(42);
        sepatuku.setTempat_dibuat("Made in Indonesia");
        sepatuku.infoSepatu();
    }
}
