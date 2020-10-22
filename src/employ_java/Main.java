package employ_java;

public class Main{
	private static final int IS_PRESENT=1;
	private static final int EMP_RATE_PER_HOURS=20;
	static void welcome() {
		System.out.println("Employee Wage Computation");
	}
	static void EmployWages(){
		int emphrs=0,empwages=0;
		double random = Math.floor(Math.random() * 10 ) % 2;
		if(random==IS_PRESENT){
			emphrs=8;
			}
		else{
			emphrs=0;//not present
		}
		empwages=emphrs*EMP_RATE_PER_HOURS;
		System.out.println("emp wages:" + empwages);
	}
	
public static void main(String[] args) {
	welcome();
	Main obj1=new Main();
	obj1.EmployWages();
}
}
