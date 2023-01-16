package progremmer.pelajar.warungRegister;

import java.util.Scanner;

public class ApplikasiWarung {
    public static void main(String[] args) {

        Makanan makanan=new Makanan("sate taican",20000);
        Pembeli pembeli=new Pembeli("wanda","bintaro");
        Scanner sc=new Scanner(System.in);
        int pilih=0,pilih2=0;

        do {
            System.out.println("warung sederana");
            System.out.println("1.makanan");
            System.out.println("2.pembeli");
            System.out.println("3.close");
            System.out.print("pilih : ");
            pilih=sc.nextInt();
            switch (pilih){
                case 1:
                    do {
                        System.out.println("    makanan");
                        System.out.println("    1.buat data");
                        System.out.println("    2.lihat data");
                        System.out.println("    3.ubah data");
                        System.out.println("    4.kembali");
                        System.out.print("pilih : ");
                        pilih2=sc.nextInt();
                        switch (pilih2){
                            case 1:
                                System.out.print("nama makanan : ");
                                String n=sc.next();
                                System.out.print("harga makanan : ");
                                Integer m=sc.nextInt();
                                makanan=new Makanan(n,m);
                                break;
                            case 2:
                                String t=makanan.toString();
                                System.out.println("manu : "+t);
                        }

                    }while (pilih2 !=4);

                    break;
                case 2:

                    break;
                case 3:


                    break;
                case 4:
                    System.out.println("<<<<TERIMAKASIH>>>");
                    break;

            }
        }while (pilih != 4);

    }
}
