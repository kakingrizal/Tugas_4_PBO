public class Baju {
    String warna;
    String jenis_lengan;
    
    public Baju(String warna, String lengan){
        this.warna = warna;
        this.jenis_lengan = lengan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getJenis_lengan() {
        return jenis_lengan;
    }

    public void setJenis_lengan(String jenis_lengan) {
        this.jenis_lengan = jenis_lengan;
    }
    
    void infoBaju(){
        System.out.println("Warna baju\t: " + getWarna());
        System.out.println("lengan baju\t: " + getJenis_lengan());
    }
}