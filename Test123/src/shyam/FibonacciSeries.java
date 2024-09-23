package shyam;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 1,1  2 3 5 8 13 21 34 55 89 144 

		int n1=1;
		int n2=1;

		int sum;

		for(int i=1;i<=10;i++){

			sum=n1+n2;
			n1=n2;
			n2=sum;
			
      System.out.print(sum+" ");
      
		}

	}

}
