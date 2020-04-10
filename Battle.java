import java.util.*;

public class Battle {
	Scanner input = new Scanner(System.in);
	Random random = new Random();
	
	byte charChoice;

	Character fighter = new Character();
	Monster enemy = new Monster();

	// may need further explanation
	public Battle(Character player, Monster enemy) {
		fighter = player;
		this.enemy = enemy;
	}

	public boolean fight() {
		// Attack Phase
		byte vaderHealth = 100;
		while (fighter.charHealth > 0 && vaderHealth > 0) {
			// Declare Variables for Battle
			int attack;
			int block;
			int charblock = 0;
			// Part 1 of battle
			System.out.println("Vader Health: " + vaderHealth + "\n" + "Player health: " + fighter.charHealth + "\n"
					+ "Do you choose to block or attack? (Select options 1 or 2) \n" + "1. Block\n" + "2. Attack\n");
			charChoice = input.nextByte();
			attack = random.nextInt(100);
			block = random.nextInt(100);
			if (charChoice == 1) {
				if (block > 50) {
					System.out.println("You prepare to block his attack!");
					attack = 0;
					charblock = 25;
				} else {
					System.out.println("You stood there and took it without defending yourself.");
				}
			} // eoif charChoice1
			
			if (charChoice == 2) {
				if (block > 50) {
					System.out.println("He blocked the attack!");
					attack = 0;
				} else {
					System.out.println("He took " + attack + " damage!");
					vaderHealth -= attack;
				}
			}// eoif charChoice2

			// Vader attacks
			attack = random.nextInt(100);
			block = random.nextInt(100) + charblock;
			System.out.println("Darth Vader retaliates.");
			if (block > 50) {
				System.out.println("You block his attack!");
				attack = 0;
			} else {
				System.out.println("you took " + attack + " damage!");
				fighter.charHealth -= attack;
			}
			if (fighter.charHealth <= 0) {
				System.out.println("Darth Vader stands over your dead body and says\n"
						+ "*Your lack of skill amuses me.*\n" + "GAME OVER\n");
				return false;
			}
		} // end of while(charHealth > 0 && vaderHealth > 0)
		return true;
	}// end of fight
}
