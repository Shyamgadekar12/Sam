package shyam;

public class PrimeNumberCheck {

	public static void main(String[] args) {

// Prime No : a number which has only 2 factors...i.e divisible by 1 & Itself
		
		
		int num=5;
		int count=0;

		for(int i=1;i<=num;i++ ){

			if(num%i==0){

				count++;

			}

		}


		if(count>2)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("prime");

		}

	}

}
