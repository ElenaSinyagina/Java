package Homework3;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        // Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        List <String> spices = new ArrayList<>();
        spices.add("перец");
        spices.add("имбирь");
        spices.add("куркума");
        spices.add("кардамон");
        spices.add("кориандр");
        spices.add("гвоздика");
        spices.add("чеснок");
        System.out.println(spices);

        // Итерация всех элементов списка цветов и добавления к каждому символа '!'.

        for (int i = 0; i < spices.size(); i++) {
            spices.set(i, spices.get(i) + "!");
            
        }
        System.out.println(spices);

        // Вставить элемент в список в первой позиции.

        spices.add(0, "анис!");
        System.out.println(spices);

        // Извлечь элемент (по указанному индексу) из заданного списка.

        System.out.println(spices.get(5));

        // Обновить определенный элемент списка по заданному индексу.

        spices.set(4, "паприка!");
        System.out.println(spices);

        // Удалить третий элемент из списка.

        spices.remove(3);
        System.out.println(spices);

        // Поиска элемента в списке по строке.

        if (spices.contains("чеснок!")){
            System.out.println(spices.indexOf("чеснок!"));
        }
        else System.out.println("Не найдено");

        // Создать новый список и добавить в него несколько элементов первого списка.

        ArrayList<String> spices2 = new ArrayList<String>();
        spices2.addAll(0, spices.subList(0, 4));
        System.out.println(spices2);

        // Удалить из первого списка все элементы отсутствующие во втором списке.

        spices.retainAll(spices2);
        System.out.println(spices);

        
    }
}
