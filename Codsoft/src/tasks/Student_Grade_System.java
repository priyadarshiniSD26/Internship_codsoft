package tasks;

import java.util.Scanner;

public class Student_Grade_System {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number of Subjects");
	int n=s.nextInt();
	int[] marks=new int[n];
	System.out.println("Enter each Subjects mark");
	int total_marks=0;
	for(int i=0;i<marks.length;i++) {
		marks[i]=s.nextInt();
		total_marks+=marks[i];
	}
	double average=(double)total_marks/n;
	String grade;
	if(average>=90) {
		grade="A";
	}
	else if(average>=80) {
		grade="B";
	}
	else if(average>=70) {
		grade="C";
	}
	else if(average>=60) {
		grade="D";
	}
	else if(average>=50) {
		grade="E";
	}
	else {
		grade="F";
	}
	 System.out.println("----- Result -----");
     System.out.println("Total Marks: " + total_marks );
     System.out.printf("Average Percentage: %.2f%%\n", average);
     System.out.println("Grade: " + grade);

     s.close();
}
}
