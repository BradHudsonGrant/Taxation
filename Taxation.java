import java.util.*;
import java.io.*;
// Class Taxation
public class Taxation {

	// Attributes
	private double grossSalary0;
	private double salaryIncrease;
	private int numYears;
		
	//Constructors
	public Taxation (double salary, double inc, int userYears){
	grossSalary0 = salary;
	salaryIncrease = inc;
	numYears = userYears;
	}
	
	// Method to calculate the taxation 
	public void calcTax(){
		final double boundary = 30000;
		final double lowTax = 0.2;
		final double highTax = 0.5;
		int year = 1;
		double grossSum = 0;
		double taxSum = 0;
		double netSum = 0;
		double netsalary = 0;
		double taxPaid = 0;
		double grossSalary1 = 0;
		
		// while numYears larger and equal to 1 then go through lump
		while (numYears>=1){
			System.out.println("\n");
			// Print the current year
			System.out.println("Year:" + (year));
			// Print the current Salary before tax
			System.out.printf("Salary before tax: " + "\u00A3" + "%.2f\n",(grossSalary0));
			// if the current salary is smaller than the boundary then carry out this calculation to work out the tax paid 
			if (grossSalary0<=boundary){
				taxPaid = (grossSalary0*lowTax);
			}
			// if the salary is above the boundary then work out the tax paid with the high tax band equation 
			else if (grossSalary0>boundary){
				taxPaid = (boundary*lowTax)+((grossSalary0-boundary)*highTax);
			}
			// assign netsalary with the the value of the salary and tax paid added
			netsalary = grossSalary0-taxPaid;
			
			// work out the total of the gross, tax and net salary
			grossSum = grossSum + grossSalary0;
			taxSum = taxSum + taxPaid;
			netSum = netSum + netsalary;
			// print the tax paid and the salary after tax
			System.out.printf("Tax paid: " + "\u00A3" + "%.2f\n",(taxPaid));
			System.out.printf("Salary after tax: "  + "\u00A3" + "%.2f\n",(netsalary));
			// work out the salary for the next year using the users increase
			grossSalary1 = grossSalary0+(grossSalary0*(salaryIncrease/100));
			// assign the calculation to grossSalary0 so it can be shown for the next loop 
			grossSalary0 = grossSalary1;
			// increment the year
			year++;
			// decrement the numYears
			numYears--;
		}
		// Print the total of Gross Salary, Tax Paid, Net Salary after the loop has finished
		System.out.println("\n");
		System.out.printf("The Gross Total: " + "\u00A3" + "%.2f\n",(grossSum));
		System.out.printf("The Tax Paid Total: " + "\u00A3" + "%.2f\n",(taxSum));
		System.out.printf("The Net Salary Total: " + "\u00A3" + "%.2f\n",(netSum));
	}
}

