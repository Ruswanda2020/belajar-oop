package progremmer.pelajar.application;

import progremmer.pelajar.data.CreatUserRequest;
import progremmer.pelajar.util.ValidationUtil;

public class RefletionApp {
    public static void main(String[] args) {

        CreatUserRequest request=new CreatUserRequest();

        request.setName("wanda");
        request.setPassword("indah");

        ValidationUtil.validateReflectio(request);
    }
}
