package shyam;

public class SpecialCharactersFromString {

	public static void main(String[] args) {
		
		
// Print special char
		
		String str = "SHyam12345@#$%&";

		str = str.replaceAll("[a-zA-Z0-9]", ""); 

		System.out.println(str); // Output will be: @#$%&
		
		
		    //----------------------
		for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                System.out.print(c);
            }
        }
		
// Remove Special characters
		
		System.out.println();
		
		String str2 = "SHyam12345@#$%*";
		// Remove special characters and digits
		str2 = str2.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(str2); // Output will be: SHyam12345

// 
		String str3="SHyam12345@#$%*";
		str3 = str3.replaceAll ("[^0-9]", "");
        System.out.println(str3); // Output will be: 12345
        
        
        


	}

}
