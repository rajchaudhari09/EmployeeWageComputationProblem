//!/bin/bash -x
// Employee Wage Computation Problem In Java:-
//Check Employee is Present or Absent:-
//							I) Use ((RANDOM)) for Attendance Check
//Calculate Daily Employee Wage:-
//							I) Assume Wage per Hour is 20
//						  II) Assume Full Day Hour is 8
//Add Part Time Employee & Wage:-
//							I)	Assume Part Time Hour is 8
public class EmployeeWageComputationProblem
{
	public static void main(String[] args)
	{
		//Constant
		int isFullTime = 1;
		int isPartTime = 2;
		int employeeRatePerHour = 20;
		//Variables
		int employeeHours = 0;
		int employeeWage = 0;
		//Computation
		double employeeCheck = Math.floor(Math.random() * 10) % 3;
		if (employeeCheck == isPartTime)

			employeeHours = 4;

		else if (employeeCheck == isFullTime)

			employeeHours = 8;

		else

			employeeHours = 0;
			employeeWage = employeeHours * employeeRatePerHour;
			System.out.println("EmployeeWage: " + employeeWage);

	}
}
