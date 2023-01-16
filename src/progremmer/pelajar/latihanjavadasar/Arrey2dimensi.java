package progremmer.pelajar.latihanjavadasar;

import java.util.Scanner;

public class Arrey2dimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan jumlah baris :");
        int baris = input.nextInt();
        System.out.print("masukan jumlah kolom :");
        int kolom = input.nextInt();

        int[][] barisan = new int[baris][kolom];
        for (int i=0;i<baris;i++) {
            for (int j=0;j<kolom;j++) {

                //kalo inputan yang kita inputkan genap
                if(baris % 2 ==0){
                    if(i%2==0){
                        barisan[i][j]=0;
                    }else {
                        barisan[i][j]=1;
                    }
                }else {
                    if(i%2==0){
                        barisan[i][j]=1;
                    }else {
                        barisan[i][j]=0;
                    }

                }
            }

        }
        //tampilkan
        for (int i=0; i < baris; i++){
            for (int j=0; j<kolom; j++){
                System.out.print(barisan[i][j]);
            }
            System.out.println();
        }








    }
}