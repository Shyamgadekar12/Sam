package shyam;

public class ReverseNumber {

	public static void main(String[] args) {

		
// Approach 1 using algorithm
		
		int num=123;
		System.out.println("Before reversing number : " + num);
	    
		/*
		while(num>0)
		{
			int rev=0;
			
			int rem=num%10;
			rev=rev*10+rem; // 0+3=3... 30+2=32 ....320+1=321
			
			num=num/10; // 12...1
		}
	*/	
		
// 	Approach 2 using 	StringBuffer Class
		/*
		StringBuffer sbf= new StringBuffer(String.valueOf(num));
		StringBuffer rev=sbf.reverse();
		*/
		
//	 	Approach 3 using 	StringBuilder Class
		
		StringBuilder sbl= new StringBuilder();
		sbl.append(num);
		StringBuilder rev= sbl.reverse();
		
		System.out.println("After reversing number : " + rev);

	}

}
