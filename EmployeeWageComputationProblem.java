// Employee Wage Computation Problem In Java:=
import java.util.ArrayList;

interface EmployeeWageMethod
{
	public int calculateWage(EmployeeWageComputationProblemNew obj);
}

public class EmployeeWageComputationProblem implements EmployeeWageMethod
{
	public final int isFullTime = 2;
	public final int isPartTime = 1;

	public int calculateWage(EmployeeWageComputationProblemNew employee)
	{
		//Variables
		int employeeHours = 0;
		int totalEmployeeHours = 0;
		int totalWorkingDays = 0;
		//Computation
		while ( totalEmployeeHours <= employee.getmaximumHoursInMonth() && totalWorkingDays < employee.getnumerOfWorkingDays() )
		{
			totalWorkingDays++;
			int employeeCheck =(int) ( Math.random() * 10 ) % 3;
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

	        employee.settotalEmployeeW(totalEmployeeHours * employee.getemployeeRatePerHour() );
		System.out.println("total Wage of the " + employee.getcompany() + " employee is::  " + employee.gettotalEmployeeW() );
		return totalEmployeeHours;
	}

	public static void main(String[] args)
	{

	 EmployeeWageComputationProblem employeeWageComputationProblem  = new EmployeeWageComputationProblem();

	ArrayList<EmployeeWageComputationProblemNew> EWCPN = new  ArrayList<EmployeeWageComputationProblemNew>();
	 EWCPN.add(new EmployeeWageComputationProblemNew("Dmart",20,10,90));
	 employeeWageComputationProblem.calculateWage(EWCPN.get(0));

	 EWCPN.add(new EmployeeWageComputationProblemNew("Bigbazaar",20,60,90));
	 employeeWageComputationProblem.calculateWage(EWCPN.get(1));


	}
}

class EmployeeWageComputationProblemNew
{
	public String company;
	public int employeeRatePerHour;
	public int numerOfWorkingDays;
	public int maximumHoursInMonth;
	public int totalEmployeeW=0;


	public EmployeeWageComputationProblemNew( String company, int employeeRatePerHour, int numerOfWorkingDays, int maximumHoursInMonth )
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
	public void settotalEmployeeW( int totalEmployeeW )
	{
	 this.totalEmployeeW=totalEmployeeW;
	}
	public int gettotalEmployeeW()	
	{
		return totalEmployeeW;
	}
}


