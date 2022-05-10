import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> userInput = new ArrayList<>();

        System.out.println("Enter some text.");
        
        String fml = scanner.nextLine();
        userInput.add(fml);    

        while (!fml.isEmpty()){
            fml = scanner.nextLine();
            userInput.add(fml);
        }
        System.out.println("The total amount of items in the list was: " + (userInput.size()-1));
    }   
}
   




