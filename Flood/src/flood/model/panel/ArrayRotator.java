package flood.model.panel;

public class ArrayRotator {

	/**
	 * Returns a new array containing the elements of the old array rotated by
	 * 90 degrees anticlockwise.
	 * 
	 * @param array
	 * @return
	 */
	public int[][] rotateAC(final int[][] array) {
		int size = array.length;
		int[][] rotated = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				rotated[size - 1 - j][i] = array[i][j];
			}
		}
		return rotated;
	}
}
