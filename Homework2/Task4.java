package Homework2;

public class Task4 {
    public static void main(String[] args) {
        // Дано два числа, например 3 и 56, необходимо составить следующие строки: 
        // 3 + 56 = 59 
        // 3 – 56 = -53 
        // 3 * 56 = 168 
        // Используем метод StringBuilder.append()
        
        int a = 3;
        int b = 56;
        int sum = sum(a, b);
        int mult = mult(a, b);
        int sub = sub(a,b);
        StringBuilder sumStr = new StringBuilder();
        StringBuilder multStr = new StringBuilder();
        StringBuilder subStr = new StringBuilder();
        sumStr.append(a); sumStr.append(" + "); sumStr.append(b); sumStr.append(" = "); sumStr.append(sum);
        multStr.append(a); multStr.append(" * "); multStr.append(b); multStr.append(" = "); multStr.append(mult);
        subStr.append(a); subStr.append(" - "); subStr.append(b); subStr.append(" = "); subStr.append(sub);
        System.out.println("Результат:"+"\n" + sumStr + "\n" + subStr + "\n" + multStr);
      
    }

    static int sum (int a, int b) {
        return a+b;
    }
    static int mult (int a, int b) {
        return a*b;
    }
    static int sub (int a, int b) {
        return a-b;
    }

}
