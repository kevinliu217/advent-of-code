package code.challenge.day2;

public class Button {

	private String text;
	private int rowIndex;
	private int colIndex;

	public Button(int rowIndex, int colIndex, String text) {
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
		this.text = text;
	}

	public String toString() {
		return text;
	}

	public int getRowIndex() {
		return this.rowIndex;
	}

	public int getColIndex() {
		return this.colIndex;
	}

}
