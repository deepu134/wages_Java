package UC10;

public class EmpWageArray {

	// TODO Auto-generated method stub
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private CompEmpWages[] CompEmpWages;

	public EmpWageArray() {
		CompEmpWages = new CompEmpWages[5];
	}

	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxhoursPerMonth) {
		CompEmpWages[numOfCompany] = new CompEmpWages(company, empRatePerHour, numOfWorkingDays, maxhoursPerMonth);
		numOfCompany++;
	}

	private void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			CompEmpWages[i].setTotalEmpWage(this.computeEmpWages(CompEmpWages[i]));
			System.out.println(CompEmpWages[i]);
		}
	}

	private int computeEmpWages(CompEmpWages companyEmpWages) {
		int emphrs = 0, totalworkingdays = 0, totalEmphrs = 0;
		while (totalEmphrs < companyEmpWages.maxhoursPerMonth && totalworkingdays < companyEmpWages.numOfWorkingDays) {
			totalworkingdays++;
			int random = (int) Math.floor(Math.random() * 10) % 3;
			switch (random) {

			case 1:
				emphrs = 8;
				break;

			case 2:
				emphrs = 4;
				break;

			default:
				emphrs = 0;// not present
		}
			totalEmphrs += emphrs;
			System.out.println("days" + totalworkingdays + "Emphrs" + emphrs);
		}
		return totalEmphrs + companyEmpWages.empRatePerHour;

	}

	public static void main(String[] args) {
		EmpWageArray empWageBuilder = new EmpWageArray();
		empWageBuilder.addCompanyEmpWage("infosis", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("cognizath", 10, 4, 20);
		empWageBuilder.computeEmpWage();

	}
}
