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
}
