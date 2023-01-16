package progremmer.pelajar.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            String[] names = {
                    "wanda", "ari", "abang"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElement = throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }
}