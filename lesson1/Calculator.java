import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int UnknownNumber = 0; 
        
        int UserNumber = 0;

        UnknownNumber = 56;

        Scanner input = new Scanner(System.in);
        System.out.println("Угадай число от 0 до 100.");

        do {
            System.out.print("Введите ваше число: ");

            UserNumber = input.nextInt();
                
            if (UserNumber > UnknownNumber) 
                System.out.println("Моё число меньше.");
            
            else if (UserNumber < UnknownNumber)                
                System.out.println("Моё число больше.");                  

            else 
                System.out.println("Вы угадали!");

        } while (UserNumber != UnknownNumber);
    }
}