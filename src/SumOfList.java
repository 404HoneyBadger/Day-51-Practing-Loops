import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> userInputArray = new ArrayList<>();

        System.out.println("Enter some numbers");
        
        Integer userIn = scanner.nextInt();

        while (userIn != 0) {
            userInputArray.add(userIn);
            userIn = scanner.nextInt();
        }
        
        Integer sumOfArray = sum(userInputArray);
        System.out.print(userInputArray + " were the items in the list. The sum of that list is: " +  sumOfArray) ;
    }   
    public static Integer sum(ArrayList<Integer> list) {
        Integer sumOfArray = 0; //Variable explicitly starts adding through the iterations at line 22
        //Enhanced for each loop
        for ( Integer itemInArrayL : list) { // ":" does the entire for each loop with the default iteration of +1 for ArrayLists
            sumOfArray += itemInArrayL; 
        }
        return sumOfArray;
    }
    
}
   




