package progremmer.pelajar.data;

public class Mobilio implements Car{



    public void drive() {
        System.out.println("mobilio drive");
    }

    @Override
    public int gettire() {
        return 4;
    }


    public String getbrand() {
        return "toyota";
    }


}
