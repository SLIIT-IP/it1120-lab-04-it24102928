import java.util.Scanner;

public class IT24102928Lab4Q1 {
     public static void main (String[] args) {

         Scanner input = new Scanner (System.in);
   
         System.out.println ("Enter a number: ");
         int num = input.nextInt();

         String message ;

         if (num > 0 ) {
             message = "positive" ; }

         else if (num < 0) {
             message = "Negative" ; }

         else {
             message = "Zero" ; }

         System.out.println ("The number is: " + message);

      }
}