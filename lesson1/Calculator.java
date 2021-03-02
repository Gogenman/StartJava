import java.util.Scanner;
   
public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = reader.nextDouble();
        
        System.out.print("Введите второе число: ");
        double num2 = reader.nextDouble();
        
        
        System.out.print("\nВыберите операцию (+, -, *, /, ^, %): ");
        char op = reader.next().charAt(0);
        
        double answer;
        int result = 1;
        
        if(op == '+') {
            answer = num1 + num2;
            System.out.println("Результат: " + num1 + " " + op + " " + num2 + " = " + answer);
        } else if(op == '-') {
            answer = num1 - num2;
            System.out.println("Результат: " + num1 + " " + op + " " + num2 + " = " + answer);
        } else if(op == '*') {
            answer = num1 * num2;
            System.out.println("Результат: " + num1 + " " + op + " " + num2 + " = " + answer);
        } else if(op == '/') {
            answer = num1 / num2;
            System.out.println("Результат: " + num1 + " " + op + " " + num2 + " = " + answer);
        } else if(op == '^') {
            while (num2 != 0) {
            result *= num1;
            --num2;
            }
            answer = result;
            System.out.println("Результат: " + num1 + " " + op + " " + num2 + " = " + answer);
        } else if (op == '%') {
            answer = num1 % num2;
            System.out.println("Результат: " + num1 + " " + op + " " + num2 + " = " + answer);
        }
   }
}