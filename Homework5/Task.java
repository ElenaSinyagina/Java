package Homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Task {

    static ArrayList<String> firstName = new ArrayList<>();
    static ArrayList<String> secondName = new ArrayList<>();
    static ArrayList<String> patronymic = new ArrayList<>();
    static ArrayList<Integer> ageLst = new ArrayList<>();
    static ArrayList<Boolean> sexLst = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();
    public static void main(String[] args) {

        HashMap<Integer, String> doc = new HashMap<>();
        doc.put(1, "Иванова Ольга Петровна 65 ж");
        doc.put(2, "Кукушкина Юлия Сергеевна 35 ж");
        doc.put(3, "Комаров Андрей Николаевич 51 м");
        doc.put(4, "Колесников Александр Сергеевич 28 м");
        doc.put(5, "Карягина Екатерина Александровна 37 ж");
        
        System.out.println("Список:");
        outDoc(doc);
        System.out.println();
        // №3
        System.out.println("Изменить значения сделав пол большой буквой:");
        uppercaseSex(doc);
        System.out.println();
        // №4
        System.out.println("Пройти по коллекции и вывести значения в формате Фамилия инициалы 'Иванов И.И.':");
        uppercaseInitials(doc);
        System.out.println();
        // №5
        // ages(); 

    }

    
    static void outDoc(HashMap<Integer, String> doc){
        doc.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    static void uppercaseSex(HashMap<Integer, String> doc){
        for (Integer key: doc.keySet()){          
            String str = doc.get(key);
            int index = str.length() - 1;
            char ch = Character.toUpperCase(str.charAt(index));
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(index, ch);
            str = sb.toString();
            doc.put(key, str);
        }
        outDoc(doc);
    }

    static void uppercaseInitials(HashMap<Integer, String> doc){
        for (Integer key: doc.keySet()){
            String[] str = doc.get(key).split(" ");
            System.out.println(
                key + " " + str[0] 
                + " " + Character.toUpperCase(str[1].charAt(0)) + "."
                + " " + Character.toUpperCase(str[2].charAt(0)) + "."
                + " " + str[3] + " " + str[4]);
        }
    }
    

}
