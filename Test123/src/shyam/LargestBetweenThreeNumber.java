package shyam;

public class LargestBetweenThreeNumber {

	public static void main(String[] args) {
		int a=10;
		int b=30;
		int c=50;

		if(a>b && a>c)
		{
			System.out.println( "a is largest number : " +a );
		}
		else
		{
			if(b>a && b>c)
			{
				System.out.println("b is largest number : " +b );
			}
			else
			{
				System.out.println("c is largest number : " +c );
			}
		}
	}
}
