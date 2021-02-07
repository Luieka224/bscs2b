public class Model {
    private int result;

    public void calculate(
        int num1,
        int num2,
        char operation) {
        
        switch(operation) {
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
        }
    }
 
    public int getResult() {
        return result;
    }
}