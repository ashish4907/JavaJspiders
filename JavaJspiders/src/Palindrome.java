//A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
// It can also be a string like LOL, MADAM etc.
public class Palindrome {

	public static void main(String[] args) {
	int rem,sum=0,temp;
	int num=151;
	temp=num;
		while(num>0) {
			rem = num%10;
			sum = (sum*10)+rem;
			num=num/10;
		}
			if(temp==sum)    
				   System.out.println("palindrome number ");    
				  else    
				   System.out.println("not palindrome");    
			}
		}


