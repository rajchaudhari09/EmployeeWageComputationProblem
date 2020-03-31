// Employee Wage Computation Problem In Java:=

public class EmployeeWageComputationProblem
{
	public final int isFullTime = 2;
	public final int isPartTime = 1;

	public String company;
	public int employeeRatePerHour;
	public int numerOfWorkingDays;
	public int maximumHoursInMonth;
	public int totalEmployeeW;

	public EmployeeWageComputationProblem(String company, int employeeRatePerHour, int numerOfWorkingDays, int maximumHoursInMonth)
	{
		this.company = company;
		this.employeeRatePerHour = employeeRatePerHour;
		this.numerOfWorkingDays = numerOfWorkingDays;
		this.maximumHoursInMonth = maximumHoursInMonth;

	}

	public String getcompany()	
	{
		return company;
	}

	public int getemployeeRatePerHour()
	{
		return employeeRatePerHour;
	}

	public int getmaximumHoursInMonth()	
	{
		return maximumHoursInMonth;
	}

	public int getnumerOfWorkingDays()	
	{
		return numerOfWorkingDays;
	}

	public int gettotalEmployeeW()	
	{
		return totalEmployeeW;
	}

	public int calculateWage()
	{
		//Variables
		int employeeHours = 0;
		int totalEmployeeHours = 0;
		int totalWorkingDays = 0;
		//Computation
		while ( totalEmployeeHours <= getmaximumHoursInMonth() && totalWorkingDays < getnumerOfWorkingDays() )
		{
			totalWorkingDays++;
			int employeeCheck =(int) Math.floor(Math.random() * 10) % 3;
			switch (employeeCheck)
	   		{
 				case isPartTime:
							employeeHours = 4;
							break;
				case isFullTime:
							employeeHours = 8;
							break;
				default:
							employeeHours = 0;
			}

		  	 totalEmployeeHours += employeeHours;
         	         System.out.println("Day::=" + totalWorkingDays + " employeeHours is::  " + employeeHours);

		}

	        totalEmployeeW = totalEmployeeHours * employeeRatePerHour;
		System.out.println("total Wage of the " + company + " employee is::  " + totalEmployeeW);
		return totalEmployeeHours;
	}

	public static void main(String[] args)
	{

	 EmployeeWageComputationProblem dMart = new EmployeeWageComputationProblem("dMart", 10, 30, 20);
	 dMart.calculateWage();
	 EmployeeWageComputationProblem bigBazaar = new EmployeeWageComputationProblem("bigBazaar", 8, 30, 30);
	 bigBazaar.calculateWage();

	}
}

