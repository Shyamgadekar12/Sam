package shyam;

public class SumOfNumbersFromArray {

	public static void main(String[] args) {


		int[] num= {4,3,5};
		int sum=0;
		
		// 1 approach
		
	/*	for(int i=0;i<num.length;i++) {
			
			sum=sum+num[i];
			
			}
		*/
		
		// 2 approach---using advance for loop
		
		for(int value:num) {
			
			sum=sum+value;
			
		}
		
		System.out.println(sum);
		
	}

}
