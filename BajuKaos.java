public class BajuKaos extends Baju {
    
    String ukuran;
    
    public BajuKaos(String warna, String lengan){
        super(warna, lengan);
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    
    public void infoBaju(){
        super.infoBaju();
        System.out.println("Ukuran baju\t: " + getUkuran());
    }
    
    public static void main(String[] args) {
        BajuKaos kaos = new BajuKaos("hitam" , "pendek");
        kaos.setUkuran("XL");
        kaos.infoBaju();
    }
}
