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

