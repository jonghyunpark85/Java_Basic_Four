package Assignment4;
import java.util.*;
import java.io.*;
/**
   This program demonstrates a solution to the Grade Sheet programme in Assignment4.
 *  This program uses the data stored in the StudentInfo.txt file
 *  to generate a book sheet for 10 students where each student has 5 scores.
*/
public class GradeSheetDemonstration
{
   public static void main(String[] args) throws IOException
   {
      // Create a GradeSheet object.
      GradeSheet gs = new GradeSheet();
   
      // Read the data from the file.
      readFromFile(gs);
      
      // Write your code here to display the student data.
       System.out.printf("%25s\n", "Grade Sheet: ");
       System.out.printf("%25s\n", "------------ ");
      for (int i = 1;  i < 11; i++) {
          // System.out.printf("%d. Stundent name: %-15s Average score: %.2f Grade: %c ", i+1, "", 00.00, 'A'); 
          System.out.printf (i + "." + "Student Name: %s \t" + 
                            "Average score: %.2f \t" +
                            "Grade : %s \n", gs.getName(i), gs.getAverage(i), 
                            gs.getLetterGrade(i));
        }
   }
    // The readFromFile method reads test scores from a file into a GradeSheet object.z
   public static void readFromFile(GradeSheet gs) throws IOException
   {
      String input;
      double[] scores = new double[5];
      
      // Create the necessary objects for file input.
      
      FileReader freader = new FileReader("C:/CMPP269G/Assignment/Assignment4/StudentInfo.txt");
      BufferedReader inFile = new BufferedReader(freader);
      
      // Write your code here to read the contents of the file.
      //you can use nested for to read names and their 5 test scores.
      for (int student = 1; student <= 10; student++)
      {
         // Read the name.
         input = inFile.readLine();
         gs.setName(student, input);
         
         // Read the 4 test scores.
         for (int i = 0; i < 5; i++)
         {
            input = inFile.readLine();
            scores[i] = Double.parseDouble(input);
            gs.setScores(student, scores);
         }
      }
      
      // Close the file.
      inFile.close();
   } 
 } 