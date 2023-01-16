package progremmer.pelajar.application;

import progremmer.pelajar.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company=new Company();
        company.setName("perogremmer pelajar");

        Company.Employe employe=company.new Employe();
        employe.setName("wanda");

        System.out.println(employe.getName());
        System.out.println(employe.getcompeny());

        Company company1=new Company();
        company1.setName("progremmer pelajar2");

        Company.Employe employe1=company1.new Employe();
        employe1.setName("dika");

        System.out.println(employe1.getName());
        System.out.println(employe1.getcompeny());
    }
}
