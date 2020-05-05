import java.util.Scanner;
//The main story parts
public class Story {
	Scanner input = new Scanner(System.in);

	byte charChoice;

	public void intro(Character player) {
		
		System.out.println(
				"*You wake up hazily in an unknown place. " + "You are in a small room with nothing more than a bed, "
						+ "a nightstand with a lamp and your blaster on it.*");
		Sysyem.out.println(// Dylans code --
			"*Things don't feel right. Its dark and you can't remember a thing. You decide to turn on the lamp and take a "
				+ "moment to think... None of this makes any sense you think to your self. A feeling of dred hangs over "
				+"you.*");
		Sysyem.out.println(// Dylans code --
			"*You start pacing around the room devising a plan when suddenly you hear a loud bang on the door.. " 
			+ "your heart sinks. That didn't sound friendly. ");
		// print options
		System.out.println(
				"*What do you choose to do? (Select options 1, 2, 3)*"
						+ "\n*1. Walk over and open the door.*" + "\n*2. Grab the blaster off the nightstand."
						+ "\n*3. Turn off the light and hide under the bed.");
		charChoice = input.nextByte();

		// Path 1 of Option 1
		if (charChoice == 1) {// Dylans code --
			System.out.println("*You swing the door open hoping to see a familiar face, and a rotten disgusting figure falls on the floor" 
					  + "This has to be a zombie.*");
		}

		// Path 2 of Option 1
		else if (charChoice == 2) {
			player.inventory[0] = "blaster";
			System.out.println("What do you want to do with the blaster?"
					+ "\n*1. Walk over and open the door with the blaster at the ready."
					+ "\n*2. Hunker down and wait to see if something comes in.");
			charChoice = input.nextByte();

			// Path 1 of Path 2 of Option 1
			if (charChoice == 1) {// Dylans code --
				System.out.println("*You get the courage to investigate the banging on the door, with a quick flick of the door handle"
						   + " you open the door with your gun aimed. And a gross dark zombie character falls in front of you.*");
			}
			// Path 2 of Path 2 of Option 1
			else {//Dylans code --
				System.out.println("*You hunker down behind the bed waiting to see what happens.*"
						+ "\n*You wait a few minutes, but nothing happens, so you get up and open the door."
						+ "\n*A dark disgusting figure falls onto the ground.. Must be a zombie.");// Dylans code --
			}
		}
		// Path 3 of Option 1
		else {
			System.out.println("You wait a few minutes, but nothing happens, so you get up and open the door."
					+ "\n*A dark disgusting figure falls onto the ground.. Must be a zombie.");// Dylans code --
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
			System.out.println("*When you turn a corner hundreds of armored zombies are there and notice you, they all sprint after you "
					   + " You die almost instantly \n " + "Game Over!*");// Dylans code --
			return false;

			// Path 3 of Option 2
		} else if (charChoice == 3) {
			System.out.println("*You walk in and get onto the ride. \n "
					+ "Shooting the control panel to start the ride.* \n" + "But, the ride doesn't go anywhere! \n"
					+ "Shit that would've been sick... \n"//Dylans code --
					+ "You climb to the top of the roller coster ride to find the exit. \n"
					+ "You see hundreds of zombies.. Seeing all of the undead people under you is terrifying. \n"//Dylans code--
					+ "So introspective. This moment. How could this have been avoided?.. \n"//Dylans code--
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
