package progremmer.pelajar.application;

import progremmer.pelajar.data.Mobil;

public class MobilApp {
    public static void main(String[] args) {

        var mobil=new Mobil();
        mobil.pelatnumber="q223";
        mobil.manufature="avansa";
        mobil.color="silver";
        mobil.speed=95;

        mobil.start();
        mobil.stop();

        System.out.println();


    }
}
