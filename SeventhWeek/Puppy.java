import java.util.Scanner;
class Puppy{ //our name, breed, and tag number will be private
private String name;
private String breed;
private String tag_num;
private int count=0; // index starting at int 0
Puppy()
{
this.name=name;
this.breed=breed;
this.tag_num=tag_num;
}
Puppy(String n,String c,String t){
tag_num = t;
breed=c;
name = n;
tag_num=t;
count++;
}
static boolean displayTag(Puppy[] list, String tag_num)
{
for(int i=0;i<list.length;i++) // how we move from puppy to puppy to display
{
if(list[i] == null)
break; //ends if list[i] doesn't exist
if(list[i].tag_num.equals(tag_num)) // if number selected exists then:
{ // prints info of selected pup
System.out.println("\nYou reach in and grab... "+ list[i].tag_num+" ");
System.out.println("You've selected: ");
System.out.println("Tag #: "+list[i].tag_num);
System.out.println("Name: "+list[i].name);
System.out.println("Color: "+list[i].breed+"\n");
System.out.println("");
System.out.println( "I hope you will enjoy your time here with "+list[i].name+"!");
System.out.println("");
System.out.println("Wait... what is this?!");
System.out.println("Is "+list[i].name+"... talking?!");
System.out.println("You listen closely to the mumbles of the talking pup...");
System.out.println("What's "+list[i].name+" saying?");
return true;
}
}
// if tag # doesn't exist, prints this:
System.out.println("\nNo Pup found with Tag #: "+tag_num);
return false;
}
@Override
public String toString() {
return "[Tag #]: " + tag_num + " [Name]: " + name + " [Breed]: " + breed
+ ""; // how our pup info will be returned under selection of pups available
}
}
