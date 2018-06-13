package code.challenge.day1;

public class WhereIsCityHall {

	private int x = 0;
	private int y = 0;

	private String curDirection = "N";

	public void move(String input) {

		switch (curDirection) {
		case "N":
			if (input.startsWith("R")) {
				x = x + Integer.parseInt(input.substring(1));
				curDirection = "E";
			} else {
				x = x - Integer.parseInt(input.substring(1));
				curDirection = "W";
			}
			break;
		case "E":
			if (input.startsWith("R")) {
				y = y - Integer.parseInt(input.substring(1));
				curDirection = "S";

			} else {
				y = y + Integer.parseInt(input.substring(1));
				curDirection = "N";
			}
			break;

		case "S":
			if (input.startsWith("R")) {
				x = x - Integer.parseInt(input.substring(1));
				curDirection = "W";
			} else {
				x = x + Integer.parseInt(input.substring(1));
				curDirection = "E";
			}
			break;

		case "W":
			if (input.startsWith("R")) {
				y = y + Integer.parseInt(input.substring(1));
				curDirection = "N";
			} else {
				y = y - Integer.parseInt(input.substring(1));
				curDirection = "S";
			}
			break;
		}
		System.out.println("X:" + x + ", Y:" + y);
	}

	public int getDistance() {
		return Math.abs(this.x) + Math.abs(this.y);
	}

	public static void main(String[] args) {
		String[] input = { "R4", "R1", "L2", "R1", "L1", "L1", "R1", "L5", "R1", "R5", "L2", "R3", "L3", "L4", "R4",
				"R4", "R3", "L5", "L1", "R5", "R3", "L4", "R1", "R5", "L1", "R3", "L2", "R3", "R1", "L4", "L1", "R1",
				"L1", "L5", "R1", "L2", "R2", "L3", "L5", "R1", "R5", "L1", "R188", "L3", "R2", "R52", "R5", "L3",
				"R79", "L1", "R5", "R186", "R2", "R1", "L3", "L5", "L2", "R2", "R4", "R5", "R5", "L5", "L4", "R5", "R3",
				"L4", "R4", "L4", "L4", "R5", "L4", "L3", "L1", "L4", "R1", "R2", "L5", "R3", "L4", "R3", "L3", "L5",
				"R1", "R1", "L3", "R2", "R1", "R2", "R2", "L4", "R5", "R1", "R3", "R2", "L2", "L2", "L1", "R2", "L1",
				"L3", "R5", "R1", "R4", "R5", "R2", "R2", "R4", "R4", "R1", "L3", "R4", "L2", "R2", "R1", "R3", "L5",
				"R5", "R2", "R5", "L1", "R2", "R4", "L1", "R5", "L3", "L3", "R1", "L4", "R2", "L2", "R1", "L1", "R4",
				"R3", "L2", "L3", "R3", "L2", "R1", "L4", "R5", "L1", "R5", "L2", "L1", "L5", "L2", "L5", "L2", "L4",
				"L2", "R3" };
		// String[] test1 = { "R2", "L3" };
		// String[] test2 = { "R2", "R2", "R2" };
		// String[] test3= {"R5", "L5", "R5", "R3"};
		// String[] p2 = {"R8", "R4", "R4", "R8"};

		WhereIsCityHall ali = new WhereIsCityHall();
		for (String in : input) {
			ali.move(in);
		}
		System.out.println(ali.getDistance());
	}

}
