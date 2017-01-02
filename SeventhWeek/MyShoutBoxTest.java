import org.junit.Test;

// uses junit test to test single class MyShoutBox

public class MyShoutBoxTest {

   @Test
   public void test() { 
      // first test ensures canned messages display as should
       MyShoutBox shoutbox=new MyShoutBox();
       shoutbox.shoutOutCannedMessage();
       // none selected so says Missed the Mark message
   }

   @Test
   public void test1() {
      //ensures random message displays as should
       MyShoutBox shoutbox=new MyShoutBox();
       shoutbox.shoutOutRandomMessage();
   }

  
}

