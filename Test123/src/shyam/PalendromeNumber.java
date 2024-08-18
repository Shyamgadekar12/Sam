package shyam;

public class PalendromeNumber {

	public static void main(String[] args) {
		// palendrome number 34543 ; 12321;

		int num=12321;

		int org=num;
		int rev=0;

		while(num>0)
		{
			rev=rev*10+num%10;

			num=num/10;
		}

		if(org==rev)
		{
			System.out.println("Given number is palendrome number : " +rev);
		}else
		{
			System.out.println("Not a palendrome number");
		}

	}

}
