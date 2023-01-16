 class Parent {
    String name;
    void Doit(){
        System.out.println("do it from parent");
    }
}

class Child extends Parent{
    String name;


    void Doit() {
        String name;
        System.out.println("do it from chiled");
        System.out.println("parent is "+super.name);
    }
}

