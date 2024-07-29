package shyam;

public class PalindromeString {

	public static void main(String[] args) {

		String str= "eye";
		String rev= "";
		char[] ch= str.toCharArray();

		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}

		if(rev.equals(str))
		{
			System.out.println("Given string is palindrome string : " + str);
		}
		else
		{
			System.out.println("Not palindrome string");
		}



	}

}
