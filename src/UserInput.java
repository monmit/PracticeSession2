import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

    public int getOperationFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********Welcome to calculator*************");
        System.out.println("1. Addition"+"2. Subtraction"+"3.Multiplication"+"4.Division");
        System.out.println("Please choose which you wish to use");
        System.out.println("Enter 1, 2, 3 or 4 (0 for exit): ");
        String input = scanner.next();

        // i want to make a list or Array??? of choices = {1,2,3,4}
        List<Integer> myList = new ArrayList<>();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        while (!isInputCorrect(input, myList)) {
            // if (userinput is found in options),we can use while loop here on list
            //when conditions meet, Validate the user input. (How??)
            System.out.println("Wrong input, please enter your choice again");
            input = scanner.next();
        }

        System.out.println("Good to go!");
        return Integer.parseInt(input);
    }

    public int getOperandFromUser(String inputMessage) {
        System.out.println(inputMessage);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return Integer.parseInt(input);
    }

    private boolean isInputCorrect(String input, List<Integer> availableOptions){
        try {
            int option = Integer.parseInt(input);
            return availableOptions.contains(option);
        } catch (NumberFormatException ex) {
            System.out.println("Please enter the number in numeric form only");
            return false;
        }
    }
}

