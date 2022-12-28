package Homework6;

// Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
// Добавить пять элементов в множество.
// Отсортировать значения используя итератор.
// Отсортированный результат сохранить в LinkedHashSet
// Создать TreeSet с компаратором.
// Скопировать содержимое первого множества (HashSet) в TreeSet.
// *Скорректировать компаратор так, чтобы поля хранились в обратном порядке.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task {
    public static void main(String[] args) {
       
        HashSet<String> fruit = new HashSet<String>();
         
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("pear");
        fruit.add("peach");
        fruit.add("quince");        
        System.out.println(fruit);


        LinkedHashSet<String> arrFruit = new LinkedHashSet<>();
        Iterator<String> it = fruit.iterator();
        ArrayList<String> array = new ArrayList();
        while (it.hasNext()){
            array.add(it.next());
        }        
        Collections.sort(array);
        for (int i = 0; i < array.size(); i++) {
            arrFruit.add(array.get(i));
        }
        System.out.println(arrFruit);


        TreeSet<String> rFruit = new TreeSet<>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) { return 0;}
                if (o1.compareTo(o2) < 0) {return 1;}
                else return -1;
            }
        });

        rFruit.addAll(arrFruit);
        System.out.println(rFruit);
    }

        
}
