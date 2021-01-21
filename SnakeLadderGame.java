public class  SnakeLadderGame {
	public static void main(String[] args) {
	int posA = 0; // player A pos zero

		System.out.println("Snake and Laddar Simulation Game");
		while (true) {
			
//			logic for player 1
//			roll the die
			int dieA = (int) Math.floor(Math.random() * 10) % 6 + 1;

			int UpOrDownA = (int) Math.floor(Math.random() * 10) % 2 + 1;
//			UpOrDownA values 1:ladder ,  2:snake ,0=not play
			switch (UpOrDownA) {
			case 1:
				posA += dieA; // ladder block

				break;

			case 2:
				if (posA <= 0) {
					posA -= 0; // restart from zero

					System.out.println("Player A is Knocked Out . Need inside Game");

				} else if (posA > 0) {

					posA -= dieA; // snake block
					if (posA < 0)
						posA = 0;
					break;
				}
			default:
			}

			if (posA == 100) {
				System.out.println("Game Over! Player A wins ");
				return;
			}
		}

	}

}
