package upwork.andri.productlisting.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String desc;
    private String imagePath;

    public Product(String name, String imagePath) {
        this.name = name;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public static List<Product> createProductItems() {
        ArrayList<Product> items = new ArrayList<>();

        String[] itemNames = {"The Great Healthy Fruit", "Meat With Vegetables Plate", "Sizzling Burger & French Fries",
                              "Italian Delicious Pizza", "Classic Muffin"};

        for (int i = 0; i < itemNames.length; i++) {
            items.add(new Product(itemNames[i], "product_" + (i+1)));
        }

        return items;
    }
}
