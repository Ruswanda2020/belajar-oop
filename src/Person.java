class Person {
    String name;
    String address;
    final String countery="indonesia";



//code di bawah andalah cara penulisan method cunstrakter
    Person(String parname,String paraddress) {
        name=parname;
        address=paraddress;

    }
    //--------------------------------------------

    Person(String parname){
       this(parname,null);
    }

    Person(){
        this(null);

    }

    void sayHallo(String parname){
        System.out.println("hallo"+" "+parname+" "+"my name is "+" "+this.name);
    }
}
