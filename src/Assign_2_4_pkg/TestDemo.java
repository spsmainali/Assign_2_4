package Assign_2_4_pkg;
import java.util.Scanner;
class Input{ 														// a class with constructor defined to find the type of integer value entered 
	Input(int a){
		if(a>0)														// condition to Check positive integer
			System.out.println("You have entered positive value");  // Printing the result
		else if(a==0)												// condition to Check positive integer
			System.out.println("You have entered 0 ");				// Printing the result
		else
			System.out.println("You have entered Negetive value");	// Printing the result			
	}
}
public class TestDemo {												//this is main class
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);						//object of scanner is declared
		System.out.println("Enter any integer");
		int n = sc.nextInt(); 										//function is called to recieve the input
		Input p = new Input(n);										//created opject p which initiates the constructro of class Input
				
	}

}
