

public class maxSum {
	
	public static void main(String[] args) {  // 1,2,3
		
		int[][] arr = new int[][] {
			{1, 2, 3, 4, 5, 6},
			{2, 2, 1, 1, 1, 1},
			{3, 1, 3, 1, 1, 1},
			{4, 1, 1, 4, 1, 1},
			{5, 1, 1, 1, 5, 1},
			{6, 1, 1, 1, 19, 6}
			};
											
		System.out.println("max is - " + maxNeighborSum(arr));  
								
	} // a=[-1,-4,-5]
	
	public static int maxNeighborSum(int[][] arr) {
		int max = neighborSum(arr,1,1);
		
		for(int i=1; i<arr.length-1;i++) {
			for(int j=1; j<arr[i].length-1;j++) {
				int sum= neighborSum(arr,i,j);
			
				if(sum>max) {
					max = sum;
				}
			}
		}
		return max;
	}
	
	public static int neighborSum(int[][] input, int x, int y) {
		int sum =0;
		
		int[] row= {x, x+1,x-1};
		int[] col = {y, y+1, y-1};
		
		for(int i=0; i<row.length;i++) {
			for(int j=0; j<row.length;j++) {
				sum += input[row[i]][col[j]];
			}
		}
		sum = sum-input[x][y];
		return sum;
	}
	
	
	
	
	
}

