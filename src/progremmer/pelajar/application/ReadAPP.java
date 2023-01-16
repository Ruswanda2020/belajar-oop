package progremmer.pelajar.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAPP {
    public static void main(String[] args) {


        try (BufferedReader reader=new BufferedReader(new FileReader("read.md"))){

            while (true){
                String line= reader.readLine();
                if (line==null){
                    break;
                }
                System.out.println(line);
            }

        }catch (Throwable throwable){
            System.out.println("eror membaca file"+throwable.getMessage());

        }
    }
}
