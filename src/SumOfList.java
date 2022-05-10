import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> userInput = new ArrayList<>();

        System.out.println("Enter some text.");
        
        String fml = scanner.next();
        userInput.add(fml);    

        while (!fml.equals("0")){
            fml = scanner.next();
            userInput.add(fml);
        }
        for ( String userInputs : userInput) {
            fml += userInputs;
        }       
        System.out.print(fml + " were the items in the list. The sum of that list is: " + fml) ;

    }   
}
   




