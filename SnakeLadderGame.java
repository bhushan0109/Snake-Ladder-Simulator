public class  SnakeLadderGame {
	public static void main(String[] args) {
	int posA = 0;
		// flag 0 : not play , flag 1: play enable
		int dieRolls = 0;
		System.out.println("Snake and Laddar Simulation Game");
		while (true) {
			dieRolls++;
//			logic for player 1
//			roll the die
			int dieA = (int) Math.floor(Math.random() * 10) % 6 + 1;

			int UpOrDownA = (int) Math.floor(Math.random() * 10) % 2 + 1;
//			UpOrDownA values 1:ladder ,  2:snake ,0=not play
			switch (UpOrDownA) {
			case 1:
				posA += dieA; // ladder block
				System.out.println("Ladder " + dieRolls + " getValue " + dieA + " Die Rolls " + posA + " final pos");

				break;

			case 2:
				if (posA <= 0) {
					posA -= 0; // restart from zero

				} else if (posA > 0) {

					posA -= dieA; // snake block
					System.out.println("snake " + dieRolls + " getValue " + dieA + " Die Rolls " + posA + " final pos");

					break;
				}
			default:

			}

			if (posA == 100) {
				System.out.println("Game Over! Player A wins with " + dieRolls + " Die Rolls");
				return;
			}
		}

	}

}
