package progremmer.pelajar.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product=new Product("indomie",3000);
        System.out.println(product);

     Product product1=new Product("indomie",3000);

        System.out.println(product.equals(product1));
        System.out.println(product.hashCode()==product1.hashCode());

    }
}
