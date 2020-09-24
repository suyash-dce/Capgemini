public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double empCheck = (int) Math.floor((Math.random()*10)%2);
		System.out.println(empCheck);
		if(empCheck == 0) {
			System.out.println("Employee Present");
		}
		else {
			System.out.println("Employee Absent");
		}
		}

	}