package progremmer.pelajar.data;

public class Lingkaran extends BangunDatar{
    Integer r;

    public Lingkaran(Integer r){
        this.r=r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI*r*r);
    }

    @Override
    public float keliling() {
        return (float) (2*Math.PI*r);
    }
}
