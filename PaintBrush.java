
public class PaintBrush {
	
	// Write a method that represents the operation “paint brush” in Paint.
	// The method takes a matrix of pixels N*N and the coordinates of a single
	// pixel of the matrix as parameters.
	// We know that the matrix contains areas, surrounded by black pixels
	// (cells that contain the letter 'b').
	// The method then paints the whole area around the pixel that is surrounded
	// by black pixels or that ends with the border of the matrix.
	// Painting the area means setting all pixels to red (the letter 'r').
	
	public static void main(String[] args) {

		char[][] matrix = {

				{ ' ', ' ', ' ', 'b', 'b', ' ' }, 
				{ ' ', ' ', 'b', ' ', 'b', ' ' }, 
				{ ' ', ' ', 'b', ' ', 'b', ' ' },
				{ ' ', ' ', 'b', 'b', 'b', ' ' }, 
				{ ' ', ' ', ' ', ' ', ' ', ' ' }, 
				{ ' ', ' ', ' ', ' ', ' ', ' ' } };
		print(matrix);
		paint(matrix, 2, 3);
		print(matrix);

	}

	static void paint(char[][] matrix, int i, int j) {

		// check for the borders and if the cell is empty
		if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] != ' ') {
			return;
		}
		matrix[i][j] = 'r';

		// check if around the current cell are cells which cannot be colored ('b' or borders)
		if (!canPaint(matrix, i, j + 1) && !canPaint(matrix, i, j - 1) && !canPaint(matrix, i + 1, j)
				&& canPaint(matrix, i - 1, j)) {
			return;
		}

		// after all checks if we can fill in the cell, we call the method for this cell
		if (canPaint(matrix, i + 1, j)) {
			paint(matrix, i + 1, j);
		}
		if (canPaint(matrix, i - 1, j)) {
			paint(matrix, i - 1, j);
		}
		if (canPaint(matrix, i, j + 1)) {
			paint(matrix, i, j + 1);
		}
		if (canPaint(matrix, i, j - 1)) {
			paint(matrix, i, j - 1);
		}

	}

	// method which returns true if we can and false if we cannot fill in the cell
	static boolean canPaint(char[][] matrix, int i, int j) {
		return (i >= 0 || i < matrix.length || j >= 0 || j < matrix[i].length || matrix[i][j] == ' ');
	}

	static void print(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
