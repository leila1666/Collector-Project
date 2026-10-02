

public class Creature {
    //What it knows
    private String name;
    private String power;
    private String colour;
    private int level;
    private int health;
    private int attackPower;
    private boolean isDead = false;
    //Constructor- how it's born
    public Creature(String name, String power, String colour, int level,int health, int attackPower){
        this.name = name;
        this.power = power;
        this.colour = colour;
        this.level = level;
        this.health = health;
        this.attackPower = attackPower;
        this.isDead = false;

    }

    public void setLevel(int level){
        if (level >= 1){
            this.level = level;
        }else{
            System.out.println("Level must be at least 1.");
        }
    }
    // what it can do
    public void attack(Creature target) {
        System.out.println(this.name + " attacks " + target.getName() + " for " + this.attackPower + " damage! ");
        target.takeDamage(this.attackPower);
    }
    //methods-what it can do
    public String getName(){

        return name;
    }
    public String getPower(){

        return power;
    }
    public String getColour(){

        return colour;
    }
    public int getLevel(){
        return level;
    }
    public void levelUp(){

        level++;
    }
    public int getHealth(){
        return health;
    }
    public int getAttackPower(){
        return attackPower;
    }
    public boolean isDead(){
        return isDead;
    }

    //check if player is already dead
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0){
            health = 0;
            isDead = true;
            System.out.println(name + " is dead.");
    }
        System.out.println(name + " has " + health +" HP left.");

    }

    public String toString(){
        return "Creature [Name=" +name+ ", Power= "+ power + ", Colour= "+ colour+", Level= "+ level+ ", Health= "+ health+ ", Attack Power= "+ attackPower + "]";
    }



}
