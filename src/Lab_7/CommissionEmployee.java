package Lab_7;

public class CommissionEmployee extends Employee
{
	public double baseSalary;
	public double commissionRate;
	public double totalSales;
	
	public CommissionEmployee(double baseSalary, double commissionRate, double totalSales, String firstName, String lastName, double totalPay, String employeeId)
	{
		super(firstName, lastName, totalPay, employeeId);
		this.baseSalary = baseSalary;
		this.commissionRate = commissionRate;
		this.totalSales = totalSales;
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalPay = totalPay;
		this.employeeId = employeeId;
	} //ComissionEmployee Constructor

	public double getBaseSalary() 
	{
		return baseSalary;
	}//getBaseSalary

	public void setBaseSalary(double baseSalary) 
	{
		this.baseSalary = baseSalary;
	}//setBaseSalary

	public double getCommissionRate() 
	{
		return commissionRate;
	}//getCommissionRate

	public void setCommissionRate(double commissionRate) 
	{
		this.commissionRate = commissionRate;
	}//setCommissionRate

	public double getTotalSales() 
	{
		return totalSales;
	}//getTotalSales

	public void setTotalSales(double totalSales) 
	{
		this.totalSales = totalSales;
	}//setTotalSales
	
	public double getPaymentAmount()
	{
		return (totalSales * commissionRate) + (baseSalary * 12);
	}//getPaymentAmount
	
}
