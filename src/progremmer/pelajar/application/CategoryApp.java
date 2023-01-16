package progremmer.pelajar.application;

import progremmer.pelajar.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category=new Category();
        category.setId("id");
        category.setId(null);
        System.out.println(category.getId());
    }
}
