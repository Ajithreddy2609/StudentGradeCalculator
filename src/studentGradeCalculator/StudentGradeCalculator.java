package studentGradeCalculator;
import java.util.Scanner;
public class StudentGradeCalculator
  {

	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	int totalsubjects;
	double totalMarks =0;
	double average;
	char grade;
	System.out.print("Enter number of subjects: ");
	totalsubjects = scanner.nextInt();
	for (int i =1;i<= totalsubjects; i++) {
	 System.out.print("Enter marks for subject " + i+":");
	 double marks = scanner.nextDouble();
	 totalMarks += marks;
	}
	average = totalMarks / totalsubjects;
	if(average >= 90)
		grade = 'A';
	else if (average >= 80)
		grade ='B';
	else if (average >=70)
		grade ='C';
	else if ( average >= 60)
		grade ='D';
	else 
		grade ='F';
	System.out.println("Total Marks: " + totalMarks);
	System.out.println("Average Marks: "+ average);
	System.out.println("Grade:" + grade);
	scanner.close();
	}

}
