package progremmer.pelajar.application;
import progremmer.pelajar.data.BankSaya;

import java.util.Scanner;
public class BankMenu {
    public static void main(String[] args) {
        int ambil=0,simpan=0;
        Scanner pilih=new Scanner(System.in);
        BankSaya bank=new BankSaya(1000000);

        System.out.println("selamat datang di bank saya");
        for (int i=0; i<=1;i++){
            System.out.println("\n");
            System.out.println("  menu");
            System.out.println("1.cek saldo \n2.simpan uang \n3.ambil uang");
            System.out.println("pilih menu ATM");
            int menu=pilih.nextInt();
            if(menu==1){
                bank.simpanAwal();
            }else if(menu==2){
                System.out.println("masukan uang yang mau di simpan");
                bank.simpanUang(simpan);
            }else if(menu==3){
                System.out.println("masukan uang yang mau di ambil");
                bank.ambilUang(ambil);
            }else if(menu>3){
                System.out.println("manu tidak ada");
                System.out.println("ulangi pilihan ATM");
            }else
                break;
        }
    }
}
