package progremmer.pelajar.latihanoop;

public class Politeknik extends Kampus{
    private String name;
    private String alamat;
    private  String jenis;

    public Politeknik(){
        System.out.println("===politeknik===");
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

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
