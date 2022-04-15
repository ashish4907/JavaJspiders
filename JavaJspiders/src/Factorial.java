// Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!
// 4! = 4*3*2*1 = 24  
// 5! = 5*4*3*2*1 = 120  
public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int factorial =1;
		for(int i=1;i<=num;i++) {
			factorial = factorial*i;}
		
			System.out.println(factorial);
		}
}


