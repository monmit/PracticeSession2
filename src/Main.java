public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInput userinput = new UserInput();


        int operation = userinput.getOperationFromUser();


        int first = userinput.getOperandFromUser("Enter first Number");
        int second = userinput.getOperandFromUser("Enter second Number");

        if(operation == 1) {
            int add = calculator.addNumbers(first, second);
            System.out.println("Addition of " + first + " and " + second + " is " + add);
        }

        int Subtract = calculator.subtractNumbers(1,2);
        System.out.println(Subtract);
        int Multiply = calculator.multiplyNumbers(2,2);
        System.out.println(Multiply);
        System.out.println(calculator.getLastOperation());
        double Divide = calculator.divideNumbers(1,2);
        System.out.println(Divide);
        double Divide2 = calculator.divideNumbers(2,0);
        System.out.println(Divide2);

        //System.out.println(calculator.getLastOperation());

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.getLastOperation());

    }

}
