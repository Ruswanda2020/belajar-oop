package progremmer.pelajar.data;

public class Persegi extends BangunDatar{
  public int sisi;
  public Persegi(int sisi){
      this.sisi=sisi;
  }

    @Override
    public float luas() {

        return this.sisi*sisi;
    }

    @Override
    public float keliling() {
        return this.sisi*4;
    }
}
