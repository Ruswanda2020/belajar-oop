package progremmer.pelajar.warungRegister;

public class Makanan {
    private String namaMakanan;
    private Integer hargaMakanan;

    public Makanan(String namaMakanan, Integer hargaMakanan) {
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public Integer getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(Integer hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    @Override
    public String toString() {
        return "Makanan{" +
                "namaMakanan='" + namaMakanan + '\'' +
                ", hargaMakanan=" + hargaMakanan +
                '}';
    }
}
