package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		
		int num = 15;
		boolean IsPrime = true;
	
		
		for(int i = 2; i < num; i++) {
		   
			if (num % i == 0) 
			{
				IsPrime = false;
				break;
				
			}
		}
		if (IsPrime) {
			System.out.print("Prime");
		}
		else {
			System.out.print("Not Prime");
		}
	}
}
