package progremmer.pelajar.util;

import progremmer.pelajar.data.LoginReques;
import progremmer.pelajar.eror.BlankException;
import progremmer.pelajar.eror.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginReques loginReques) throws ValidationException,NullPointerException{
        if(loginReques.username() == null){
         throw new NullPointerException("username is not null");
        }else if(loginReques.username().isBlank()){
            throw new ValidationException("username is blank");
        } else if (loginReques.password()==null) {
            throw new NullPointerException("passwor is not null");
        } else if (loginReques.password().isBlank()) {
            throw new ValidationException("passwor is blank");
        }
    }

    public static void validateRuntime(LoginReques loginReques){
        if(loginReques.username() == null){
            throw new NullPointerException("username is not null");
        }else if(loginReques.username().isBlank()){
            throw new BlankException("username is blank");
        } else if (loginReques.password()==null) {
            throw new NullPointerException("passwor is not null");
        } else if (loginReques.password().isBlank()) {
            throw new BlankException("passwor is blank");
        }
    }
    public static void validateReflectio(Object object){
       Class aclass=object.getClass();
        Field[] fields=aclass.getDeclaredFields();

        for (Field field:fields){
            field.setAccessible(true);
            //validet
            try{
                String valu=(String) field.get(object);
                if (valu==null ||valu.isBlank()){
                    throw new BlankException("field"+field.getName()+"isBlank");
                }

            }catch (IllegalAccessException illegalAccessException){
                System.out.println("tidak bisa mengakses field"+illegalAccessException.getLocalizedMessage());
            }
        }

    }
}
