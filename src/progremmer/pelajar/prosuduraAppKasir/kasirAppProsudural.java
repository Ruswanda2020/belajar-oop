package progremmer.pelajar.prosuduraAppKasir;

//umkm -> kasir
//subjek :pembeli,barang,pemilik,warung
//fokus ke barang dulu


public class kasirAppProsudural {
    //data-variabel
     static String namaBrg;
     static int hargaBrg;
    //method2
    static void isiBrg(String nama,int harga){
       namaBrg=nama;
       hargaBrg=harga;

    }
    static void lihatBrg(){
        System.out.println("nama barang  : "+namaBrg);
        System.out.println("harga barang : "+hargaBrg);
    }
    static void header(){
        System.out.println("*************");
        System.out.println("toko furniture");
        System.out.println("**************");
    }
    public static void main(String[] args) {

        header();
        isiBrg("ember",20000);
        lihatBrg();

    }
}
