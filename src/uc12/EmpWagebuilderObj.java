package uc12;

public class EmpWagebuilderObj {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;
	private int totalEmpWage;

	public EmpWagebuilderObj(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}

	public void computeWage()
	{
		int empHrs=0 , totalEmpHrs=0 , totalWorkingDays=0;
		while(totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays)
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() *10 )%3;
			switch(empCheck)
			{
				case IS_FULL_TIME :
					empHrs=8;
					break;
				case IS_PART_TIME :
					empHrs=4;
					break;
				default :
					empHrs=0;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day : " + totalWorkingDays + "  Emp Hrs : " + empHrs);
		}
		totalEmpWage = totalEmpHrs*empRatePerHour;
	}
	public String toString()
	{
		return "Total Emp Wage for Company : " + company + " is : " + totalEmpWage;
	}
	public static void main(String[] args)
	{
		EmpWagebuilderObj dMart = new EmpWagebuilderObj("MI",20, 2, 10);
		EmpWagebuilderObj reliance = new EmpWagebuilderObj("Techjini", 10, 4, 20);
		dMart.computeWage();
		System.out.println(dMart);
		reliance.computeWage();
		System.out.println(reliance);
	}

}