package Lab_7;

import java.text.NumberFormat;

public abstract class Employee 
{
	public String firstName;
	public String lastName;
	public double totalPay;
	protected String employeeId;
	
	public Employee(){}
	
	public Employee(String firstName, String lastName, double totalPay, String employeeId) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalPay = totalPay;
		this.employeeId = employeeId;
	}//Employee Constructor

	public String getFirstName() 
	{
		return firstName;
	}//getFirstName
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}//setFirstName
	
	public String getLastName() 
	{
		return lastName;
	}//getLastName
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}//setLastName
	
	public double getTotalPay() {
		return totalPay;
	}//getTotalPay

	public void setTotalPay(double totalPay) {
		this.totalPay = totalPay;
	}//totalPay
	
	public String getEmployeeId() 
	{
		return employeeId;
	}//getEmployeeID
	


	public void setEmployeeId(String employeeId) 
	{
		this.employeeId = employeeId;
	}//setEmployeeId
	

	
	public abstract double getPaymentAmount();
	
	
	NumberFormat money = NumberFormat.getCurrencyInstance();
	//I used StackOverflow to determine how to format currency in a tostring. I can provide a link if necessary, but the answer was there.
	
	@Override
	public String toString() 
	{
		return "Employee: " + firstName + lastName + "(employeeId)" + " had a total pay of: " + money.format(totalPay);
				
	}//toString
}
//class

