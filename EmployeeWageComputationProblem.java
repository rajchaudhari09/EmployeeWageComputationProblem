//!/bin/bash -x
// Employee Wage Computation Problem In Java:-
//Check Employee is Present or Absent:-
//							I) Use ((RANDOM)) for Attendance Check
public class EmployeeWageComputationProblem
{
	public static void main(String[] args)
	{
	//Constant
		int isFullTime=1;
	//Computation
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if(employeeCheck == isFullTime)
		{
			System.out.println("Employee is the Present");
		}
		else
		{
			System.out.println("Employee is not the Present");
		}
	}
}
