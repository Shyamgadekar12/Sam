package shyam;

public class ReverseString {

	public static void main(String[] args) {

		String name = "welcome";
		String rev="";
		
		
// 1 using char array
		/*
		char[] ch= name.toCharArray();

		for(int i=ch.length-1;i>=0;i--)
		{
			rev= rev+ch[i];
		}

		*/
		
// 2 using string (+) concatenation operator
		
		/*
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		*/
		
		//System.out.println(rev);
		
// 	 3 using StringBuffer Class
		
		StringBuffer sbf= new StringBuffer(name);
		
		//System.out.println(sbf.reverse()); //OR
		
		StringBuffer revs =sbf.reverse();
		System.out.println(revs);
		
		
		
		
	}

}
