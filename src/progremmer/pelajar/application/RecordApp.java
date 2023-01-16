package progremmer.pelajar.application;

import progremmer.pelajar.data.LoginReques;

public class RecordApp {
    public static void main(String[] args) {

        LoginReques loginReques=new LoginReques("wanda","25wanda");

        System.out.println(loginReques.username());
        System.out.println(loginReques.password());
    }
}
