package swapnil;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		 
		String name="abbcccc";
		
		Map<Character,Integer> mp= new HashMap<>();
		int count=1;
		
		for(Character c:name.toCharArray()) {
			
			if(mp.containsKey(c)) {
				count++;
				
				mp.put(c,count);
				System.out.println(mp.get(c));
			}
			else {
				mp.put(c, 1);
				count=1;
			}
			
		}
		
		for(Map.Entry<Character,Integer> entry:mp.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
		

	}

}
