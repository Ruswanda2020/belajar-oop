package progremmer.pelajar.latihanjavadasar;
import java.util.ArrayList;

public class AreyList {
    public static void main(String[] args) {

        ArrayList<String> food=new ArrayList<String>();
        food.add("pizza");
        food.add("balabala");
        food.add("gehu");

        food.set(0,"sate padang");
        food.remove(2);
        food.clear();

         for (int i=0; i<food.size();i++){
             System.out.println(food.get(i));

        }


    }



}
