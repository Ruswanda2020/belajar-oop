package progremmer.pelajar.application;

import progremmer.pelajar.eror.DatabaseEror;

public class DataBaseApp {
    public static void main(String[] args) {
        conectDataBase("wanda", null);
        System.out.println("sukses");

    }

    public static void conectDataBase(String username,String password){
        if (username == null || password==null);
        throw new DatabaseEror("tidak bisa conet ke database");
    }
}
