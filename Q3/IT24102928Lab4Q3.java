import java.util.Scanner;
public class IT24102928Lab4Q3 {
     public static void main (String[] args) {

         Scanner input = new Scanner (System.in);

         System.out.println ("Enter a number: ");
         int num = input.nextInt();

         String message ;
         message = (num > 0) ? "Positive" : (num < 0 ) ?"Negative" : "Zero" ;

         System.out.println ("The number is : " + message) ;

      }
}