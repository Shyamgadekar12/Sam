package shyam;

public class CountNumberOfDigitsInNumber {

	public static void main(String[] args) {


		int num=32154;
		int count =0;

		while(num>0)
		{
			num=num/10;
			count++;
		}

		System.out.println("number having digits :"+count);

	}

}
