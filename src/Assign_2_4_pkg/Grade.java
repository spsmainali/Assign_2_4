package Assign_2_4_pkg;
import java.util.Scanner;
public class Grade {											//main class
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);					// object for Scanner class is declared
		System.out.print("Enter the marks: ");
		int marks = sc.nextInt();								// input is received with the help of sc object using nextInt()method and stored it in marks variable
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		Grade obj = new Grade();								//an object for current class is created
		obj.calculateGrade(marks, age);							//calculateGrade function is called with the help of current class object obj with arguments marks and age
		sc.close();
		}
	void calculateGrade(int marks, int age){
		if(age>15){												//Checking the condition of age
			if(marks>70)										//Checking the condition for marks  
				System.out.println("Secured Grade : - 'A' ");	//Printing The grade
			else if(marks>60 && marks<70)
				System.out.println("Secured Grade : - 'B' ");
			else if(marks<=60)
				System.out.println("Secured Grade : - 'C' ");
		}
		else{
			if(marks>60)
				System.out.println("Secured Grade : - 'A' ");
			else if(marks>45 && marks<60)
				System.out.println("Secured Grade : - 'B' ");
			else if(marks<=45)
				System.out.println("Secured Grade : - 'C' ");
		}
			
	}

}