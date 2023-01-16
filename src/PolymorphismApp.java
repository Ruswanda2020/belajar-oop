public class PolymorphismApp {
    public static void main(String[] args) {

        Employe employe=new Employe("WANDA");
        employe.sayHallo("adi");

        employe =new Maneger("WANDA");
        employe.sayHallo("adi");

        employe =new VicePersident("WANDA");
        employe.sayHallo("adi");

        sayHallo(new Employe("WANDA"));
        sayHallo(new Maneger("WANDA"));
        sayHallo(new VicePersident("WANDA"));
    }


    //cara mengonfersi tipe data

    static void sayHallo(Employe employe){
        if(employe instanceof VicePersident){
            VicePersident vp=(VicePersident) employe;
            System.out.println("halo vp" + vp.name);
        } else if (employe instanceof Maneger) {
            Maneger mg=(Maneger) employe;
            System.out.println("halo maneger" + mg.name);

        }else {
            System.out.println("halo" + employe.name);
        }

    }
}
