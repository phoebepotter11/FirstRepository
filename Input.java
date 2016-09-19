
package input;
import java.util.Scanner;
public class Input {

        
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What is your name?");
        
        String answer = myScanner.nextLine();
        
        System.out.println("Hi there, " + answer + ".");
        
        
        System.out.println("What is your age?");
        
        int age = myScanner.nextInt();
        
        System.out.println("You are " + age + " years of age.");
        
        if (age<18) {
            System.out.println("You will be able to vote in " + ( 18 - age) + " years.");
        }else{
            System.out.println("You have been able to vote for " + (age - 18) +  " years.");
        }
        
    }
                
}
