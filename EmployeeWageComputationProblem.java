// Employee Wage Computation Problem In Java:=

public class EmployeeWageComputationProblem
{
	public final int isFullTime = 2;
	public final int isPartTime = 1;

	public String company;
	public int employeeRatePerHour;
	public int numerOfWorkingDays;
	public int maximumHoursInMonth;
	public EmployeeWageComputationProblem( int employeeRatePerHour, int numerOfWorkingDays, int maximumHoursInMonth)
	{
		this.employeeRatePerHour = employeeRatePerHour;
		this.numerOfWorkingDays = numerOfWorkingDays;
		this.maximumHoursInMonth = maximumHoursInMonth;

	}

	public int  calculateWage()
	{
		//Variables
		int employeeHours = 0;
		int totalEmployeeHours = 0;
		int totalWorkingDays = 0;
		//Computation
		while ( totalEmployeeHours <= maximumHoursInMonth && totalWorkingDays < numerOfWorkingDays )
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
			   System.out.println("Day::=" + totalWorkingDays + "EmployeeHours is the " + employeeHours);

		}
		return totalEmployeeHours;
	}

	public int totalEmployeeW(int totalEmployeeHours)
	{
        	return totalEmployeeHours * employeeRatePerHour;
	}

	public static void main(String[] args)
	{
	 EmployeeWageComputationProblem dMart = new  EmployeeWageComputationProblem( 10, 30, 20);
	 int dMartTotalEmployeeHours=dMart.calculateWage();
	 int totaldMartEmployeeWage=dMart.totalEmployeeW(dMartTotalEmployeeHours);
	 System.out.println("total Wage of dMart employee is: " + totaldMartEmployeeWage);

 
         EmployeeWageComputationProblem bigBazaar = new  EmployeeWageComputationProblem( 30, 50, 60);
         int bigBazaarTotalEmployeeHours=bigBazaar.calculateWage();
         int totalbigBazaarEmployeeWage=bigBazaar.totalEmployeeW(bigBazaarTotalEmployeeHours);
	 System.out.println("total Wage of bigBazaar employee is: " +  totalbigBazaarEmployeeWage);
	}
}
