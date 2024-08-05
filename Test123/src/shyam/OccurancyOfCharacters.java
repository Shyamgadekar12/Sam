package shyam;

import java.util.HashMap;
import java.util.Map;

public class OccurancyOfCharacters {

	public static void main(String[] args) {

		// question asked in interview

		String str="aaaabbbccccceeeeee"; // desired o/p--> a4b3c5e6

		char[] ch=str.toCharArray();

		Map<Character,Integer> hs= new HashMap();


		for(char ech:ch)
		{

			if(hs.containsKey(ech))
			{
				hs.put(ech, hs.get(ech)+1);
			}
			else
			{
				hs.put(ech,1);
			}

		}


		for (Map.Entry<Character, Integer> entry : hs.entrySet()) 
		{
			System.out.print(entry.getKey() + "" + entry.getValue());
		}

	}
}
