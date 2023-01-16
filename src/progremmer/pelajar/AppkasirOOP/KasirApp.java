package progremmer.pelajar.AppkasirOOP;

public class KasirApp {
    static void header(){
        System.out.println("*************");
        System.out.println("toko furniture");
        System.out.println("**************");
    }
    public static void main(String[] args) {
        header();
        Barang brg=new Barang();
        brg.creatBarang("panci",55000);
        brg.readBarang();
        System.out.println("=========");
        brg.updateBararang(50000);brg.readBarang();
        brg.removeBarang();brg.readBarang();

    }
}
