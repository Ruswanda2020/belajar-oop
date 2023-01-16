package progremmer.pelajar.application;

import progremmer.pelajar.data.Custamer;
import progremmer.pelajar.data.Level;

public class EnumApp {
    public static void main(String[] args) {


        Custamer custamer=new Custamer();
        custamer.setName("wanda");
        custamer.setLevel(Level.PREMIUM);


        System.out.println(custamer.getName());
        System.out.println(custamer.getLevel());
        System.out.println(custamer.getLevel().getDescription());

        String levelnum=Level.VIP.name();
        System.out.println(levelnum);

        Level level=Level.valueOf("VIP");
        System.out.println(level);

        System.out.println("print level");
        for (var value:Level.values()){
            System.out.println(value);
        }
    }
}
