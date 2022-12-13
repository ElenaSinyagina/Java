import java.util.Random;



public class Task {
    public static void main(String[] args) {
        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

        int k = 2000;
        int i = new Random().nextInt(k+1);
        System.out.println("Случайное число: " + i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int n = bitNumber(i);
        System.out.println("Номер старшего значащего бита: " + n);


        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        System.out.println("Кратные числу " + n + " в диапазоне от " + i + " до " + Short.MAX_VALUE);
        massive1(i, n);

        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        System.out.println("Кратные числа " + n + " в диапазоне от " + Short.MIN_VALUE + " до " + i);
        massive2(i, n);

    }

    static int bitNumber(int i){
        int t = 1 << 17;
        while (i < t) t >>= 1;
            int x = (int)(Math.log(t) / Math.log(2));
            
        return x;
    }

    static void massive1(int i, int n){
        int [] m1 = new int[0];
              
        while (i <= Short.MAX_VALUE){
            if (i % n == 0){
                int[] arr = new int[m1.length + 1];
                for (int k = 0; k < m1.length; k++){
                    arr[k] = m1[k];
                }
                m1 = arr;
                m1[m1.length - 1] = i;
            }
            i++;
        }
        for (int k = 0; k < m1.length; k++) {
            System.out.printf(m1[k] + " ");
        }
        System.out.println();
    }
    static void massive2(int i, int n){
        
        int[] m2 = new int[0];
        int d = Short.MIN_VALUE;
        while (d <= i){
            if (d % n != 0){
                int[] arr = new int[m2.length + 1];
                for (int k = 0; k < m2.length; k++){
                    arr[k] = m2[k];
                }
                m2 = arr;
                m2[m2.length - 1] = d;
            }
            d++;
        }
        for (int k = 0; k < m2.length; k++) {
            System.out.printf(m2[k] + " ");
        }

    }


}