import java.util.Scanner;

public class Gradecalcalculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//take mark obtained in each subject
	System.out.println("Enter a total no of subject");
	int numSubject= sc.nextInt();
	int TotalMarks=0;
	System.out.println("obtained marks in each subject");
	for(int i=1;i<=numSubject;i++)
	{
		System.out.println("subject"+i+":");
		int marks=sc.nextInt();
		//validate marks
		while(marks< 0||marks>100)
		{System.out.println("marks should be in range of 0 to 100");
		marks =sc.nextInt();
	
		}
		TotalMarks += marks;
		}
	//Calculate average percentage
	double AveragePercentage= TotalMarks/numSubject;
	
	//Calculate Grade
	  char Grade;
	if(AveragePercentage>=80)
	{
	Grade='A';	
	}
	else if(AveragePercentage>=60)
	{
    Grade='B';
	}
	else if(AveragePercentage>=40)
	{
		Grade='c';
		}
	else
	{
		Grade='F';
	}
	//Display result
	System.out.println("Total marks are:"+TotalMarks);
    System.out.println("Averagepercentage :"+AveragePercentage);
    System.out.println("Grade:"+Grade);
    sc.close();
	}
}
