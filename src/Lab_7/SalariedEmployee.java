package Lab_7;

public class SalariedEmployee extends Employee
{
	public double baseSal;
	
	public SalariedEmployee(){}
	
	public SalariedEmployee(double baseSal, String firstName, String lastName, double totalPay, String employeeId)
	{
		super(firstName, lastName, totalPay, employeeId);
		this.baseSal = baseSal;
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalPay = totalPay;
		this.employeeId = employeeId;
	}//SalariedEmployee constructor

	public double getBaseSal() 
	{
		return baseSal;
	}//getBaseSal

	public void setBaseSal(double baseSal) 
	{
		this.baseSal = baseSal;
	}//setBaseSal
	
	public double getPaymentAmount()
	{
		return (baseSal * 12);
	}//getPaymentAmount
}
