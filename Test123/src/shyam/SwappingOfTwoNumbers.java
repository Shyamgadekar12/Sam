package shyam;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("values bafore Swapping : " +a + ","+b);
		
// Approach 1 == using third variable
		/*
	int temp=a;
		a=b;
		b=temp;
		
		System.out.println("values After Swapping : " +a + ","+b);
		*/
	
// Approach 2  using + & - operators
		/*
		a=a+b; // a=10+20=30
		b=a-b; // b=30-20=10
		a=a-b; // a=30-10=20
		
		System.out.println("values After Swapping : " +a + ","+b);
		*/
		
//	Approach 3 using * & / operators
		
		a=a*b; // a=10*20= 200
		b=a/b; // b=200/20= 10
		a=a/b; // a=200/10= 20
		
		System.out.println("values After Swapping : " +a + ","+b);
		
		
		
	}

}
