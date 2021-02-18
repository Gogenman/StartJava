public class Cycle {
    public static void main(String[] args) {
        // Выведите на консоль с помощью цикла for все числа от [0, 20]
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        // Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
        int i = 6;
        while (i > -6) {
            i -= 2;
            System.out.println(i);
        }
        // Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
        int a = 10;
        int sum = 0;
        do {
            a++;
            sum = (a % 2 != 0) ? (sum + a) : sum;
        } while(a < 20);
        System.out.println(sum);
    }
}