import java.util.Scanner;

public class MessageArray
{  
  //this next part is where we will define sentences
    //we will make this private static final so it remains constant and can't be changed
        // will enter 10 sentences, separated by " ", in array
   private static final String sentences[]= {"Hello, World!",
            "My name is Jamie, but you can call me Jasey",
            "Go, Capitals!",
            "Java is fun!",
            "I hope you're having a good day.",
            "I'm learning a lot in this class.",
            "It's hard to think of 10 things to say!",
            "I can't wait to learn more.",
            "I love pizza.",
            "My Dachshund, Slinky, is adorable."
            };
  
  
   public static void main(String[] args)
   {
       //here is where we call our shoutOutCannedMessage() method
       String selected = shoutOutCannedMessage(); 
       System.out.println("You have chosen: "+selected);
        //and here is where we will print whichever the user selects
   }

   private static String shoutOutCannedMessage()
   {
       //utilize Scanner
       Scanner input = new Scanner(System.in);
       int choice; //choice must be an integar
      
       //this ensures we print each of our 10 sentences out
        //without this, the user would not see the 10 choices
       for (int start = 0; start < sentences.length; start++)
           //sets starting point at 0
            // continues until reach the length of sentences array (all 10 sentences)
       {
           System.out.println((start+1)+")"+sentences[start]);
            //prints sentences here
       }
      
       System.out.println("Please enter the number of a sentence to select it: ");
       choice = input.nextInt(); // sets var choice to the user's input
      
       return sentences[choice-1]; //returns the user's selection
        // we use choice-1, because the default starting point is 0
            // so if they selected 1, they would actually get sentence 2
                // choice-1 will display their actual selection
   }

}
