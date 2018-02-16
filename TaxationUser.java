import java.util.*;
import java.io.*;
// Class TaxationUser
public class TaxationUser {

// main
public static void main(String[] args) {
	// Instigate the scanner from the java utilities
	Scanner sc = new Scanner(System.in);
	// Print to ask the user to input the salary 
	System.out.println("Please input starting salary:");
	//let the user input a double value
	double grossSalary0 = sc.nextDouble();
	// if the user inputs a value below 0 then tell the user and let them enter again 
	while (grossSalary0<=0){
		System.out.println("Answer Needs to be greater than 0");
		grossSalary0 = sc.nextDouble();
	continue;
	}
	// Print to ask the user to input the yearly increase
	System.out.println("Please input yearly percentage increase:");
	//let the user input a double value
	double salaryIncrease = sc.nextDouble();
	// if the user inputs a value that is not between 0-100 then tell the user and let them enter again 
	while (salaryIncrease<0 || salaryIncrease>100){
		System.out.println("Answer Needs to be between 0  and 100");
		salaryIncrease = sc.nextDouble();
	continue;
	}
	// Print to ask the user to input the yearly increase
	System.out.println("Please input the number of years:");
	//let the user input an integer value
	int numYears = sc.nextInt();
	// if the user inputs a value below 0 then tell the user and let them enter again 
	while (numYears<=0){
		System.out.println("Answer Needs to be above 0");
		numYears = sc.nextInt();
	continue;
	}
	// create an instance of the Taxation class using the users input values
	Taxation taxObject = new Taxation(grossSalary0, salaryIncrease, numYears);
	// call the calcTax method from the Taxation class
	taxObject.calcTax();
	}
}