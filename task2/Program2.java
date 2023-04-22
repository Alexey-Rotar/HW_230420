package org.example.hw230420.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        float minPrice = 0;
        List<Product> productList = CreateProductBase();
        List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        String searchGrade = sc.nextLine();

        for (Product productitem : productList) {
            if (productitem.grade == Integer.parseInt(searchGrade))
                if (!names.contains(productitem.name))
                    names.add(productitem.name);
        }

        for (String nameitem : names) {
            for (Product productitem : productList) {
                if (productitem.name.equals(nameitem))
                    if (minPrice == 0 || minPrice > productitem.price)
                        minPrice = productitem.price;
            }
            System.out.println(nameitem + "\t" + minPrice);
            minPrice = 0;
        }
    }

    public static List<Product> CreateProductBase() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Пшеница", "Россия", 10.3F, 9.4F, 1));
        productList.add(new Product("Пшеница", "Беларусь", 10.6F, 8.1F, 1));
        productList.add(new Product("Пшеница", "Казахстан", 10.6F, 9.8F, 1));
        productList.add(new Product("Ячмень", "Россия", 12.4F, 7.0F, 3));
        productList.add(new Product("Солод", "Армения", 9.9F, 8.2F, 1));
        productList.add(new Product("Хлопок", "Туркменистан", 2.3F, 4.4F, 2));
        productList.add(new Product("Хлопок", "Узбекистан", 2.6F, 3.0F, 2));
        productList.add(new Product("Хлопок", "Пакистан", 2.4F, 2.9F, 2));
        productList.add(new Product("Фасоль", "Азербайджан", 12.5F, 4.0F, 3));
        productList.add(new Product("Рожь", "Россия", 14.1F, 5.5F, 1));
        productList.add(new Product("Овёс", "Россия", 13.3F, 4.7F, 2));
        return productList;
    }
}
