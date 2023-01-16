package progremmer.pelajar.data;

public interface Car extends Hasbrand{
    void drive();

    int gettire();

    public default boolean  IsBig() {
        return false;
    }
    
}
