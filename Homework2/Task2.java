package Homework2;

public class Task2 {
    public static void main(String[] args) {
        // Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке)

        String str1 = "qwertyuiop";
        String str2 = "poiuytrewq";

        String reverse = new StringBuffer(str2).reverse().toString();
        int result = str1.indexOf(reverse);
        if (result == -1){
            System.out.println("Не являются вращением");
        }
        else if (str1.length() == str2.length()){
            System.out.println("Являются вращением");
        }
        else {
            System.out.println("Error");
        }
    }
}
