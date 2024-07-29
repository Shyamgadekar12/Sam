package shyam;

public class ReverseNumber {

	public static void main(String[] args) {

		int num=123;
		int rev=0;

		while(num>0)
		{

			int rem=num%10;

			rev=rev*10+rem; // 0+3=3... 30+2=32 ....320+1=321
			num=num/10; // 12...1
		}

		System.out.println("After reversing number : " + rev);

	}

}
