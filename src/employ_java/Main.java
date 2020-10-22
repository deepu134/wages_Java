package employ_java;

public class Main {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
<<<<<<< HEAD
		double random = Math.floor(Math.random() * 10 ) % 3;
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
=======
		int random =(int) Math.floor(Math.random() * 10 ) % 3;
>>>>>>> UC4-ModifyToSwitchCase
		int EMP_HOURS=0;
		int EMP_RATE_PER_HOURS=20;
		int EMP_WAGES=0;
		switch (random)
		{
			case IS_FULL_TIME:	EMP_HOURS=80;//full time
					break;
		
			case IS_PART_TIME: EMP_HOURS=40;//part time
					break;
			
			default:EMP_HOURS=0;//not present
			
		}
		EMP_WAGES=EMP_HOURS*EMP_RATE_PER_HOURS;
		System.out.println("EMPLOY WAGES:" + EMP_WAGES);
}
=======
		System.out.println(" EMPLOY_WAGES ");
		 double random = Math.floor(Math.random() * 10 ) % 3;
         int IS_FULL_TIME=1;
         int IS_PART_TIME=2;
         int EMP_HOURS=0;
         int EMP_RATE_PER_HOURS=20;
         int EMP_WAGES=0;
         if(random==IS_FULL_TIME)
         {
                 EMP_HOURS=80;//full time

         }
         else if(random==IS_PART_TIME)
         {
                 EMP_HOURS=40;//part time
         }
         else
         {
                 EMP_HOURS=0;//absent

         }
         EMP_WAGES=EMP_HOURS*EMP_RATE_PER_HOURS;
         System.out.println("EMPLOY WAGES:" + EMP_WAGES);

	}
>>>>>>> UC3-DailywagesPartTime
}
