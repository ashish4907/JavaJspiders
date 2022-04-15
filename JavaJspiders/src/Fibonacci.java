//In Fibonacci series, next number is the sum of previous two numbers
//for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc
public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int count = 10;
		
		for(int i=2;i<count;i++) {
			int c = a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
		}
	}
