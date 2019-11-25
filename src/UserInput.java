import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    Calculator calculator = new Calculator();

    public void userInput(){
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        System.out.println("*********Welcome to calculator*************");
        System.out.println("1. Addition"+"2. Subtraction"+"3.Multiplication"+"Division");
        System.out.println("Please choose which you wish to use");
        System.out.println("Enter 1, 2, 3 or 4 (0 for exit): ");

        // i want to make a list or Array??? of choices = {1,2,3,4}
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        // if (userinput is not found in options),throw error and ask again to userinput; we can use while loop here on list)
        int option;
        // while(myList.hasoption)
        while (!true){
            System.out.println("Please choose from the given options");
        //Similarly i want to put a check if user enters as 'one', for this check if(userinput is numeric), throw error and ask again ! Use parser !
        // or should i just use IO exception and not use it as a check cond !
        if(!numberOrNot(true)){
            System.out.println("Please enter the number in numeric form only");
            if(option == 1){
            calculator.addNumbers();
        }else if(option == 2){
                calculator.subtractNumbers();
            }else if(option == 3){
                calculator.multiplyNumbers();
        }else if(option == 4){
                calculator.divideNumbers();
        }

    public boolean numberOrNot(option) {
        try {
            Integer.parseInt(option);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
        }
    }

    }

