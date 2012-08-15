package flood.model.panel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestArrayRotator {

	@Test
	public void test1x1() {
		int[][] array = new int[1][1];
		array[0][0] = 5;
		ArrayRotator rotator = new ArrayRotator();
		int[][] rotated = rotator.rotateAC(array);
		assertEquals(5, rotated[0][0]);
	}

	@Test
	public void test2x2() {
		int[][] array = new int[2][2];
		array[0][0] = 0;
		array[0][1] = 1;
		array[1][0] = 2;
		array[1][1] = 3;
		ArrayRotator rotator = new ArrayRotator();
		int[][] rotated = rotator.rotateAC(array);
		assertEquals(1, rotated[0][0]);
		assertEquals(3, rotated[0][1]);
		assertEquals(0, rotated[1][0]);
		assertEquals(2, rotated[1][1]);
	}

	@Test
	public void test3x3() {
		int[][] array = new int[3][3];
		array[0][0] = 0;
		array[0][1] = 1;
		array[0][2] = 2;
		array[1][0] = 3;
		array[1][1] = 4;
		array[1][2] = 5;
		array[2][0] = 6;
		array[2][1] = 7;
		array[2][2] = 8;
		ArrayRotator rotator = new ArrayRotator();
		int[][] rotated = rotator.rotateAC(array);
		assertEquals(rotated[0][0], 2);
		assertEquals(rotated[0][1], 5);
		assertEquals(rotated[0][2], 8);
		assertEquals(rotated[1][0], 1);
		assertEquals(rotated[1][1], 4);
		assertEquals(rotated[1][2], 7);
		assertEquals(rotated[2][0], 0);
		assertEquals(rotated[2][1], 3);
		assertEquals(rotated[2][2], 6);
	}

}
