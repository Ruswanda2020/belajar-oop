package progremmer.pelajar.data;

import java.util.Scanner;

public class BankSaya {
    int saldo;
    Scanner masukan=new Scanner(System.in);

    public BankSaya(int saldo){
        this.saldo=saldo;
    }

    public void simpanAwal(){
        System.out.println("saldo awal anda "+saldo);
    }
    public void simpanUang(int simpan){
        simpan=masukan.nextInt();
        saldo=saldo+simpan;
        System.out.println("saldo anda saat ini adalah "+saldo);

    }

    public void ambilUang(int ambil){
        ambil=masukan.nextInt();
        if (saldo <=ambil){
            System.out.println("maaf saldo anda kurang!!!!!!!!!");
        }else{
            saldo=saldo-ambil;
            System.out.println("saldo saat ini adalah "+saldo);

        }
    }

}
