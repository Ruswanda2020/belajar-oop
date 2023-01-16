package progremmer.pelajar.data;

public class Bus implements Car{
    public void drive(){
        System.out.println("bus drive");
    }

    public int gettire(){
        return 6;
    }
    public String getbrand() {
        return "hino";
    }

    public  boolean IsBig() {
        return true;
    }

}
