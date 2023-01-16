package progremmer.pelajar.abstration;

public class Gajian extends Kariawan{
    private double gajih;

    @Override
    public double hitungGaji() {
        double cash;
        cash=gajih/52;

        return cash;
    }
}
