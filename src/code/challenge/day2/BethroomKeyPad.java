package code.challenge.day2;

import java.util.ArrayList;

public class BethroomKeyPad {

	@SuppressWarnings("rawtypes")
	private ArrayList<ArrayList> keyPad = new ArrayList<ArrayList>();

	public BethroomKeyPad() {
		// Initial the KeyPad
		ArrayList<Button> row1 = new ArrayList<Button>();
		ArrayList<Button> row2 = new ArrayList<Button>();
		ArrayList<Button> row3 = new ArrayList<Button>();
		row1.add(new Button(0, 0, "1"));
		row1.add(new Button(0, 1, "2"));
		row1.add(new Button(0, 2, "3"));
		row2.add(new Button(1, 0, "4"));
		row2.add(new Button(1, 1, "5"));
		row2.add(new Button(1, 2, "6"));
		row3.add(new Button(2, 0, "7"));
		row3.add(new Button(2, 1, "8"));
		row3.add(new Button(2, 2, "9"));
		keyPad.add(row1);
		keyPad.add(row2);
		keyPad.add(row3);
	}

	@SuppressWarnings("unchecked")
	public String toString() {
		String curKeyPad = "";

		for (ArrayList<Button> curRow : keyPad) {
			curKeyPad += "|";
			for (Button CurButton : curRow) {
				curKeyPad += CurButton + "|";
			}
		}
		return curKeyPad;
	}
	
	public static void main(String[] args) {
		System.out.println(new BethroomKeyPad());
	}
}

enum Direction {
	U, D, R, L;
}
