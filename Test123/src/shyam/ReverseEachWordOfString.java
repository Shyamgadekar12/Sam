package shyam;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		
		String name="shyam vishnu gadekar";
	     
	     String[] words= name.split(" ");
	     
	     for(String word:words){
	       
	       
	       char[] ch=word.toCharArray();
	       
	       for(int i=ch.length-1;i>=0;i--){
	         
	         System.out.print(ch[i]);
	         
	       }
	       System.out.print(" ");
	       
	       
	     }

	}

}
