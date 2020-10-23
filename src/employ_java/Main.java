package employ_java;
import java.util.Scanner;
public class Main{
	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;
	static void EmployWages(String compny,int EMP_RATE_PER_HOURS,int NUMBER_WORKING_DAYS,int MAX_HRS_IN_MONTH,int full_time,int part_time){
		System.out.println("Employee Wage Computation");
		int EMP_HOURS=0,EMP_WAGES=0,i=0,TOTAL_EMP_WAGES=0,TOTAL_EMP_HOUR=0,TOTAL_WORKING_DAYS=0;
		while(TOTAL_EMP_HOUR<MAX_HRS_IN_MONTH && TOTAL_WORKING_DAYS<NUMBER_WORKING_DAYS){
			int random =(int) Math.floor(Math.random() * 10 ) % 3;
			switch (random){
					case IS_FULL_TIME:	EMP_HOURS=full_time;//full time
										TOTAL_WORKING_DAYS++;
										break;
					case IS_PART_TIME: EMP_HOURS=part_time;//part time
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
		System.out.println("Compeny Name:"+compny);	
	System.out.println("TOTAL HOUR EMPLOY WORKED:"+TOTAL_EMP_HOUR);
	System.out.println("TOTAL EMPLOY WAGES:" + TOTAL_EMP_WAGES);
	}
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Compeny name\nEmploy rate per hour\nnumber of working days\nmaximum hour in mounth\nfull time\npart time");
	String a= s.nextLine();
	int emp=s.nextInt();
	int Wdays=s.nextInt();
	int MaxHr=s.nextInt();
	int full_time=s.nextInt();
	int part_time=s.nextInt();
	EmployWages(a,emp,Wdays,MaxHr,full_time,part_time);
}
}
