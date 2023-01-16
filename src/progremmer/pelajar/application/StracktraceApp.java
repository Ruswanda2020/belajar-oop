package progremmer.pelajar.application;

public class StracktraceApp {
    public static void main(String[] args) {

        try {
            String[] name={
                    "wanda","dirgantara","oktavian"
            };
            System.out.println(name[100]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceelemens=throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }
}
