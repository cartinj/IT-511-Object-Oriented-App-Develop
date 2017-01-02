import org.junit.Test;
//uses junit test to test single class MyClone

public class MyCloneTest {

   @Test
   public void test() {
   MyClone cloner=new MyClone();
       cloner.setFirstName("Sammi"); //tests setting first name to Sammi, string
   }
   @Test
   public void test1() {
   MyClone cloner=new MyClone();
       cloner.setFirstName("99912"); // also a string
   }
  
   @Test
   public void test2() {
   MyClone cloner=new MyClone();   
       cloner.setFirstName("12.75"); // also a string, passes
   }
   @Test
   public void test3() {
   MyClone cloner=new MyClone();
   cloner.getFirstName(); // tests get first name to ensure works as should
   }
  
   @Test
   public void test4() {
   MyClone cloner=new MyClone(); // returns as expected
   }
   @Test
   public void test5() {
   MyClone cloner=new MyClone();
   cloner.setLastName("bobby"); // tests setter, string works
   }
   @Test
   public void test6() {
   MyClone cloner=new MyClone();
   cloner.getLastName(); // tests getter
   }
   @Test
   public void test7() {
   MyClone cloner=new MyClone();
   cloner.setLastName("frankerz"); // set last name, string, works
   }
  

}

