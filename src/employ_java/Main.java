package employ_java;

public class Main {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOURS=20;
	public static final int NUMBER_WORKING_DAYS=20;
	public static void main(String[] args) {
		int workingdays=20;
		int EMP_HOURS=0,EMP_WAGES=0,TOTAL_EMP_WAGES=0;
		for (int i=0;i<=NUMBER_WORKING_DAYS;i++)
		{
			int random =(int) Math.floor(Math.random() * 10 ) % 3;
		switch (random)
		{
		
			case IS_FULL_TIME:	EMP_HOURS=80;
					break;
		
			case IS_PART_TIME: EMP_HOURS=40;
					break;
			
			default:EMP_HOURS=0;//not present
			
		}
		EMP_WAGES=EMP_HOURS*EMP_RATE_PER_HOURS;
		TOTAL_EMP_WAGES +=EMP_WAGES;
		System.out.println(" EMPLOY WAGES DAY"+i+":" + EMP_WAGES);
		
}
		System.out.println("TOTAL EMPLOY WAGES:" + TOTAL_EMP_WAGES);
	}
		}
