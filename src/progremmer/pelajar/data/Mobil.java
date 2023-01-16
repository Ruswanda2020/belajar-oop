package progremmer.pelajar.data;

public class Mobil {
 public    String pelatnumber;
public     String color;
public     String manufature;
 public    int speed;

   public void start(){
        System.out.println("mobil dengan no pelat"+pelatnumber+"tipe"+manufature+"dan dengan warna"+color+"sudah melaju");
        System.out.println("dengan kecepatan"+speed+"km/j");
    }

   public void stop() {
       if (speed >= 80) {
           System.out.println("pelankan kendaran");
       }


   }
}
