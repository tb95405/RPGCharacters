public class Warrior {
	private String name;
	private int level;
	private int maxHealth;
	private int health;
	private int attack;
	private int defense;
	private int magicAttack;
	private int magicDefense;
	private int agility;
	private int wisdom;
	
	//constructor for a level 1 character
	public Warrior(String n) {
		name = n;
		level = 1;
		maxHealth = 20;
		health = maxHealth;
		attack = 10;
		defense = 8;
		magicAttack = 0;
		magicDefense = 4;
		agility = 8;
		wisdom = 2;
	}
	
	//constructor for a character with a level greater than level 1
	public Warrior(String n, int lev) {
		name = n;
		level = lev;
		maxHealth = 20*lev;
		health = maxHealth;
		attack = 10*lev;
		defense = 8*lev;
		magicAttack = 0;
		magicDefense = 4*lev;
		agility = 8*lev;
		wisdom = 2*lev;
	}

}
