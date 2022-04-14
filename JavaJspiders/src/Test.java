
public class Test {
public static void main(String[] args) {
	System.out.println("Hello world");
	System.out.println("Hello Java");
	System.out.println("Hi");
	
	for(int i=1;i<21;i++) {
		System.out.println(i+" "+"Hello World");
	}
	String s = "Hello World";
	char[] s1 = s.toCharArray();
	for(int i =s1.length-1;i>0;i--) {
		System.out.println(s1[i]);
	}
}
}
