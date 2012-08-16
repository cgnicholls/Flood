package flood.model.grid;

import org.junit.Test;

public class TestArrayAbsorber {

	@Test
	public void test1x1Array() {
		int[][] original = new int[1][1];
		original[0][0] = 0;
		ArrayAbsorber absorber = new ArrayAbsorber(original);
		absorber.absorb(0, 0, 1);
		int[][] expected = new int[1][1];
		expected[0][0] = 0;
		org.junit.Assert.assertArrayEquals(expected, original);
	}

	@Test
	public void test2x2Array() {
		int[][] original = new int[2][2];
		original[0][0] = 0;
		original[0][1] = 1;
		original[1][0] = 1;
		original[1][1] = 2;
		ArrayAbsorber absorber = new ArrayAbsorber(original);
		absorber.absorb(0, 0, 1);
		int[][] expected = new int[2][2];
		expected[0][0] = 0;
		expected[0][1] = 0;
		expected[1][0] = 0;
		expected[1][1] = 2;
		org.junit.Assert.assertArrayEquals(expected, original);
	}

	@Test
	public void test3x3ArrayTopRow() {
		int[][] original = new int[3][3];
		original[0][0] = 0;
		original[0][1] = 1;
		original[0][2] = 1;
		original[1][0] = 2;
		original[1][1] = 2;
		original[1][2] = 2;
		original[2][0] = 2;
		original[2][1] = 2;
		original[2][2] = 2;
		ArrayAbsorber absorber = new ArrayAbsorber(original);
		absorber.absorb(0, 0, 1);
		int[][] expected = new int[3][3];
		expected[0][0] = 0;
		expected[0][1] = 0;
		expected[0][2] = 0;
		expected[1][0] = 2;
		expected[1][1] = 2;
		expected[1][2] = 2;
		expected[2][0] = 2;
		expected[2][1] = 2;
		expected[2][2] = 2;
		org.junit.Assert.assertArrayEquals(expected, original);
	}

	@Test
	public void test3x3ArrayExcludingBottomRight() {
		int[][] original = new int[3][3];
		original[0][0] = 0;
		original[0][1] = 1;
		original[0][2] = 2;
		original[1][0] = 2;
		original[1][1] = 2;
		original[1][2] = 2;
		original[2][0] = 2;
		original[2][1] = 2;
		original[2][2] = 1;
		ArrayAbsorber absorber = new ArrayAbsorber(original);
		absorber.absorb(0, 0, 1);
		int[][] expected = new int[3][3];
		expected[0][0] = 0;
		expected[0][1] = 0;
		expected[0][2] = 2;
		expected[1][0] = 2;
		expected[1][1] = 2;
		expected[1][2] = 2;
		expected[2][0] = 2;
		expected[2][1] = 2;
		expected[2][2] = 1;
		org.junit.Assert.assertArrayEquals(expected, original);
	}

	@Test
	public void test3x3ArrayFromMiddle() {
		int[][] original = new int[3][3];
		original[0][0] = 2;
		original[0][1] = 1;
		original[0][2] = 2;
		original[1][0] = 1;
		original[1][1] = 0;
		original[1][2] = 1;
		original[2][0] = 2;
		original[2][1] = 1;
		original[2][2] = 2;
		ArrayAbsorber absorber = new ArrayAbsorber(original);
		absorber.absorb(1, 1, 1);
		int[][] expected = new int[3][3];
		expected[0][0] = 2;
		expected[0][1] = 0;
		expected[0][2] = 2;
		expected[1][0] = 0;
		expected[1][1] = 0;
		expected[1][2] = 0;
		expected[2][0] = 2;
		expected[2][1] = 0;
		expected[2][2] = 2;
		org.junit.Assert.assertArrayEquals(expected, original);
	}
}
