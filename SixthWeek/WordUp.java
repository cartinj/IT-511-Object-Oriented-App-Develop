import java.util.ArrayList;
import java.util.Random;


public class WordUp
{
   public static void main(String[] args)
   {
       final int size=10; //here is where we actually set the size of our array
       //at the end of this, our array must have 10 strings
       ArrayList<String>dogs=new ArrayList<>(size); //our dogs array
       //we will add our dogs using dot notation as dogs.add();
       dogs.add("Frank");
       dogs.add("Johnny Rocket");
       dogs.add("Slinky");
       dogs.add("Salami");
       dogs.add("FrankerZ");
       dogs.add("Sparky");
       dogs.add("Pipsqueak");
       dogs.add("Rex");
       dogs.add("Max");
       dogs.add("Bowser");
      
      
       Random rand=new Random(); // here is how we randomize our return
       int index=rand.nextInt(size);
       System.out.println("Pup number "+index+" is "+dogs.get(index-1)+"!");
       // here is where we print out the pup number we returned in the form of 
        // index number
            // which then selects and returns the matching dog at that index
                // because there is no puppy 0, we must use index-1 to select
                    // the correct puppy and number
   }

}
