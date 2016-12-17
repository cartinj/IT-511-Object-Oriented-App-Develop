package org.puppy;

public class Puppy
{
private int puppyTag; //sets puppyTag to private int value
private String puppyType; // puppyType will be private String
private String puppyName; // puppyName will be private string
  
public Puppy() {
this.puppyTag = 1; //sets puppyTag of first dog
this.puppyType= "Dachshund"; //sets puppyType of first dog
this.puppyName = "Slinky"; //sets puppyName of first dog
}

public Puppy(int puppyTag, String puppyName, String puppyType) {
    //^ sets type and order when utilizing Puppy()
super(); // constructor allowing us to take arguments from DogTypes subclass
this.puppyTag = puppyTag;
this.puppyType = puppyType;
this.puppyName = puppyName;
}

public int getPuppyTag() //getPuppyTag will be a public int
{
return puppyTag; //returns puppyTag in int format
}
public void setPuppyTag(int puppyTag) //sets puppyTag to int
{
this.puppyTag = puppyTag;
}

public String getPuppyType() //gets puppyType
{
return puppyType;
}
public void setPuppyType(String puppyType) //sets puppyType to String type
{
this.puppyType = puppyType;
}
public String getPuppyName() //gets puppyName variable
{
return puppyName;
}
public void setPuppyName(String puppyName) //setter for String puppyName
{
this.puppyName = puppyName;
}

public void displayPuppyInfo() //when we display, this is how it will be displayed
{
System.out.println("Puppy Tag#: " + puppyTag);
System.out.println("Puppy Name: " + puppyName);
System.out.println("Puppy Type: " + puppyType);
System.out.println(" ");
  
} 
}
