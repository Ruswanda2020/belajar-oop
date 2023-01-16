package progremmer.pelajar.application;

import static progremmer.pelajar.data.Application2.PROCESSORS;
import static progremmer.pelajar.data.Constan.*;
import progremmer.pelajar.data.Country;
import progremmer.pelajar.util.MathUtil;

public class StaticaApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,2,3,4,5));

        Country.City city=new Country.City();
        city.setName("sukabumi");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);



    }
}
