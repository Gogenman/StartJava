import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Calculator calc = new Calculator();
        int ans;
        
            do{
             
            
            System.out.print("Введите первое число: ");
            double num1 = reader.nextDouble();
            calc.setNum1(num1);
            
            System.out.print("Выберите операцию (+, -, *, /, ^, %): ");
            char sign = reader.next().charAt(0);
            calc.setSign(sign);

            System.out.print("Введите второе число: ");
            double num2 = reader.nextDouble();
            calc.setNum2(num2);
            
            double result = 0.0;

            calc.calculate();
            System.out.println("Введите 0 что бы продолжить");
            ans = reader.nextInt();
            } while(ans != 1);
        
        }
    }


