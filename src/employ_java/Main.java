package employ_java;

public class Main{
	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;
	private static final int EMP_RATE_PER_HOURS=20;
	static void welcome() {
		System.out.println("Employee Wage Computation");
	}
	static void EmployWages(){
		int EMP_HOURS=0,EMP_WAGES=0;
		double random = Math.floor(Math.random() * 10 ) % 3;
		if(random==IS_FULL_TIME){
                EMP_HOURS=8;//full time
        }
        else if(random==IS_PART_TIME){
                EMP_HOURS=4;//part time
        }
        else{
                EMP_HOURS=0;//absent
        }
        EMP_WAGES=EMP_HOURS*EMP_RATE_PER_HOURS;
        System.out.println("EMPLOY WAGES:" + EMP_WAGES);
	}
	
public static void main(String[] args) {
	welcome();
	Main obj1=new Main();
	obj1.EmployWages();
}
}
