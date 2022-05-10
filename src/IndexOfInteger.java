import java.security.Key;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class IndexOfInteger {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> userInput = new ArrayList<>();

        System.out.println("Enter a number.");
        
        Integer numInput;
        numInput = scanner.nextInt();// Thiss assigns input to the variable "numInput", the value is saved within the variable

        while (numInput != 0){ // this loop adds the 0 because after its entered, 0 is added by "userInput.add(numInput)" THEN the loops checks for 0 and exits.
            userInput.add(numInput);//Edited to exit with out adding 0 to ArrayList. The add() method then appends what was enetered in line 16
            numInput = scanner.nextInt();
        }
        System.out.println("Done entering intergers into the list");
        
        System.out.println("What number are you looking forin the list?");
       Integer find = scanner.nextInt();//New variable for input
       for (int i = 0; i<userInput.size(); i++ ) {// i is the index of the ArrayList "userInput", the loop iterates throught the ArrayList as long as the index is less than the length of ArrayList, incrememnts by 1
           Integer current = userInput.get(i); // Variable is getting/retrieving the value at the index i, which will change as the loop iterates
           if (find.equals(current)) { // if user input equals a number in the list at the index being iterated then it prints out
               System.out.println(find + " is at index " + i);
           }

       }
       


    }   
    
}
   




