package pkg;

public class ArrayMaker {
	
	public int[] makeArray1(int n) {
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		return array;
	}

}
