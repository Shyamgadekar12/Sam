package shyam;

public class EvenOddNumbersFromArray {

	public static void main(String[] args) {
		
		
		int[] num= {1,2,3,4,5,6,7,8,9};
		
		System.out.print("Even numbers : ");
		for(int value:num) {
			
			if(value%2==0) {
				
				System.out.print(value +" ");
				
			}
			
		}
		
		
		System.out.println();
		
		System.out.print("odd numbers : ");
		for(int value:num) {
			
			if(value%2!=0) {
				
				System.out.print(value +" ");
				
			}
			
		}
	}

}
