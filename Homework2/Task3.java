package Homework2;

public class Task3 {
    public static void main(String[] args) {
        // Напишите программу, чтобы перевернуть строку с помощью рекурсии

        String str = "poiuytrewq";
        String str1 = revers(str);
        System.out.println(str1);
        
    }


    static String revers(String str) {
        String rightStr;
        String leftStr;
        int length = str.length();

        if (length <= 1) {
            return str;
        }

        leftStr = str.substring(0, length / 2);
        rightStr = str.substring(length / 2, length);

        return revers(rightStr) + revers(leftStr);

    }
}

