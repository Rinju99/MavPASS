/*Many graphics algorithms use a grid approach that looks at the value of nearest-neighbor pixels. 
Here we'll start with a very simple algorithm to find the smallest sum of nearest-neighbor pixels.
Imagine a 6x6 two-dimensional array of integers:

1 1 1 0 0 0
1 0 1 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
You can see a "hollow square" of values at the top left, which are the nearest-neighbors of the element at [1, 1]. The sum of these values is 8. There are 16 possible hollow-squares in the 6x6 grid. Your task is to calculate the nearest-neighbor-sum of each, and return the biggest (which in this case would be 8 -- some of the other neighbor-sums in this grid are 4, 3, 2, and 1. The array will always be 6x6.
*/


public class maxSum {
	
	public static void main(String[] args) {  // 1,2,3
		
		int[][] arr = new int[][] {
			{1, 2, 3, 4, 5, 6},
			{2, 2, 1, 1, 1, 1},
			{3, 1, 3, 1, 1, 1},
			{4, 1, 1, 4, 1, 1},
			{5, 1, 1, 1, 5, 1},
			{6, 1, 1, 1, 6, 6}
			};
											
		System.out.println("max is - " + maxNeighborSum(arr));   //21
								
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

