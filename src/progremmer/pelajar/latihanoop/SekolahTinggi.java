package progremmer.pelajar.latihanoop;

public class SekolahTinggi extends Kampus{
    private String name;
    private String alamat;
    private String jenis;


    public SekolahTinggi(){
        System.out.println("===sekolah tinggi===");
    }


    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenis() {
        return jenis;
    }
}
