package employ_java;

public class Main{
	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;
	private static final int EMP_RATE_PER_HOURS=20;
	private static final int NUMBER_WORKING_DAYS=20;
	private static final int MAX_HRS_IN_MONTH=10;
	static void EmployWages(){
		System.out.println("Employee Wage Computation");
		int EMP_HOURS=0,EMP_WAGES=0,i=0,TOTAL_EMP_WAGES=0,TOTAL_EMP_HOUR=0,TOTAL_WORKING_DAYS=0;
		while(TOTAL_EMP_HOUR<MAX_HRS_IN_MONTH && TOTAL_WORKING_DAYS<NUMBER_WORKING_DAYS){
			int random =(int) Math.floor(Math.random() * 10 ) % 3;
			switch (random){
					case IS_FULL_TIME:	EMP_HOURS=8;
										TOTAL_WORKING_DAYS++;
										break;
					case IS_PART_TIME: EMP_HOURS=4;
										TOTAL_WORKING_DAYS++;
										break;
					default:EMP_HOURS=0;//not present
			}
			i++;
			TOTAL_EMP_HOUR +=EMP_HOURS;
			EMP_WAGES=EMP_HOURS*EMP_RATE_PER_HOURS;
			System.out.println(" EMPLOY WAGES DAY"+i+":" + EMP_WAGES);
			TOTAL_EMP_WAGES+=EMP_WAGES;
		}
	System.out.println("TOTAL HOUR EMPLOY WORKED:"+TOTAL_EMP_HOUR);
	System.out.println("TOTAL EMPLOY WAGES:" + TOTAL_EMP_WAGES);
	}
	
public static void main(String[] args) {
	Main obj1=new Main();
	obj1.EmployWages();
}
}
