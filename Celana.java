public class Celana {
    
    String jenis;
    int nomer;

    public Celana(String jenis, int ukuran) {
        this.jenis = jenis;
        this.nomer = ukuran;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis_bahan(String jenis_bahan) {
        this.jenis = jenis_bahan;
    }

    public int getNomer() {
        return nomer;
    }

    public void setUkuran(int ukuran) {
        this.nomer = ukuran;
    }
    
    void infoCelana(){
        System.out.println("Jenis Celana\t: " + getJenis());
        System.out.println("Nomer Celana\t: " + getNomer());
    }
}
