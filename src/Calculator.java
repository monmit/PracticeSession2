public class Calculator {

    public void operation(int number1, int number2){
        addNumbers(number1, number2);
        substractNumbers(number1, number2);
        multiplyNumbers(number1, number2);
        divideNumbers(number1, number2);
}

    public int addNumbers(int number1, int number2){
        int sum = number1+number2;
        return sum;
    }
    public int substractNumbers(int number1, int number2){
        int substract = number1-number2;
        return substract;
    }
    public int multiplyNumbers(int number1, int number2){
        int multiply = number1*number2;
        return multiply;
    }
    public double divideNumbers(int number1, int number2){
        if (number2 == 0){
            System.out.println("number2 is Zero" +" "+ "So, result expected is infinity");
        }else {
        double divide = Math.floor((double)number1/number2);
            return divide;
    }
        return 0;
    }
}
