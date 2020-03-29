//!/bin/bash -x
// Employee Wage Computation Problem In Java:=

public class EmployeeWageComputationProblem
{
	public static final int isFullTime = 2;
	public static final int isPartTime = 1;
	public static final int employeeRatePerHour = 20;
	public static final int numerOfWorkingDays=2;
	public static void main(String[] args)
	{
		//Variables
		int employeeHours = 0;
		int employeeWage = 0;
		int totalEmployeeWage = 0;
		//Computation
		for (int day = 0; day < numerOfWorkingDays; day++)
		{
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
				employeeWage = employeeHours * employeeRatePerHour;
				totalEmployeeWage += employeeWage;
				System.out.println("EmployeeWage: " + employeeWage);
		}
		System.out.println("totalEmployeeWage: " + totalEmployeeWage);

	}
}
