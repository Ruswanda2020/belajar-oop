package progremmer.pelajar.application;

import progremmer.pelajar.data.LoginReques;
import progremmer.pelajar.eror.ValidationException;
import progremmer.pelajar.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginReques loginReques=new LoginReques("","wanda223");

        try {
            ValidationUtil.validate(loginReques);
            System.out.println("data valid");
        }catch (ValidationException| NullPointerException exception){
            System.out.println("data yang ada masukan tidak valid : "+exception.getMessage());
        }

        finally {
            System.out.println("selalu di eksekusi");
        }

       LoginReques loginReques1=new LoginReques("ruswanda","wanda");
        ValidationUtil.validateRuntime(loginReques1);
        System.out.println("sukses");

    }
}
