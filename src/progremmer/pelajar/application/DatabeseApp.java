package progremmer.pelajar.application;

import progremmer.pelajar.eror.DatabaseEror;

public class DatabeseApp {
    public static void main(String[] args) {
        Databaseconnet("wanda","wandi");
        System.out.println("sukses");

    }

    public static void Databaseconnet(String username,String password){
        if(username == null || password ==null){
            throw new  DatabaseEror("tidak bisa conet ke database");
        }
    }
}
