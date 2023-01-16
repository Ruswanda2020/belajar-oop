package progremmer.pelajar.interfaces;

public class Mamel implements Animal{

    @Override
    public void makan() {
        System.out.println("mamalia mulai makan");
    }

    @Override
    public void bergerak() {
        System.out.println("mamel mulai bergerak");
    }
}
