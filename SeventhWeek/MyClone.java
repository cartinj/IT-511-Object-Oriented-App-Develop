import java.util.Scanner;
public class MyClone {
private String firstName;
private String lastName;
private String home;

public void setHome(String home) {
this.home = home;
}
// our first and last names will be set to private Strings
// we will need to access them through additional means
public String getFirstName()
{ //how we get firstName
return firstName; // returns firstName
}
public String getLastName()
{ //how we get lastName
return lastName; //returns lastName to system
}
public void setFirstName(String newFirstName) { //how we will set first name
firstName = newFirstName;
}
public void setLastName(String newLastName)
{ //how we will set last name
lastName = newLastName;
}
public void introduction() { // our introduction
System.out.println("Hello there! I am a clone of "+firstName+" "+lastName+", and this is my virtual home.");
System.out.println("What's your name?: ");
Scanner scan = new Scanner(System.in);
String username = scan.nextLine(); // gets name from user and assigns it to username
System.out.println("\nWelcome, "+username+"! Take a look around and find yourself a puppy.");
System.out.println("--------------------------------------------------------");
System.out.println("|       Here is our selection of pups available:       |");
// design
System.out.println("--------------------------------------------------------");
  
}
}
