# Java_Basic_Four

## Generating a grade sheet

The instructor applies the following grading scale in order to assign a letter for a grade to ten students with respect to their average of five exam scores:
Score Range	Letter
From 90 to 100	Excellent grade abbreviated as letter: A
From 80 to 89	Very good grade abbreviated as letter: B
From 70 to 79	Good grade abbreviated as letter: C
From 60 to 69	Pass grade abbreviated as letter: D
From 0 to 59	Fail grade abbreviated as letter: F

Write a class, called GradeSheet, which uses:
•	A String array or an ArrayList object to hold the names of ten students, 
•	An array of five characters to hold the letter grades of ten students, and 
•	Ten arrays of five doubles each to hold each student’s set of test scores. 
The GradeSheet class should have the following methods:
•	The setName method takes a student's number and name and assigns a student's name in a string array.
•	The setScores method copies an array of test scores to a student's array of scores using a copyArray method and at end it calls assignGrade method.
•	The getName method returns a student's name, given a student's number.
•	The getAverage method returns a student's average test score, given a student's number.
•	The getLetterGrade method returns a student's letter grade, given a student's number.
•	The copyArray method copies the contents of one array to another.
•	The calcAverage method calculates the average of the values in an array of test scores after removing the lowest score (e.g., if a student has the scores (98, 89, 100, 76, and 78), it removes 76 and returns average as 91.25.
•	The assignGrade method determines and assigns a letter grade to a specific student by calling the getAverage, and determineGrade methods.
•	The determineGrade method determines a letter grade for a test average.
 
Demonstrate the GradeSheet class in a program, called GradeSheetDemonstration. This program will start by reading the names of ten students and their test scores from a given file (StuentInfo.txt). The program should then display each student’s number, name, average test score, and letter grade, see below the sample run.
Sample run:
 Grade Sheet:
                       ------------
1. Student Name: Joanne Smith 	Average score: 91.25 	Grade: A 
2. Student Name: Will Jones 	Average score: 90.00 	Grade: A 
3. Student Name: Kerry McDonald 	Average score: 84.00 	Grade: B 
4. Student Name: Sam Young 	     Average score: 75.50 	Grade: C 
5. Student Name: Jill Barnes 	Average score: 94.00 	Grade: A 
6. Student Name: Joanne Smith 	Average score: 92.75 	Grade: A 
7. Student Name: Will Jones 	Average score: 68.50 	Grade: D 
8. Student Name: Kerry McDonald 	Average score: 86.25 	Grade: B 
9. Student Name: Sam Young 	     Average score: 88.25 	Grade: B 
10. Student Name: Jill Barnes 	Average score: 0.00 	Grade: F
