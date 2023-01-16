package progremmer.pelajar.application;

import progremmer.pelajar.data.HalloWoeld;

public class HalloWorldApp {
    public static void main(String[] args) {

        HalloWoeld englis=new HalloWoeld() {
            @Override
            public void SayHallo() {
                System.out.println("hallo");
            }

            @Override
            public void SayHallo(String name) {
                System.out.println("hallo"+name);
            }
        };

        HalloWoeld indonesia=new HalloWoeld() {
            @Override
            public void SayHallo() {
                System.out.println("halo");
            }

            @Override
            public void SayHallo(String name) {
                System.out.println("halo"+name);
            }
        };

        englis.SayHallo();
        englis.SayHallo("wanda");

        indonesia.SayHallo();
        indonesia.SayHallo("fahmi");
    }
}
