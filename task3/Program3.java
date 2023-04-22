package org.example.hw230420.task3;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;

public class Program3 {
    public static void main(String[] args) {
        List<Book> booksList = CreateBooksList();
        List<String> names = new ArrayList<>();
        for (Book nametitem : booksList) {
            if (nametitem.author.contains("А"))
                names.add(nametitem.name);
        }
        for (String nameitem : names) {
            for (Book booksitem : booksList) {
                if (booksitem.name.equals(nameitem) && isSimple(booksitem.pages) && booksitem.year >= 2010)
                    System.out.println(nameitem);
            }
        }
    }

    public static List<Book> CreateBooksList() {
        List<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Сердце Пармы", "Иванов", 714.0F, 2010, 576));
        booksList.add(new Book("Царь-рыба", "Астафьев", 310.0F, 2017, 383));
        booksList.add(new Book("Повести древних лет", "Иванов", 385.3F, 1986, 477));
        booksList.add(new Book("Золото бунта", "Иванов", 610.0F, 2021, 708));
        booksList.add(new Book("Таинственный остров", "Верн", 523.0F, 1983, 606));
        booksList.add(new Book("Сборник сказок", "Андерсен", 320.0F, 1984, 203));
        return booksList;
    }

    /**
     * @param num целое число
     * @return true если число простое, false если нет
     */
    public static boolean isSimple(int num) {
        if (num < 2)
            return false;
        double sq = sqrt(num);
        for (int i = 2; i <= sq; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
