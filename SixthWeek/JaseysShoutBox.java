import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

public class JaseysShoutBox {

   private static Map<Integer, String> getCannedMessagesMap() {
       //introduces the hm of our set phrases for user selection
       Map<Integer, String> cannedMessages = new LinkedHashMap<>();
       cannedMessages.put(1, "Lately, my dog's the only one around that listens to my problems.");
       cannedMessages.put(2,
               "Who let the dogs out?");
       cannedMessages.put(3, "Dogs are man's best friends.");
       cannedMessages.put(4,
               "No one will love you are strongly or purely as a dog.");
       cannedMessages.put(5, "Love is a puppy licking your face, even after you left him alone all day.");
       cannedMessages.put(6, "A puppy is just a part of your life; you are their entire life.");
       cannedMessages.put(7,
               "Knick-knack, paddy whack, give the dog a bone.");
       cannedMessages.put(8,
               "Bow-wow.");
       cannedMessages.put(9, "What is it, Lassie?  Is little Timmy stuck in the well?");
       cannedMessages.put(10, "I didn't cry when Old Yeller died, at least not in front of my friends.");
       return cannedMessages;

   }

   public static String shoutOutCannedMessage() {

       int id;
       String message = "";
        // this allows for the iteration over our collection
            // allows us to access each element
       Iterator<Entry<Integer, String>> msgIterator = getCannedMessagesMap()
               .entrySet().iterator(); // utilize integer to display string
       while (msgIterator.hasNext()) { // as long as there is another in the collection
            //this will continue
           Map.Entry msgPair = (Map.Entry) msgIterator.next();
           System.out.println("[" + msgPair.getKey() + "] " 
                   + msgPair.getValue());
           //this puts [] around each of our numbers
       }// will then end

       try { //setting up a try/catch to handle exceptions
           System.out.print("Please select the number of your favorite message: ");
           // prints out the prompt for input to select
           Scanner sc = new Scanner(System.in); //input for selection
           System.out.println("\n");
           id = sc.nextInt(); //input will be an Int
           message = getCannedMessagesMap().get(id);
           //this directly relates our choice to our above sentences

       } catch (Exception e) { // if we deviate from the expected input, we get this
           System.out.println("You missed the mark!  Oops! Your error is: " + e.getMessage());
       }
       return message; // returns the selection
   }

   public static String shoutOutRandomMessage() {

       int i; 

       // This sets our words for potential random selection
       String[] subject = { "You", "Someone", "A relative", "A friend", "A stranger" };
       String[] verb = { " is", " was", " will be", " might be", " won't be", " can't be" };
       String[] adjective = { " rich", " successful",
               " educated", " friendly", " handsome" };
       String[] object = { " with some help", " with a wife",
               " with his son", " with a friend", " with money" };
       String[] adverb = { " in the end. ", " today. ", " someday. ",
               " in some years. ", " tomorrow." };

       Random k = new Random(); // this initializes Random
       int chosenMessage = k.nextInt(subject.length); 
       String randomMessage = "";
       for (i = 1; i <= 1; i++) // our for loops which will allow for us to iterate
           //through the potential words rather than staying stagnant

       {
            //sets randomMessage so it will iterate through the length of each list of words
                // random will allow for this selection to be random
           randomMessage = subject[k.nextInt(subject.length)] 
                   + verb[k.nextInt(verb.length)]
                   + adjective[k.nextInt(adjective.length)]
                   + object[k.nextInt(object.length)]
                   + adverb[k.nextInt(adverb.length)];

       }

       return randomMessage;

   }

   public static void main(String[] args) {

       System.out.println("Your selected doggy saying is: "
               + shoutOutCannedMessage()); // displays our selection
       System.out.println("Your random message is: "
               + shoutOutRandomMessage()); // displays each word at random
                    //one from each list
   }

}
