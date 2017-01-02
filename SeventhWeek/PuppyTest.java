import static org.junit.Assert.*;

//utilizes junit test to test single class Puppy

import org.junit.Test;

public class PuppyTest {

   @Test
   public void test() {
      
       Puppy puppy=new Puppy();
       Puppy[] puppies = new Puppy[5];
       puppies[0] = new Puppy("Slinky","Dachshund","1");
       puppies[1] = new Puppy("Kaiya","Husky","2");
       puppies[2] = new Puppy("Cooper","Beagle","3");
       puppies[3] = new Puppy("Billy","Golden Retriever","4");
       puppies[4] = new Puppy("Stacy","Poodle","5");
      
       puppy.displayTag(puppies, "2"); // tests it by choosing puppy tag 2
       //displays properly both information of Kaiya and the reach in and grab
        // msg
   }

}
