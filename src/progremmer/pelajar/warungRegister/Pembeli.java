package progremmer.pelajar.warungRegister;

public class Pembeli {
    private String nama;
    private  String alamat;

    public Pembeli() {
    }

    public Pembeli(String nama,String alamat) {
        this.nama=nama;
        this.alamat=alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setUsia(String alamat) {
        this.alamat=alamat;
    }

    public String keString(){
        return "nama : "+nama+ " usia : "+alamat;
    }
}
