import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int unknownNumber = 56; 
        int userNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Угадай число от 0 до 100.");

        do {
            System.out.print("Введите ваше число: ");
            userNumber = input.nextInt();
                
            if (userNumber > unknownNumber) {
                System.out.println("Моё число меньше.");
            } else {
                System.out.println("Моё число больше.");
            } 
        }while (userNumber != unknownNumber);

        System.out.println("Вы угадали!");
    }
}