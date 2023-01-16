public class shape {

    int getCorner(){
        return 0;
    }
}

class Rectengel extends shape{
    int getCorner(){
        return 4;
    }

    int getParenCorner(){
        return super.getCorner();
    }
}

