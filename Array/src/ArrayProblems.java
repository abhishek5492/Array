
public class ArrayProblems {

	public void GenerateSubSequence(int [] arr) {
		
		int pow = (int)Math.pow(2 , arr.length);
		for(int i = 0; i < pow; i++) {
			for(int j = 0; j < arr.length; j++) {
				if((i & (1 << j)) > 0) {
					System.out.print(arr[j]);
				}
			}
			System.out.println("");
		}
	}
	
	public void GenerateSubArray(int [] arr) {
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = i; j < arr.length; j++) {
					for(int k = i; k <= j; k++) {
						System.out.print(arr[k]);
					}
					System.out.println("");
				}
			}
		}
}
