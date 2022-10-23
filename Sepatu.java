public class Sepatu {
    
    String merk, warna;

    public Sepatu(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    void infoSepatu(){
        System.out.println("Merk\t\t: " + getMerk());
        System.out.println("Warna\t\t: " + getWarna());
    }
}
