//!/bin/bash -x
// Employee Wage Computation Problem In Java:=

public class EmployeeWageComputationProblem
{
	public static final int isFullTime = 2;
	public static final int isPartTime = 1;

	private final String company;
	private final int employeeRatePerHour;
	private final int numerOfWorkingDays;
	private final int maximumHoursInMonth;

	public EmployeeWageComputationProblem(String company, int employeeRatePerHour, int numerOfWorkingDays, int maximumHoursInMonth)
	{
		this.company = company;
		this.employeeRatePerHour = employeeRatePerHour;
		this.numerOfWorkingDays = numerOfWorkingDays;
		this.maximumHoursInMonth = maximumHoursInMonth;

	}

	public static void main(String[] args)
	{
		 EmployeeWageComputationProblem wipro = new  EmployeeWageComputationProblem("wipro", 20, 2, 10);
		//Variables
		int employeeHours = 0;
		int totalEmployeeHours = 0;
		int totalWorkingDays = 0;
		int employeeWage = 0;
		int  totalEmployeeWage = 0;
		//Computation
		while ( totalEmployeeHours <= wipro.maximumHoursInMonth && totalWorkingDays < wipro.numerOfWorkingDays)
		{
			totalWorkingDays++;
			int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
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
		}
				employeeWage = employeeHours * wipro.maximumHoursInMonth;
		  	   totalEmployeeWage += employeeWage;
				totalEmployeeHours += employeeWage;
				System.out.println("EmployeeWage:= " + employeeWage);
				System.out.println("totalEmployeeWage:= " + totalEmployeeWage);

	}
}
