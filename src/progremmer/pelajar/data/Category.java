package progremmer.pelajar.data;

public class Category {
    private String id;
    private Boolean exvensive;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id != null){
        this.id = id;
    }
    }

    public Boolean isExvensive() {
        return exvensive;
    }

    public void setExvensive(Boolean exvensive) {
        this.exvensive = exvensive;
    }
}
