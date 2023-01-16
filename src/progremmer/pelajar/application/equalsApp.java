package progremmer.pelajar.application;

public class equalsApp {
    public static void main(String[] args) {

        String first="wanda";
        first=first+" "+"oktavian";

        System.out.println(first);

        String second="wanda oktavian";
        System.out.println(second);

        System.out.println(first.equals(second));

        String three="wanda oktavian";
        System.out.println(second.equals(three));
    }
}
