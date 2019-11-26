import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private String lastOperation;
    private static int operationCount = 0;
    List<String> lastOperations = new ArrayList<>();

    public int addNumbers(int number1, int number2){
        int sum = number1+number2;
        operationCount = operationCount + 1;
        lastOperation = "addition of "+ number1 + " and " + number2;
        lastOperations.add(lastOperation);
        return sum;
    }

    public int subtractNumbers(int number1, int number2){
        int subtract = number1-number2;
        operationCount = operationCount + 1;
        lastOperation = "subtraction of "+ number1 + " and " + number2;
        lastOperations.add(lastOperation);
        return subtract;
    }
    public int multiplyNumbers(int number1, int number2){
        int multiply = number1*number2;
        operationCount = operationCount + 1;
        lastOperation = "multiplication of "+ number1 + " and " + number2;
        lastOperations.add(lastOperation);
        return multiply;
    }
    public double divideNumbers(int number1, int number2){
        lastOperation = "division of "+ number1 + " and " + number2;
        operationCount = operationCount + 1;
        if (number2 == 0){
            System.out.println("number2 is Zero" +" "+ "So, result expected is infinity");
            return 0;
        } else  {
            double divide = Math.floor((double)number1/number2);
            lastOperations.add(lastOperation);
            return divide;
        }
    }

    public String getLastOperation() {
        return lastOperation;
    }

    public int getOperationCount() {
        return operationCount;
    }
}
