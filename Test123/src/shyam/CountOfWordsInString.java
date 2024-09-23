package shyam;

public class CountOfWordsInString {

	public static void main(String[] args) {

		String name= "Shyam Vishnu Gadekar";
		int count=1;

		for(int i=0;i<name.length();i++)
		{
			if((name.charAt(i)==' ') && (name.charAt(i+1)!=' ')) {
				count++;
			}


		}
		
		System.out.println("number of words in string : "+count);

	}

}
