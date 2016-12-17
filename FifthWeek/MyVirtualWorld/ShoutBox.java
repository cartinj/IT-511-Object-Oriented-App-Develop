import java.util.*;
import java.lang.*;
import java.io.*;

class MessageArray
{
   static HashMap<Integer,String> hm=new HashMap<Integer,String>(); // declaration of HashMap
   public static void intializeHashMap()
   {
     hm.put(1,"Hello, World!");
     hm.put(2,"My name is Jamie, but you can call me Jasey");
     hm.put(3,"Go, Capitals!");
     hm.put(4,"Java is fun!");
     hm.put(5,"I hope you're having a good day.");
     hm.put(6,"I'm learning a lot in this class.");
     hm.put(7,"It's hard to think of 10 things to say!");
     hm.put(8,"I can't wait to learn more.");
     hm.put(9,"I love pizza.");
     hm.put(10,"My Dachshund, Slinky, is adorable.");
      
   }
    public static void main(String[] args)
    {
        String selected = shoutOutCannedMessage();
        System.out.println("You have chosen: "+selected);
    }

   private static String shoutOutCannedMessage()
    {
        Scanner input = new Scanner(System.in);
        int choice;
        Integer x;
      
       intializeHashMap(); // intialization of HashMap
       hm.entrySet().forEach((m) -> {
           System.out.println(m.getKey()+")"+m.getValue());
       });
        System.out.println("Please enter the number of a sentence to select it: ");
        choice = input.nextInt();
        x=choice;
       
        return hm.get(x);
    }

}
