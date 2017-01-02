import java.util.Scanner;
public class VirtualWorld {
public static void main(String[] args)
{
    //in our main class in the VirtualWorld, we will invoke andtest many things:
        // Staring with MyClone
MyClone myclone=new MyClone();
myclone.setFirstName("My");
myclone.setLastName("Name");
myclone.introduction(); //involes MyClone's introduction to print my name
    // introduction also prompts user for name and prints it back out
     // as well as introducing our next Puppy element
Puppy newPuppy=new Puppy();
Puppy[] puppy = new Puppy[5]; //5 puppies in our array
puppy[0] = new Puppy("Slinky","Dachshund","1");
puppy[1] = new Puppy("Kaiya","Husky","2");
puppy[2] = new Puppy("Cooper","Beagle","3");
puppy[3] = new Puppy("Billy","Golden Retriever","4");
puppy[4] = new Puppy("Stacy","Poodle","5");
  // ^ sets properties of 5 puppies starting with index 0
for(Puppy puppies:puppy)
{ //for loop that lists each of our five pups with their Tag #, Name, and Breed
System.out.println("Puppy: "+puppies.toString());
}
System.out.println("--------------------------------------------------------");
//Design element ^
System.out.print("Please select the tag number of the pup you'd like: ");
// prompts user for input of tag # of dog they'd like
Scanner sc = new Scanner(System.in);
String tag_num = sc.nextLine();
boolean flag=newPuppy.displayTag(puppy,tag_num);
if(flag==true) //if input matches existing tag number, we continue
{
    // begins introduction of our Shout Box properties
System.out.println("--------------------------------------------------------");
System.out.println("|        You think it's one of the following:          |");
MyShoutBox bx=new MyShoutBox();
System.out.println("--------------------------------------------------------");
System.out.println("Wow!  So your new dog said:  "
+ bx.shoutOutCannedMessage()); // displays selected motto
System.out.println(" ");
System.out.println("But that's not all!");
System.out.println("Your new dog blinks twice and then spits out a piece of paper.");
System.out.println("It looks like a fortune from a fortune cookie!");
System.out.println("------------------------------------------------------------------");
System.out.println("[Your fortune] "+bx.shoutOutRandomMessage()); // displays randomized message as a 'fortune'
System.out.println("------------------------------------------------------------------");
}
  
else
{
System.out.println("Try again."); // if input does not match desired, returns this
}
}
}
