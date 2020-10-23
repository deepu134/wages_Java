package employ_java;

public class Main {
	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	public String comp;
	public int total, EMP_RATE_PER_HOURS, NUMBER_WORKING_DAYS, MAX_HRS_IN_MONTH;

	Main(String c, int e, int n, int m) {
		comp = c;
		EMP_RATE_PER_HOURS = e;
		NUMBER_WORKING_DAYS = n;
		MAX_HRS_IN_MONTH = m;
	}

	public void EmployWages() {
		int EMP_HOURS = 0, EMP_WAGES = 0, i = 0, TOTAL_EMP_WAGES = 0, TOTAL_EMP_HOUR = 0, TOTAL_WORKING_DAYS = 0;
		while (TOTAL_EMP_HOUR < MAX_HRS_IN_MONTH && TOTAL_WORKING_DAYS < NUMBER_WORKING_DAYS) {
			int random = (int) Math.floor(Math.random() * 10) % 3;
			switch (random) {
			case IS_FULL_TIME:
				EMP_HOURS = 8;// full time
				TOTAL_WORKING_DAYS++;
				break;
			case IS_PART_TIME:
				EMP_HOURS = 4;// part time
				TOTAL_WORKING_DAYS++;
				break;
			default:
				EMP_HOURS = 0;// not present
			}
			i++;
			TOTAL_EMP_HOUR += EMP_HOURS;
			EMP_WAGES = EMP_HOURS * EMP_RATE_PER_HOURS;
			// System.out.println(" EMPLOY WAGES DAY" + i + ":" + EMP_WAGES);
			TOTAL_EMP_WAGES += EMP_WAGES;
		}
		System.out.println("Compeny Name:" + comp);
		// System.out.println("TOTAL HOUR EMPLOY WORKED:" + TOTAL_EMP_HOUR);
		System.out.println("TOTAL EMPLOY WAGES:" + TOTAL_EMP_WAGES);
	}

	public static void main(String[] args) {
		System.out.println("Employee Wage Computation");
		Main obj1 = new Main("google", 20, 10, 20);
		Main obj2 = new Main("infosys", 10, 30, 10);
		Main obj3 = new Main("Apple", 20, 20, 40);
		obj1.EmployWages();
		obj2.EmployWages();
		obj3.EmployWages();

	}
}
