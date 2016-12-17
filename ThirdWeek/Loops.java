import java.util.Scanner;

public class Loops {

public static void main(String[] args) {
    System.out.println("Please enter a number between 1-10:");
    boolean checkNum = false;
    while(!checkNum) //repeat process until true
    {
        Scanner input_UserNumber = new Scanner(System.in); //where will get #
        int userNumber = input_UserNumber.nextInt(); //sets input as int

        if (userNumber >= 1 && 10>= userNumber) // if the number is between 1-10 do the following:
        {
           System.out.println("Good job! The number you entered is "+userNumber+"."); //print msg
           checkNum = true; // sets as true
        }
        else // any other number (not between 1-10)
        {
           System.out.println("The number entered was not between 1 and 10!"); // print this
        }

    }

}
}
