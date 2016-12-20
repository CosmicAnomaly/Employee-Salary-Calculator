package Lab_7;

public class HourlyEmployee extends Employee
{
	public double payRate;
	public int hoursWorked;
	
	public HourlyEmployee(){}
	
	public HourlyEmployee(double payRate, int hoursWorked, String firstName, String lastName, double totalPay, String employeeId)
	{
		this.payRate = payRate;
		this.hoursWorked = hoursWorked;
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalPay = totalPay;
		this.employeeId = employeeId;
	}//HourlyEmployee constructor
	
	public double getPayRate() {
		return payRate;
	}//getPayRate

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}//setPayRate

	public int getHoursWorked() {
		return hoursWorked;
	}//getHoursWorked

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}//setPaymentAmount

	public double getPaymentAmount()
	{
		return (payRate * hoursWorked);
	}//getPaymentAmount
}//HourlyEmployee class
