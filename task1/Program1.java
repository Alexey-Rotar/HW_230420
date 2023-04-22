package org.example.hw230420.task1;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        float maxPrice = 0;
        List<Product> productList = CreateProductBase();
        for (Product item : productList) {
            if (item.name.contains("высший") && ((item.grade == 1) || (item.grade == 2)))
                if (item.price > maxPrice)
                    maxPrice = item.price;
        }
        System.out.println("Наибольшая цена: " + maxPrice);
    }

    public static List<Product> CreateProductBase() {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product("Сахар высший сорт", 11.0F, 1));
        productList.add(new Product("Мука высший с-т", 10.3F, 2));
        productList.add(new Product("Макароны", 3.3F, 1));
        productList.add(new Product("Мука сорт высший", 10.0F, 1));
        productList.add(new Product("Масло подсолнечное", 15.0F, 1));
        productList.add(new Product("Сахар свекловичный сорт высший", 20.4F, 0));
        productList.add(new Product("Сахар тросниковый сорт высший", 15.7F, 1));
        return productList;
    }
}
