
public class conditionalwage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
 		//Contional Wage
 		System.out.println("\n Conditional Wage:");
 		float hourlyWage = 20/8;
 		double DaysWorked = Math.floor((Math.random()*30));
 		double HoursWorked =  Math.floor((Math.random()*8));
 		double HoursWorkedinMonth = DaysWorked*HoursWorked;
 		
 		if(HoursWorkedinMonth>=100 || DaysWorked>=20) {
 	 		System.out.println("Monthly wage of Employee: "+ HoursWorkedinMonth*hourlyWage);

 		}
 		else {
 	 		System.out.println("Employee doesn't meet Required work Hours");

 		}
		}
	}
