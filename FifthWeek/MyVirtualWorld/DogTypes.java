package puppy;
import org.puppy.Puppy;

public class DogTypes {
//where we safely store our doggy information
//because of our getters and setters in Puppy.java, we can still access them!
    
    
public static void main(String[] args) {
Puppy a = new Puppy(); //allows us to differentiate different puppies
//we assign them values so we may create different instances
a.displayPuppyInfo();
//Puppy a has not been told otherwise so will take on values stored in Puppy.java as its own

Puppy b = new Puppy(); //here we set Puppy b's values through setters
b.setPuppyTag(2);
b.setPuppyName("Johnny Danger");
b.setPuppyType("Poodle");
b.displayPuppyInfo();

Puppy c = new Puppy(); // Puppy c repeats Puppy b's behavior with new values
c.setPuppyTag(3);
c.setPuppyType("Pit Bull");
c.setPuppyName("Billy");
c.displayPuppyInfo();

Puppy d = new Puppy(4, "Kaiya", "Husky");
//in our Puppy.java we initiated public Puppy(int puppyTag, String puppyName, String puppyType)
       //we take on the order as defined in Puppy.java
d.displayPuppyInfo();

}
}
