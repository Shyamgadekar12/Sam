package shyam;

import java.util.HashMap;
import java.util.Map;

public class OccurancyOfCharacters {

	public static void main(String[] args) {

		// question asked in interview
// edited online
		
		String str="aaaabbbccccceeeeee";
		
		 Map<Character,Integer> hs= new HashMap();
		 
		 char[] a= str.toCharArray();
		 
		 
		
		 for(int i=0;i<a.length;i++)
		 {
			 int count=0;
			 
			 for(int j=0;j<a.length;j++)
				 {
				     if(a[i]==a[j])
				     {
				    	 count++;
				     }
				     
				 }
			 hs.put(a[i], count);
		 }
		 
		
		 for (Map.Entry<Character, Integer> entry : hs.entrySet()) 
			{
				System.out.print(entry.getKey() + "" + entry.getValue());
			}
		
		
		
		
		
		
/*		String str="aaaabbbccccceeeeee";
		 Map<Character,Integer> hs= new HashMap();
		 
		 for(Character c: str.toCharArray())
			 {
			     
			     if(hs.containsKey(c))
			     {
			    	 hs.put(c, hs.get(c)+1);
			     }
			     else {
			    	 
			    	 
			    	 hs.put(c, 1);
			     }
			 
			 }
			 System.out.println(hs);
*/		 
		

	
		
/*      // form chat GPT
 
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
		
			System.out.println(hs);
		
*/
		
		
		
	
		

	}
}
