import java.util.Scanner;
public class IT24102928Lab4Q2 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       System.out.println ("Please enter exam marks(out of 100): ");
       int examMarks = input.nextInt() ;

       if (examMarks < 0 || examMarks > 100) {
           System.out.print("Invalid input for exam mark. Terminating program.") ;
                    return; }

       System.out.println ("Please enter lab submission marks (out of 100): ");
       int submissionMarks = input.nextInt();

       if (submissionMarks < 0 || submissionMarks > 100) {
          System.out.print("Invalid input for lab submission mark. Terminating program.");
                        return; }

       System.out.println ("Please enter the percentage given for the exam: ");
       int examPercentage = input.nextInt();

       if (examPercentage < 0 || examPercentage > 100) {
         System.out.print ("invalid input for exam peecentage. Termining program.");
                        return; }

       System.out.println ("Piease enter the percentage given for the lab submission: ");
       int labPercentage = input.nextInt();

       if (labPercentage < 0 || labPercentage > 100) {
          System.out.print ("Invalid input for lab submission percentage.Terminating program.") ;
                        return; }

       if ((examPercentage + labPercentage) !=100) {
          System.out.print ("The percentages must add up to 100.Terminating program.");
                        return; }

       double finalMark = (examMarks * examPercentage / 100.0) + (submissionMarks * labPercentage / 100.0);
          System.out.println ("Final Exam Mark is :" + finalMark);

           }
}