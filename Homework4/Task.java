package Homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Task {

    static ArrayList<String> firstName = new ArrayList<>();
    static ArrayList<String> secondName = new ArrayList<>();
    static ArrayList<String> patronymic = new ArrayList<>();
    static ArrayList<Integer> ageLst = new ArrayList<>();
    static ArrayList<Boolean> sexLst = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();

    static void age() {
        int asd = linkedlist.size()-1;
        while (asd > -1) {
            int max_age = ageLst.get(linkedlist.get(asd));
            int index = asd;
            for (int i = 0; i < asd; i++){
                if (max_age < ageLst.get(linkedlist.get(i))) {
                    max_age = ageLst.get(linkedlist.get(i));
                    index = i;
                }
            }
            int nod = linkedlist.get(asd);
            linkedlist.set(asd, linkedlist.get(index));
            linkedlist.set(index, nod);
            asd--;
        }
        linkedlist.forEach(
                i -> System.out.println(
                    firstName.get(i)+" "+patronymic.get(i)+" "+secondName.get(i)+" Возраст: "+ageLst.get(i)+", Пол: "+sexLst.get(i)));
    }

    static void gender() {
        for (int j = 0; j < linkedlist.size(); j++) {
            if (sexLst.get(linkedlist.get(j))) {
                int asg = linkedlist.get(j);
                linkedlist.remove(j);
                linkedlist.add(0, asg);
            }
        }
        linkedlist.forEach(j -> System.out.println(firstName.get(j)+" "+patronymic.get(j)+" "+secondName.get(j)+" Возраст: "+ageLst.get(j)+", Пол: "+sexLst.get(j)));
    }

    static void surname() {
        Collections.sort(secondName);
        for (int j = 0; j < linkedlist.size(); j++) {
            System.out.println(firstName.get(j)+" "+patronymic.get(j)+" "+secondName.get(j)+" Возраст: "+ageLst.get(j)+", Пол: "+sexLst.get(j));
        }
    }
    static void name() {
        Collections.sort(firstName);
        for (int j = 0; j < linkedlist.size(); j++) {
            System.out.println(firstName.get(j)+" "+patronymic.get(j)+" "+secondName.get(j)+" Возраст: "+ageLst.get(j)+", Пол: "+sexLst.get(j));
        }
    }
    
    static void putTo(String fio, int age, String sex) {
        ageLst.add(age);
        String[] fio1 = fio.split(" ");
        firstName.add(fio1[1]);
        secondName.add(fio1[0]);
        patronymic.add(fio1[2]);
        if (sex.contains("М")) {sexLst.add(false);} else {sexLst.add(true);}
        linkedlist.add(ageLst.size() - 1);
        System.out.println(fio + ". Age: " + age + ", Пол: " + sex);
    }


    static void record(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите новый контакт");
        System.out.println("Укажите Фамилию Имя Отчество (через пробел)");
        String fio = scan.next();
        System.out.println("Укажите возраст");
        int age = scan.nextInt();
        System.out.println("Укажите пол (М или Ж)");
        String sex = scan.next();
 

        putTo(fio, age, sex);

    }
    static void actionChoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Сортировка по имени - 1\nСортировка по фамилии - 2\nСортировка по полу - 3\nСортировка по возрасту - 4\nЖелаете добавить новый контакт? (Если да - введите 5, если нет - 6): ");
        int actCh = scan.nextInt();
        if (actCh == 1){
            name();
        }
        else if (actCh == 2){
            surname();
        }
        else if (actCh == 3){
            gender();
        }
        else if (actCh == 3){
            age();
        }

        else if (actCh == 5){
            record();
        }
        else if (actCh == 6){
            System.exit(0);
        }

    }

    public static void main(String[] args) {

        System.out.println("Вывод списка:");

        putTo("Иванова Ольга Петровна", 65, "Ж");
        putTo("Кукушкина Юлия Сергеевна", 35, "Ж");
        putTo("Комаров Андрей Николаевич", 51, "М");
        putTo("Колесников Александр Сергеевич", 28, "М");
        putTo("Карягина Екатерина Александровна", 37, "Ж");
        putTo("Соболева Анастасия Игоревна", 20, "Ж");
        putTo("Напалков Сергей Николаевич", 19, "М");

        actionChoice();
    }
    
}