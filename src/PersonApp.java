public class PersonApp {
    public static void main(String[] args) {

        var person1=new Person("Ruswanda","sukabumi");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.countery);

        person1.sayHallo("sahrul");



        Person person2=new Person("dika");
        person2.sayHallo("vito");

        Person person3;
        person3=new Person();
        person3.name="joko";

        person3.sayHallo("fahmi");
    }
}
