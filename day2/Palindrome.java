package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num =121;
		int original = num;
		int reverse = 0;
		
		for(;num!=0; num = num/10) {
			int lastdigit = num%10;
			reverse = reverse *10 + lastdigit;
		}
		if(original == reverse) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
