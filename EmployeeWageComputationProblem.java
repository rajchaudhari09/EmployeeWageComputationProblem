//!/bin/bash -x
// Employee Wage Computation Problem In Java:=

public class EmployeeWageComputationProblem
{
	public static final int isFullTime = 2;
	public static final int isPartTime = 1;
	public static final int employeeRatePerHour = 20;
	public static final int numerOfWorkingDays=2;
	public static final int maximumHoursInMonth=10;
	public static void main(String[] args)
	{
		//Variables
		int employeeHours = 0;
		int totalEmployeeHours = 0;
		int totalWorkingDays = 0;
		//Computation
		while (totalEmployeeHours <= maximumHoursInMonth && totalWorkingDays < numerOfWorkingDays)
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
				totalEmployeeHours += employeeHours;
				System.out.println("Day#: " + totalWorkingDays + "EmployeeHours:" + employeeHours);
		}
		int totalEmployeeWage = totalEmployeeHours * employeeRatePerHour;
		System.out.println("totalEmployeeWage: " + totalEmployeeWage);

	}
}
