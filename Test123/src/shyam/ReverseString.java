package shyam;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Shyam vishnu gadekar";
		String rev="";

		String[] words= name.split(" ");

		for(int i=words.length-1;i>=0;i--)
		{
			rev= rev+words[i]+" ";
		}

		System.out.println(rev);
	}

}
