package progremmer.pelajar.application;

import progremmer.pelajar.Anotetion.Fancy;
import progremmer.pelajar.data.Car;
import progremmer.pelajar.data.Mobilio;

@Fancy(name = "carApp",tegs = {"aplication","java"})
public class CarApp {
    public static void main(String[] args) {
        Car car = new Mobilio();
        System.out.println(car.gettire());
        car.drive();
    }
}