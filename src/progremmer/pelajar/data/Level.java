package progremmer.pelajar.data;

public enum Level {

    STANDAR("standar level"),
    PREMIUM("premium level"),
    VIP("vip level");
    private String description;

    Level(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }

}
