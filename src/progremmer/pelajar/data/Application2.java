package progremmer.pelajar.data;

public class Application2 {
    public static final int PROCESSORS;

    static {
        System.out.println("mengakses class application");
        PROCESSORS=Runtime.getRuntime().availableProcessors();
    }
}
