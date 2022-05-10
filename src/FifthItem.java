import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> userInput = new ArrayList<>();

        System.out.println("Enter some text.");
        
        String fml = scanner.nextLine();
        userInput.add(fml);    

        while (!fml.isEmpty() && userInput.size() <= 10){
            fml = scanner.nextLine();
            userInput.add(fml);
        }
        System.out.println("The fifth item in the list is: " + userInput.get(4));
    }   
}
   




