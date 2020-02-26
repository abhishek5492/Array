
public class ArrayProblems {
	
	public void PrintArray(int [] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

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

	public void ProductArrayPuzzle(int [] arr) {
		int n = arr.length;
		int [] left = new int[n];
		int [] right = new int[n];		
		left[0] = 1;
		for(int i = 1; i< n; i++) {
			left[i] = left[i-1] * arr[i-1];
		}
		right[n-1] = 1;
		for(int i = n-2; i>=0; i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		for(int i = 0; i < n; i++) {
			System.out.print(left[i] * right[i] + " ");
		}
		
	}
}
