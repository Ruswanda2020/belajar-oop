package progremmer.pelajar.AppkasirOOP;

public class Barang {
    //data-variabel
    private String namaBrg;
    private int hargaBrg;
    //method2
     void creatBarang(String nama,int harga){
       this.namaBrg=nama;
        this.hargaBrg=harga;

    }
    void readBarang(){
        System.out.println("nama barang  : "+namaBrg);
        System.out.println("harga barang : "+hargaBrg);
    }
    void updateBararang(int harga){
         this.hargaBrg=harga;
    }
    void removeBarang(){
         this.namaBrg=null;
         this.hargaBrg=0;
    }



}
