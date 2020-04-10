import java.util.*;

public class Monster {
	protected byte monsterHealth;
	protected String name;
	protected int attack;
	protected int block;
	
	//Default constructor
	public Monster() {
		monsterHealth = 100;
		attack = 0;
		block = 0;
		name = "none";
	}
	
	//Overload constructor
	public Monster(byte initMonsterHealth, int initAttack, int initBlock, String initName) {
		monsterHealth = initMonsterHealth;
		attack = initAttack;
		block = initBlock;
		name = initName;
	}

	//Methods -- Setters
	public void setMonsterHealth(byte health) {
		monsterHealth = health;
	}
	
	public void setAttack(int attackModifier) {
		attack = attackModifier;
	}
		
	public void setBlock(int blockModifier) {
		block = blockModifier;
	}
	
	public void setName(String nameSetter) {
		name = nameSetter;
	}
	
	//Methods -- Getters
	public byte getMonsterHealth() {
		return monsterHealth;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getBlock() {
		return block;
	}
	
	public String getName() {
		return name;
	}
	
}

class Vader extends Monster {
	Random random = new Random();
	public Vader(byte initMonsterHealth, int initAttack, int initBlock, String initName) {
		super(initMonsterHealth, initAttack, initBlock, initName);
		
	}
	public int fightTime(Character player) {
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