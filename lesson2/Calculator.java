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

    public void calculate() {
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
                double result = 1;
                while (num2 != 0) {
                    result *= num1;
                    --num2;
                }
                break;
            default:
                return;
        }
        System.out.println("Результат: " + result);
    }
}
