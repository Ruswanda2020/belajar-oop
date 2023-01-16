package progremmer.pelajar.application;

import progremmer.pelajar.latihanoop.*;

public class KampusApp {
    public static void main(String[] args) {

        Kampus kampus = new Kampus();
        SekolahTinggi sk = new SekolahTinggi();
        sk.setName("sekolah tinggi ilmu tato");
        sk.setAlamat("jl.cinyumput raya");
        sk.setJenis("suasta");

        System.out.println(sk.getName());
        System.out.println(sk.getAlamat());
        System.out.println(sk.getJenis());
        System.out.println("=====================");

        Istitut istitut=new Istitut();
        istitut.setName("insitut teknologi komputer");
        istitut.setAlamat("jl.cinyumput kidul no 23");
        istitut.setJenis("negri");

        System.out.println(istitut.getName());
        System.out.println(istitut.getAlamat());
        System.out.println(istitut.getJenis());
        System.out.println("================");

        Politeknik politeknik=new Politeknik();
        politeknik.setName("POLITEKNIK STIZ");
        politeknik.setAlamat("jl.raya sukaaku");
        politeknik.setJenis("NEGRI");

        System.out.println(politeknik.getName());
        System.out.println(politeknik.getAlamat());
        System.out.println(politeknik.getJenis());
        System.out.println("====================");

        Universitas universitas=new Universitas();
        universitas.setName("unpam");
        universitas.setAlamat("jl.viktor");
        universitas.setJenis("suasta");

        System.out.println(universitas.getName());
        System.out.println(universitas.getAlamat());
        System.out.println(universitas.getJenis());



    }
}