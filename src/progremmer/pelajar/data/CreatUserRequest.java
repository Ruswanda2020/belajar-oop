package progremmer.pelajar.data;

import progremmer.pelajar.Anotetion.Notblank;

public class CreatUserRequest {

    @Notblank
    private String name;

    @Notblank
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
