package virtual.world;
public class MyClone {
private String firstName;
private String lastName;
  // our first and last names will be set to private Strings
       // we will need to access them through additional means

public String getFirstName() { //how we get firstName
return firstName; // returns firstName
}
  
public String getLastName() { //how we get lastName
return lastName; //returns lastName to system
}
  
public void setFirstName(String newFirstName) { //how we will set first name
firstName = newFirstName;
}
  
public void setLastName(String newLastName) { //how we will set last name
lastName = newLastName;
}
  
public void introduction() { // our introduction
System.out.println("Hello there! My name is "+firstName+" "+lastName+", and this is my home.");
System.out.println("Pull up a seat, and pick a puppy to be your new best friend.");
}
}
