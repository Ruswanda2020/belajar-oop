package progremmer.pelajar.warungRegister;

public class Minuman {
    private String namaMinuman;
    private Integer hargaMinuman;

    public Minuman(String namaMinuman, Integer hargaMinuman) {
        this.namaMinuman = namaMinuman;
        this.hargaMinuman = hargaMinuman;
    }

    public String getNamaMinuman() {
        return namaMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }

    public Integer getHargaMinuman() {
        return hargaMinuman;
    }

    public void setHargaMinuman(Integer hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }

    @Override
    public String toString() {
        return "Minuman{" +
                "namaMinuman='" + namaMinuman + '\'' +
                ", hargaMinuman=" + hargaMinuman +
                '}';
    }
}
