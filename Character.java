import java.util.Random;
import java.util.Scanner;

public class Character {
	Scanner input = new Scanner(System.in);
	Random random = new Random();

	// character data
	String charName;
	byte charHealth;
	byte charArmor;
	int block = 0;
	String[] inventory = new String[4];
	String[] backpack = new String[10];

	// Initialize variables
	public Character() {
		charName = "Default";
		charHealth = 100;
		charArmor = 100;
		inventory = new String[4];
		backpack = new String[10];
	}

	// set Name
	public void setName() {
		System.out.println("hello there, who are you?");
		charName = input.nextLine();
		System.out.println("Hello " + charName + ".");
	}
	
	public void setName(String name) {
		charName = name;
	}
	public int fightTime(Monster boss) {
		int attackChoice = random.nextInt(2);
		
		if(attackChoice == 0) {
			if(player.block > -1 ) {
				if(player.block > 50 ) {
					return 0;
				}else return random.nextInt(attack);
			}
		}else if (attackChoice == 1){
			return random.nextInt(attack/2);
		}
		return 0;
	}
}
