
// The rotateLeft method takes an array of integers, and an integer number of places, and returns a new copy of the array 
//that contains a "rotated" version of the input array. Rotation means that elements have been shifted leftwards by that 
//number of places, moving elements off one end of the array and onto the other end.The five tests are:

// rotating [0, 1, 2, 3, 4] by 0 should give [0, 1, 2, 3, 4]
// rotating [11, 12, 13, 14, 15] by 1 should give [12, 13, 14, 15, 11]
// rotating [11, 12, 13, 14, 15] by 2 should give [13, 14, 15, 11, 12]
// rotating [11, 12, 13, 14, 15] by 6 should give [12, 13, 14, 15, 11]

import java.util.Arrays;


public class rotate {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5};  // [
		System.out.println(Arrays.toString(rotateLeft(a,4)));
		
	}
	public static int[] rotateLeft(int[] input, int places) {
		int[] result = new int[input.length];
	
		int len = input.length;
		for(int i=0;i<len;i++) {
			int j = (i+places)%len; 
			result[i] = input[j];
			
		}
		return result;
	}
}


