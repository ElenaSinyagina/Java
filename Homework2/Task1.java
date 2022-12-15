package Homework2;

public class Task1 {
    public static void main(String[] args) {
        // Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        
        String str1 = "Даруй свет, и тьма исчезнет сама собой";
        String str2 = "сама";
        int result = str1.indexOf(str2);
        if (result == -1){
            System.out.println("Вхождения нет");
        }
        else{
            System.out.println("Вхождение в строке " + result);
        }

    }
    
    
}
