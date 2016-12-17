import java.util.Scanner; //import scanner
import java.util.ArrayList; //import array


public class UsingStrings {
    public static void main(String[] args) {
        ArrayList<String> sentence=new ArrayList<>(); //new array list instance
        Scanner scan= new Scanner(System.in); //new scanner instance w/ input
        
        System.out.println("\nPlease enter 5 words, one by one, in the following order:");
        System.out.println("1. Subject(Noun), 2. Verb 3. Adjective 4. Object 5. Adverb\n");
        //above prompt user and instruct user what to input
        
        for(int i=0;i<5;i++) { //establishes that for the words (1-5), do following
            sentence.add(scan.nextLine()); //scans next line and adds
        } 
        System.out.println("\nYou chose: "); 
        for(int i=0;i<4;i++) {
            System.out.print(sentence.get(i)+" "); //displays words and adds as space after every word except the 5th
        }
        System.out.print(sentence.get(4)+"."); //displays 5th word and adds a period after it
    }
    
}
