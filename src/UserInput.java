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
        //List<Integer> myList = new ArrayList<Integer>();
        //myList.add(1);
        //myList.add(2);
        //myList.add(3);
        //myList.add(4);

        while (isFound(true) && (numberOrNot(true)){
            // if (userinput is found in options),we can use while loop here on list
            //when conditions meet, Validate the user input. (How??)
            System.out.println("Good To Go !");
            return true;
        }

        }
        public boolean isFound(option){
        // Check if option is not from the list i.e.1,2,3,4)else throw error and ask again to userinput
        System.out.println("Please choose from the given options");
        return true;
        }

        public boolean numberOrNot(option) {
            //check if user enters as 1 and not 'one' ! If so, print error
        try {
            Integer.parseInt(option);
        } catch (NumberFormatException ex) {
        }
            System.out.println("Please enter the number in numeric form only");
            return false;
        }

    }

