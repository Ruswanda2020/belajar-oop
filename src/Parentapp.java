public class Parentapp {
    public static void main(String[] args) {
        Child child=new Child();
        child.name="wanda";
        child.Doit();
        System.out.println(child.name);

        Parent parent=(Parent) child;
        parent.Doit();
        System.out.println(parent.name);

    }
}
