package shyam;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {
		
		
		//Appraoch1 - Random

	  Random rand=new Random();

		int rand_int=rand.nextInt(1000); // generate random between 1-1000
		System.out.println(rand_int);

		double rand_dbl=rand.nextDouble(); //range 0.0 and less than 1.0
		System.out.println(rand_dbl);
		
//---------------------------------------
		
		//Approach2 - Math
		
		System.out.println(Math.random()); // generates decimal numbers only
		
//===================================================================================
		
		// Random String --> for this we need add Apache commons-lang API/jar file
		//https://commons.apache.org/proper/commons-lang/download_lang.cgi
		
  
		String randNum=RandomStringUtils.randomNumeric(3); // here we provide N-digit value
		System.out.println(randNum);

		String ranStr=RandomStringUtils.randomAlphabetic(7);
		System.out.println(ranStr);
		
		
	}

}
