package Assignment4;
import java.util.*;

/**
 * GradeSheet - Write a description here.
 * 
 * @author Jonghyun Park
 * @version (Dec 8, 2019)
 */
public class GradeSheet
{
    // Constant for the number of students
    private final int NUM_STUDENTS = 10;
    // Constant for the number of tests
    private final int NUM_TESTS = 5;
    // Array to hold student names
    private String[] names = new String[NUM_STUDENTS];
    // Array to hold student grades
    private char[] grades = new char[NUM_STUDENTS];
    // Create arrays of scores, one for each student.
    private double[] scores1 = new double[NUM_TESTS];
    private double[] scores2 = new double[NUM_TESTS];
    private double[] scores3 = new double[NUM_TESTS];
    private double[] scores4 = new double[NUM_TESTS];
    private double[] scores5 = new double[NUM_TESTS];
    private double[] scores6 = new double[NUM_TESTS]; 
    private double[] scores7 = new double[NUM_TESTS];
    private double[] scores8 = new double[NUM_TESTS];
    private double[] scores9 = new double[NUM_TESTS];
    private double[] scores10 = new double[NUM_TESTS];

    public void setName(int studentNumber, String name)
    {
       names[studentNumber - 1] = name ;
    }

    public void setScores(int studentNumber, double[] scores)
    {
        //write your code here to copy an array of test scores
        //to a student's array of scores using a copyArray method and then assign grade 
        //to student number.
        if (studentNumber == 1) { copyArray(scores1, scores); }
        else if (studentNumber == 2) { copyArray(scores2, scores); }
        else if (studentNumber == 3) { copyArray(scores3, scores); }
        else if (studentNumber == 4) { copyArray(scores4, scores); }
        else if (studentNumber == 5) { copyArray(scores5, scores); }
        else if (studentNumber == 6) { copyArray(scores6, scores); }
        else if (studentNumber == 7) { copyArray(scores7, scores); }
        else if (studentNumber == 8) { copyArray(scores8, scores); }
        else if (studentNumber == 9) { copyArray(scores9, scores); }
        else if (studentNumber == 10) { copyArray(scores10, scores); }

        assignGrade(studentNumber);
    }

    public String getName(int studentNumber)
    {

        //write your code to return students names
        return names[studentNumber - 1];

    }

    public double getAverage(int studentNumber)
    {
        double average;
        //write your code here to return a student’s average test score 
        if (studentNumber == 1) { average = calcAverage(scores1); }
        else if (studentNumber == 2) { average = calcAverage(scores2); }
        else if (studentNumber == 3) { average = calcAverage(scores3); }
        else if (studentNumber == 4) { average = calcAverage(scores4); }
        else if (studentNumber == 5) { average = calcAverage(scores5); }
        else if (studentNumber == 6) { average = calcAverage(scores6); }
        else if (studentNumber == 7) { average = calcAverage(scores7); }
        else if (studentNumber == 8) { average = calcAverage(scores8); }
        else if (studentNumber == 9) { average = calcAverage(scores9); }
        else if (studentNumber == 10) { average = calcAverage(scores10); }
        else { average = 0.0; }

        return average;
    }

    public char getLetterGrade(int studentNumber)
    {

        //write your code here to return a student's letter grade.
        return grades[studentNumber - 1];

    }

    private void copyArray(double[] to, double[] from)
    {
        //write your code here to copy the contents of one array to another.

        for (int i = 0; i < to.length; i++){

            to[i] = from[i];

        }

    } 

    private double calcAverage(double[] scores)
    {
        double total = 0.0, average, lowest;

        lowest = scores[0];
        
        for (int i = 1; i < scores.length; i++)
        {
            if (scores[i] < lowest) { lowest = scores[i]; }
        }

        for (int i = 0; i < scores.length; i++) 
        {
            total += scores[i];
        }

        total -= lowest;

        average = total / (scores.length - 1);

        return average;
    } 

    private void assignGrade(int studentNumber)
    {
        //write your code here to determine and assign a letter grade to a specific student 
        // by calling getAverage, and determineGrade methods

        double average = getAverage(studentNumber);
        grades[studentNumber-1] = determineGrade(average);

    } 

    private char determineGrade(double average)
    {
        char grade;

        if (average >= 90 && average <= 100) { grade = 'A'; }
        else if (average >= 80 && average < 90) { grade = 'B'; }
        else if (average >= 70 && average < 80) { grade = 'C'; }
        else if (average >= 60 && average < 70) { grade = 'D'; }
        else if (average >= 0 && average < 60) { grade = 'F'; }
        else { grade = '?'; }

        return grade;
    }
} 

