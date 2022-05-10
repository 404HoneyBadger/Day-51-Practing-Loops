import java.security.Key;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class IndexOfInteger {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> userInput = new ArrayList<>();

        System.out.println("Enter a number.");
        
        Integer fml = scanner.nextInt();
        userInput.add(fml);    

        while (fml != 0){
            fml = scanner.nextInt();
            userInput.add(fml);
        }
        System.out.println("Done entering intergers into the list");
        
        System.out.println("What number are you looking forin the list?");
       Integer why = scanner.nextInt();
       for (int i = 0; i<userInput.size(); i++ ) {
           if (why.equals(userInput.get(i))) { System.out.println(userInput.indexOf(why));
           }

       }
       


    }   
    
}
   




