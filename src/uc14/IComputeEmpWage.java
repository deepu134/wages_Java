package uc14;

public interface IComputeEmpWage {
	public void addCompanyEmpWage(String company,int empRateperHour,int workingDays,int maxHours);
	public void computeEmpWage();
	public int getTotalWage(String company);
	}
