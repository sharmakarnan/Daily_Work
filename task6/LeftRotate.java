package task6;

public class LeftRotate {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		int n = 2;
		
		System.out.println("Original Array");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int j = 0; j < n; j++) {
			int k,first;
			first = arr[0];
			
			for( k = 0; k < arr.length-1; k++) {
				arr[k] = arr[k + 1];	
			}
			arr[k] = first;
		}
		
		System.out.println();
		System.out.println("After Array");
		for(int c = 0; c < arr.length; c++) {
			System.out.print(arr[c] + " ");
		}

	}

}


