package week1.day2;

public class FibonacciSeries {

//	public static void main(String[] args) {
//		int n=8;
//		int a = 0;
//		int b = 1;
//		
//		for(int i=0; i<n; i++)
//		{
//			
//			int c = a + b;
//			a=b;
//			b=c;
//			
//			if (c<=8) {
//					
//			System.out.print(c + " "); 
//		}
//			else
//			{
//			    break;
//			}
//			
//		}
//	}
//
//}

	

	
	public static void main(String[] args) {
		int n=100;
		int a = 0;
		int b = 1;
		
		for(int i=0; i<n; i++)
		{
			int c = a+b;
			a = b;
			b = c;
			
			if(c%2 >= 0) {
				System.out.println(c + " is the odd number");
			}
			
			else if (c%2 <= 0){
				System.out.println(c + " is the even number");
				
			}
		}
	}

}











































