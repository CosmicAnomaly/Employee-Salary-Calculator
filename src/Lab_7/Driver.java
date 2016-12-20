package Lab_7;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double allEmployeesPayTotal = 0;
		int count = 0;
		String firstName;
		String lastName;
		String employeeId;
		
		ArrayList<HourlyEmployee> hourlyEmployeeList = new ArrayList<HourlyEmployee>();
		ArrayList<CommissionEmployee> commissionEmployeeList = new ArrayList<CommissionEmployee>();
		ArrayList<SalariedEmployee> salariedEmployeeList = new ArrayList<SalariedEmployee>();
		
		System.out.print("Please enter the number of employees to be processed: ");
		count = input.nextInt();
		
		while (count != 0)
		{		
			System.out.print("Please enter the employee type(H-Hourly, S-Salary, C-Commission): ");
			String type = input.next();
			
			switch(type.toUpperCase())
			{
			case "H":
				System.out.print("Please enter the first name of the employee: ");
				firstName = input.next();
				System.out.print("Please enter the last name of the employee: ");
				lastName = input.next();
				System.out.print("Please enter the employee ID: ");
				employeeId = input.next();
				System.out.print("Please enter the hours worked for the hourly employee: ");
				int hoursWorked = input.nextInt();
				System.out.print("Please enter the rate of pay of the hourly employee: ");
				double payRate = input.nextDouble();
				System.out.println();
	
				HourlyEmployee hourlyTempEmployee = new HourlyEmployee(payRate, hoursWorked, firstName, lastName, 0, employeeId);
				double totalPay = hourlyTempEmployee.getPaymentAmount();
				HourlyEmployee hourlyTempEmployee2 = new HourlyEmployee(payRate, hoursWorked, firstName, lastName, totalPay, employeeId);
				
				hourlyEmployeeList.add(hourlyTempEmployee2);
				
				allEmployeesPayTotal = allEmployeesPayTotal + hourlyTempEmployee2.getPaymentAmount();
				
				count--;
				break;
				
			case "C":
				System.out.print("Please enter the first name of the employee: ");
				firstName = input.next();
				System.out.print("Please enter the last name of the employee: ");
				lastName = input.next();
				System.out.print("Please enter the employee ID: ");
				employeeId = input.next();
				System.out.print("Please enter the commission rate of the commissioned employee: ");
				double commissionRate = input.nextDouble();
				System.out.print("Please enter the base monthly salary of the commissioned employee: ");
				double baseSalary = input.nextDouble();
				System.out.print("Please enter the total sales of the commissioned employee: ");
				double totalSales = input.nextDouble();
				System.out.println();
				
				CommissionEmployee commissionTempEmployee = new CommissionEmployee(baseSalary, commissionRate, totalSales, firstName, lastName, 0, employeeId);
				double totalPay2 = commissionTempEmployee.getPaymentAmount();
				CommissionEmployee commissionTempEmployee2 = new CommissionEmployee(baseSalary, commissionRate, totalSales, firstName, lastName, totalPay2, employeeId);
				
				commissionEmployeeList.add(commissionTempEmployee2);
				
				allEmployeesPayTotal = allEmployeesPayTotal + commissionTempEmployee2.getPaymentAmount();
				
				count--;
				break;
				
			case "S":
				System.out.print("Please enter the first name of the employee: ");
				firstName = input.next();
				System.out.print("Please enter the last name of the employee: ");
				lastName = input.next();
				System.out.print("Please enter the employee ID: ");
				employeeId = input.next();
				System.out.print("Please enter the base monthly salary of the salaried employee: ");
				double baseSalary2 = input.nextDouble();
				System.out.println();
				
				SalariedEmployee salaryTempEmployee = new SalariedEmployee(baseSalary2, firstName, lastName, 0, employeeId);
				double totalPay3 = salaryTempEmployee.getPaymentAmount();
				SalariedEmployee salaryTempEmployee2 = new SalariedEmployee(baseSalary2, firstName, lastName, totalPay3, employeeId);
				
				salariedEmployeeList.add(salaryTempEmployee2);
				
				allEmployeesPayTotal = allEmployeesPayTotal + salaryTempEmployee2.getPaymentAmount();
				
				count--;	
				break;
				
			}//Switch statement		
			
		}//While loop
		
		for (HourlyEmployee hourlyList : hourlyEmployeeList)
			System.out.println(hourlyList);
		for (CommissionEmployee commissionList : commissionEmployeeList)
			System.out.println(commissionList);
		for (SalariedEmployee salaryList : salariedEmployeeList)
			System.out.println(salaryList);
		
		System.out.println();
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.print("The total paid to all employees is: " + money.format(allEmployeesPayTotal));
	}//main
}//Driver class
