import java.util.Scanner;

public class Story {
	Scanner input = new Scanner(System.in);

	byte charChoice;

	public void intro(Character player) {
		System.out.println(
				"*You wake up hazily in an unknown place. " + "You are in a small room with nothing more than a bed, "
						+ "a nightstand with a lamp and your blaster on it.*");
		// print options
		System.out.println(
				"*Suddenly there is a loud bang on the door. What do you choose to do? (Select options 1, 2, 3)*"
						+ "\n*1. Walk over and open the door.*" + "\n*2. Grab the blaster off the nightstand."
						+ "\n*3. Turn off the light and hide under the bed.");
		charChoice = input.nextByte();

		// Path 1 of Option 1
		if (charChoice == 1) {
			System.out.println("*You open the door and a zombie falls dead through the doorway.");
		}

		// Path 2 of Option 1
		else if (charChoice == 2) {
			player.inventory[0] = "blaster";
			System.out.println("What do you want to do with the blaster?"
					+ "\n*1. Walk over and open the door with the blaster at the ready."
					+ "\n*2. Hunker down and wait to see if something comes in.");
			charChoice = input.nextByte();

			// Path 1 of Path 2 of Option 1
			if (charChoice == 1) {
				System.out.println("*A zombie falls dead through the doorway.*");
			}
			// Path 2 of Path 2 of Option 1
			else {
				System.out.println("*You hunker down behind the bed waiting to see what happens.*"
						+ "\n*You wait a few minutes, but nothing happens, so you get up and open the door."
						+ "\n*A zombie falls dead through the doorway.");
			}
		}
		// Path 3 of Option 1
		else {
			System.out.println("You wait a few minutes, but nothing happens, so you get up and open the door."
					+ "\n*A zombie falls dead through the doorway.");
		}
	}

	// Part 2
	public boolean part2() {
		// Part 2: Outside the door!
		System.out.println("*Your standing out side in front of a sign that says \" ATAT Ride \"*");
		System.out.println("You see several theme park rides around you. What do you do? \n "
				+ "(Select options 1, 2, 3) \n" + "1. Turn right \n" + "2. Turn left \n" + "3. Enter the ATAT ride");
		// Option 2
		charChoice = input.nextByte();

		// Path 1 of Option 2
		if (charChoice == 1) {
			System.out.println("*You were over ran by armored zombies that eat your flesh! \n " + "Game Over!*");
			return false;

			// Path 3 of Option 2
		} else if (charChoice == 3) {
			System.out.println("*You walk in and get onto the ride. \n "
					+ "Shooting the control panel to start the ride.* \n" + "But, the ride doesn't go anywhere! \n"
					+ "You climb to the top of the roller coster ride to find the exit. \n"
					+ "You see a hundreds of zombies! \n"
					+ "You climb back down where you came and see a zombie waiting for you!\n"
					+ "Do you shoot it or run? (Select options 1 or 2) \n" + "1. Shoot the zombie in the head. \n"
					+ "2. RUN!!!!!!");
			charChoice = input.nextByte();
			if (charChoice == 1) {
				System.out.println(
						"You aim for the head and shoot once! \n " + "The zomibe's head explodes in a pile of goo! \n");
			} // if end
			System.out.println("You run out onto the street to the left!");
		} // else if end
		return true;
	}

	// Part 3
	public boolean part3(Character player) {
		Vader spock = new Vader((byte) 125,10,10,"Lord Vader");
		System.out.println(
				"You are heading down the left and see Zombie Darth Vader and a dead Luke Skywalker in front of you.\n "
						+ "What do you do?  (Select options 1 or 2) \n" + "1. Search Luke.\n"
						+ "2. Shoot zombie Darth vader.\n");
		charChoice = input.nextByte();
		if (charChoice == 2) {
			if (player.inventory[0] != null && player.inventory[0].equals("blaster")) {
				System.out.println("Darth vader laughs and deflects the bolt back at your face!\n" + "GAME OVER");
			} else {
				System.out.println("You have nothing to shoot with ad you get sliced"
						+ " in half with Vader's lightsaber. GAME OVER! \n");
			}
			return false;
		} // end of if charChoice2
		System.out.println("You search luke and find his Lightsaber. " + "You ignite it and enter into a duel.");
		player.inventory[1] = "lightsaber";

		// new fight
		Battle vaderfight = new Battle(player, (Monster)spock);
		vaderfight.fight();
		return true;
	}
}
