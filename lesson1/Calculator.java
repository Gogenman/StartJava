import java.util.Scanner;
   
public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = reader.nextDouble();
        
        System.out.print("Введите второе число: ");
        double num2 = reader.nextDouble();
        
        System.out.print("\nВыберите операцию (+, -, *, /, ^, %): ");
        char sign = reader.next().charAt(0);
        
        double result = 0;
        
        if(sign == '+') {
            result = num1 + num2;
        } else if(sign == '-') {
            result = num1 - num2;
        } else if(sign == '*') {
            result = num1 * num2;
        } else if(sign == '/') {
            result = num1 / num2;
        } else if(sign == '^') {
            int power = 1;
            while (num2 != 0) {
            power *= num1;
            --num2;
            }
            result = power;
        } else if (sign == '%') {
            result = num1 % num2; 
        }
        System.out.println("Результат: " + result);
   }
}