package progremmer.pelajar.latihanoop.oopanrtrianbank;

import java.util.Scanner;

public class AntrianApp {
    public static void main(String[] args) {

        int menu;

        Scanner input=new Scanner(System.in);
        LinkedList ll=new LinkedList();

        System.out.println("\t\t=======================================================");
        System.out.println("\t\t\t\t\tselamat datang di bank danamon  ");
        System.out.println("\t\t\t\t\tmenyediakan pelayanan");
        System.out.println("\t\t========================================================");

        do {
            System.out.println("\n\n");
            System.out.println("\t\t\t\tpilih menu  :");
            System.out.println("\t\t\t\t1. pengambilan nomer antri");
            System.out.println("\t\t\t\t2. penggilan nomer antrian");
            System.out.println("\t\t\t\t3. lihat  data antrian");
            System.out.println("\t\t\t\t4. keluar");
            System.out.println("\t\t\t\t");
            System.out.print("\t\t\t\tpilihan anda :");
            menu= input.nextInt();
            if (menu==1){
                ll.enqueue();
            }else if(menu==2) {
                ll.denqueue();
            }else if(menu==3){
                ll.view();
            } else if (menu==4) {
                System.out.println("\n\t\t\t\tterimakasih ");
            }else {
                System.out.println("\n\t\t\t\tperhatikan data yang di inputkan ");
            }

        }while (menu !=4);


    }
}
