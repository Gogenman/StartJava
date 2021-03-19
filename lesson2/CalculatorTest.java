import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
    Calculator calcOne = new Calculator(); 
    Scanner reader = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    double num1 = reader.nextDouble();
    calcOne.setNum1(num1);
    calcOne.getNum1();

    System.out.print("Выберите операцию (+, -, *, /, ^, %): ");
    char sign = reader.next().charAt(0);
    calcOne.setSign(sign);
    calcOne.getSign();

    System.out.print("Введите второе число: ");
    double num2 = reader.nextDouble();
    calcOne.setNum2(num2);
    calcOne.getNum2();

    double result = 0.0;

    calcOne.calc();

}
}
