package progremmer.pelajar.application;

import progremmer.pelajar.data.BangunDatar;
import progremmer.pelajar.data.Lingkaran;
import progremmer.pelajar.data.Persegi;
import progremmer.pelajar.data.Segitiga;

public class BangunDatarApp {
    public static void main(String[] args) {

        BangunDatar bangunDatar=new BangunDatar();
        Persegi persegi=new Persegi(10);
        Segitiga segitiga=new Segitiga(2,4);
        Lingkaran lingkaran=new Lingkaran(4);

        //memangil method luas dan keliling
        persegi.luas();
        persegi.keliling();

        System.out.println(bangunDatar.luas());
        System.out.println(bangunDatar.keliling());

        System.out.println("luas persegi adalah :"+" "+persegi.luas());
        System.out.println("keliling persegi adalah :"+" "+persegi.keliling());
        System.out.println("luas segi tiga adalah : "+segitiga.luas());
        System.out.println("luas lingkaran adlah :"+lingkaran.luas());
        System.out.println("keliling lingkaran asalah :"+lingkaran.keliling());




    }
}
