package employ_java;

public class Main{
	static void welcome() {
		System.out.println("Employee Wage Computation");
	}
	static void PresentOrNot() {
		double random = Math.floor(Math.random() * 10 ) % 2;
		int IS_PRESENT=1;
		if(random==IS_PRESENT)
		{
			System.out.println("PRESENT");
		}
		else
		{
			System.out.println("ABSENT");
		}
	}
	
public static void main(String[] args) {
	welcome();
	Main obj1=new Main();
	obj1.PresentOrNot();
}
}
