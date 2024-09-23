package shyam;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {

		int[] a1= {1,2,3,4,5};
		int[] a2= {3,4,2,1,5};


		// approach using Arrays method

		/*	boolean result=Arrays.equals(a1, a2);

		if(result==true) {
			System.out.println("arrays are equals"); //true

		}
		else {
			System.out.println("arrays are Not equals");
		}
		 */

		// approach 2 without using Arrays method

		boolean result=true;

		if(a1.length==a2.length) {

			for(int i=0;i<=a1.length-1;i++) {

				if(a1[i]!=a2[i]) {

					result=false;
				}

			}

		}else
		{

			result=false;
		}

		   if(result==true) 
		    {
			System.out.println("Array are equals");
		    }
		    else 
		    {
			System.out.println("Array are Not equals");
		    }


	}

}
