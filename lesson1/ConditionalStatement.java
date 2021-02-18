public class ConditionalStatement {
    public static void main(String[] args) {
        byte age = 20;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        }

        boolean maleGender = true;
        if (maleGender) {
            System.out.println("пол - мужской");
        }

        if (!maleGender) {
            System.out.println("пол - женский");
        }

        float height = 1.81f;
        if (height < 1.80) {
            System.out.println("рост менее или равен 1.80");
        } else {
            System.out.println("рост более или равен 1.80");
        }

        char firstLetterName = 'X';
        if (firstLetterName == 'M') {
            System.out.println("первая буква М");
        } else if (firstLetterName == 'I') {
            System.out.println("первая буква I");
        } else {
            System.out.println("имя not found!");
        }
    }
}