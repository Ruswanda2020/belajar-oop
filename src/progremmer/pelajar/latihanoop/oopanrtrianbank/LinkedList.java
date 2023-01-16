package progremmer.pelajar.latihanoop.oopanrtrianbank;

public class LinkedList {
    public DataPenjualan head,tail;

   public LinkedList(){
        head=null;
        tail=null;
    }

    public void enqueue(){

       DataPenjualan dt=new DataPenjualan();
       dt.input();
       if(head==null)
           head=dt;
       else
           tail.next=dt;
       tail=dt;
    }

    public void denqueue(){
       if (head==null){
           System.out.println("\n\t\t\t\tdata kosong!!!");
       }else {
           System.out.println("\n\t\t\t\tnomor antrian dengan id : "+head.id+"\n\t\t\t\tatas nama :"+head.nama);
           head=head.next;
       }
    }

    public void view(){
       if (head==null){
           System.out.println("\n\t\t\t\tdata kosong!!!!");
       }else {
           System.out.println("\n\t\t\t\t====================================================");
           System.out.println("\t\t\t\t|| id \t\t|| nama \t\t\t|| keperluan \t||");
           for (DataPenjualan a=head; a!=null; a=a.next)a.read();
           System.out.println("\n\t\t\t\t=====================================================");
       }
    }



}
