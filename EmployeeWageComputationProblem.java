// Employee Wage Computation Problem In Java:=
import java.util.ArrayList;
import java.util.Scanner;

interface EmployeeWageMethod
{
	public int calculateWage(EmployeeWageComputationProblemNew obj);
}

public class EmployeeWageComputationProblem implements EmployeeWageMethod
{
	public final int isFullTime = 2;
	public final int isPartTime = 1;

	ArrayList<Integer> employeeDailyAndTotalWage = new ArrayList<Integer>();

	public int calculateWage(EmployeeWageComputationProblemNew employee)
	{
		//Variables
		int employeeHours = 0;
		int totalEmployeeHours = 0;
		int totalWorkingDays = 0;
		int employeeDailyWage = 0;
		int employeeTotalWage = 0;
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
			 employeeDailyWage = employeeHours * employee.getemployeeRatePerHour();
			 employeeDailyAndTotalWage.add( employeeDailyWage );

		}

		employeeTotalWage = totalEmployeeHours * employee.getemployeeRatePerHour();
		employeeDailyAndTotalWage.add( employeeTotalWage );
	        employee.settotalEmployeeW( employeeTotalWage );
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

	 while( true )
	 {
		int Choice = 0;
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println(":::::::::::::::::::::::::::WELCOME TO THE EMPLOYEEWAGE::::::::::::::::::::::::::::::::");
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("Choice To The Employee For a Specific Company::=");
			System.out.println("1.Dmart");
			System.out.println("2.BigBazaar");
			System.out.println("3.Exit");
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			Scanner sc = new Scanner(System.in);
			Choice = sc.nextInt();
			if( Choice == 1 )
			{
				System.out.println( "The Total Employee Wage Dmart is: " + EWCPN.get(0).gettotalEmployeeW() );
			}
			else if( Choice == 2 )
			{
				System.out.println( "The Total Employee Wage BigBazaar is: " + EWCPN.get(1).gettotalEmployeeW() );
			}
			else if( Choice == 3 )
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid The Input \n Please Try Again Letter");
			}
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println();
	}

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


