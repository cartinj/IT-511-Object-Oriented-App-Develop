import java.util.Scanner;
//imports Scanner Class

public class InputAndOutput {
//creation of our class, InputAndOutput, which is public
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //code below calls Scanner instance and defines where Scanner gets info
    
        String firstName;
        //defines firstName as a String
        System.out.print("What is your first name? ");
        //prints request for user's first name
        firstName = reader.next();
        //reads user's first name, obtained via input
        
        String lastName;
        //defines lastName as a String
        System.out.print("What is your last name? ");
        //prints request for user's last name
        lastName = reader.next();
        //reads user's last name, obtained via input
        
        String fullName;
        //creation of string fullName
        fullName = firstName + " " + lastName;
        //fullName combines both firstName and lastName inputs
        
        System.out.println("Hello, " + fullName);
        //prints "Hello" and addresses the user by full name based on input
    }
}
