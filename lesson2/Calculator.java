public class Calculator {
    private double num1;
    private double num2;
    private double result;
    private char sign;

    public double getNum1() {
        return num1;
    }

    void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getSign() {
        return sign;
    }

    void setSign(char sign) {
        this.sign = sign;
    }

    public void calc() {
        switch(sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                int power = 1;
                while (num2 != 0) {
                    power *= num1;
                    --num2;
                    result = power;
                }
                break;
            default:
                return;
        }
        System.out.println("Результат: " + result);
    }
}
