package virtual.world;

public class VirtualWorld {

    public static void main(String[] args) {
        MyClone clone = new MyClone();
        clone.setFirstName("#myname");
        clone.setLastName("#mylname");
        
        System.out.println("First Name: " + clone.getFirstName());
        System.out.println("Last Name: " + clone.getLastName());
        
    }
}
