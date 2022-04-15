
public class ArmStrongNumber {

	public static void main(String[] args) {
		int rem,cubesum=0,temp;
		int num=153;
		temp=num;
			while(num>0) {
				rem = num%10;
				cubesum = cubesum +(rem*rem*rem);
				num=num/10;
			}
				if(temp==cubesum)    
					   System.out.println("armstrong number ");    
					  else    
					   System.out.println("not armstrong");    
				}
}


