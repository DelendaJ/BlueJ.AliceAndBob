 /**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args ){
    String name = "Alice";
    String name2 = "Bob";
    Scanner input = new Scanner (System.in);
    System.out.print("Name please: ");
    String fname = input.next();
    if (fname.equals(name) || fname.equals(name2)) {
     System.out.println("Hello " +fname+" ");
    } else {
        System.out.println("I know what you did, " +fname+"!");
        
}
}   }