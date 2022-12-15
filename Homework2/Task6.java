package Homework2;

public class Task6 {
    public static void main(String[] args) {
        // Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace()
        String b = "равно";
        StringBuilder str = new StringBuilder();
        str.append("3 + 56 = 59");
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            int index = str.indexOf("=");
            if (index > 0){
                str.deleteCharAt(index);
                str.replace(index, index, b);
            }
        }
        System.out.println(str);

    }
    
}
