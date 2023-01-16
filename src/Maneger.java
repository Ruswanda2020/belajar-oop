 class Maneger extends Employe{
     String Compeny;

    Maneger(String name){
        super(name);
    }
    Maneger(String name,String compeny){
        super(name);
        this.Compeny=compeny;
    }


    void sayHallo(String name){
        System.out.println("hallo"+" "+name+" "+"my name maneger"+" "+this.name);
    }
}
