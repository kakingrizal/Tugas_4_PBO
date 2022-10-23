public class CelanaJeans extends Celana {
    
    String warna;

    public CelanaJeans(String jenis, int ukuran) {
        super(jenis, ukuran);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public void infoCelana(){
        super.infoCelana();
        System.out.println("Warna celana\t: " + getWarna());
    }
    
    public static void main(String[] args) {
        CelanaJeans celanaku = new CelanaJeans("Panjang", 36);
        celanaku.setWarna("Navy Blue");
        celanaku.infoCelana();
    }
}