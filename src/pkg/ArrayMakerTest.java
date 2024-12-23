package pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayMakerTest {

	@Test
	void makeArray1() {
		ArrayMaker  am = new ArrayMaker();
		assertArrayEquals(new int[]{1,2,3}, am.makeArray1(3));
	}
	
	

}
