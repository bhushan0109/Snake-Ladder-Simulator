public class  SnakeLadderGame {
	public static void main(String[] args) {
		int posB = 0;
		int bflag = 1;
		int posA = 0;
		int aflag = 1;
		// flag 0 : not play , flag 1: play enable
		int dieRolls = 0;
		System.out.println("Snake and Laddar Simulation Game");
		while (true) {

//			logic for player 1
//			roll the die
			if (posA == 100) {
				System.out.println("Game Over! Player A wins with " + dieRolls + " Die Rolls");
				break;
			}
			dieRolls++;

			int dieA = (int) Math.floor(Math.random() * 10) % 6 + 1;
			if (aflag == 1) {
				int UpOrDownA = (int) Math.floor(Math.random() * 10) % 2 + 1;
//			UpOrDownA values 1:ladder ,  2:snake ,0=not play
				switch (UpOrDownA) {
				case 1:

					posA += dieA; // ladder block
					
					dieA = (int) Math.floor(Math.random() * 10) % 6 + 1; // again play
					posA += dieA;
					

					break;

				case 2:
					if (posA <= 0) {
						posA -= 0; // restart from zero
						aflag = 0;
						

					} else if (posA > 0) {

						posA -= dieA; // snake block
						if (posA < 0)
							posA = 0;
						
						break;
					}
				default:

				}

			}
			if (aflag == 0) {
				aflag = 1;
				posA = 1;
				
			}

		//}
		
		//while (true) {

//			logic for player 2
//			roll the die
			if (posB == 100) {
				System.out.println("Game Over! Player B wins with " + dieRolls + " Die Rolls");
				break;
			}
			dieRolls++;

			int dieB = (int) Math.floor(Math.random() * 10) % 6 + 1;
			if (bflag == 1) {
				int UpOrDownB = (int) Math.floor(Math.random() * 10) % 2 + 1;
//			UpOrDownB values 1:ladder ,  2:snake ,0=not play
				switch (UpOrDownB) {
				case 1:

					posB += dieB; // ladder block
					dieB = (int) Math.floor(Math.random() * 10) % 6 + 1; // again play
					posB += dieB;
					
					break;

				case 2:
					if (posB <= 0) {
						posB -= 0; // restart from zero
						bflag = 0;
					
					} else if (posB > 0) {

						posB -= dieB; // snake block
						if (posB < 0)
							posB = 0;
						
						break;
					}
				default:

				}

			}
			if (bflag == 0) {
				bflag = 1;
				posB = 1;
				
			}

		}
	

	}}
