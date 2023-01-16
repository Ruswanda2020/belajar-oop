package progremmer.pelajar.interfaces;

public class KebunBinatang {
    public static void main(String[] args) {

        Mamel hewan = new Mamel();
        hewan.makan();
        hewan.bergerak();

        System.out.println(hewan.JENIS);
    }
}