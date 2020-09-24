public class emphours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int empHours=0;
		int empWage=0;
		
		int empCategory = (int) Math.floor((Math.random()*10)%3);
		
		switch(empCategory) {
			case 0:
				System.out.println("Employee is Full Time");
				empHours = 8;
				break;
			case 1:
				System.out.println("Employee is Part Time");
				empHours = 8;
				break;
			default:
				empHours =0;					
					
		}
		empWage = empHours*20;
 		System.out.println("Wage of Employee: "+empWage);
 		}
	}
