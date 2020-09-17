public class Healer {
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
	
	public Healer(String n) {
		name = n;
		level = 1;
		maxHealth = 16;
		health = maxHealth;
		attack = 4;
		defense = 6;
		magicAttack = 5;
		magicDefense = 10;
		agility = 3;
		wisdom = 12;
	}
	
	public Healer(String n, int l) {
		name = n;
		level = l;
		maxHealth = 16*level;
		health = maxHealth;
		attack = 4*level;
		defense = 6*level;
		magicAttack = 5*level;
		magicDefense = 10*level;
		agility = 3*level;
		wisdom = 12*level;
	}
}
