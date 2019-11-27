import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInput userinput = new UserInput();
        int operation = userinput.getOperationFromUser();
        if (operation == 0 || operation == 5) {
            System.out.println("Are you sure you want to Exit ?");
            System.out.println("Enter N to continue, Enter Y to exit !");
            String selectYes = "Y";
            String selectNo = "N";
            Scanner scanner = new Scanner(System.in);
            String entryWish = scanner.next();
            if (entryWish == selectYes) {
                System.out.println("OK ! Exiting now !");
            } else if (entryWish == selectNo) {
                System.out.println("OK ! Continue further" + "and please select the operation:");
            }
        }else {
             int first = userinput.getOperandFromUser("Enter first Number");
             int second = userinput.getOperandFromUser("Enter second Number");
                if (operation == 1) {
                    int add = calculator.addNumbers(first, second);
                    System.out.println("Addition of " + first + " and " + second + " is " + add);
                } else if (operation == 2) {
                    int subtract = calculator.subtractNumbers(first, second);
                    System.out.println("Subtraction of " + first + " and " + second + " is " + subtract);
                } else if (operation == 3) {
                    int multiply = calculator.multiplyNumbers(first, second);
                    System.out.println("Multiplication of " + first + " and " + second + " is " + multiply);
                } else if (operation == 4) {
                    double divide = calculator.divideNumbers(first, second);
                    System.out.println("Division of " + first + " and " + second + " is " + divide);
                }

                //System.out.println(calculator.getLastOperation());
        }
    }
}