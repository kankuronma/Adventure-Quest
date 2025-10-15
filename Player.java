public class Player{
    private String name;
    private int health;
    private Artifact[] inventory;
    private int numArtifacts;

    public Player(String name, int health){
        boolean invalid = false;
        if(name == null || name.isEmpty()){
            System.out.println("Error: Player name cannot be null or empty");
            this.name = "Unknown";
            invalid = true;
        }
        else{
            this.name = name;
        }
        if (health < 0 || health > 100){
            System.out.println(" Error: Health must be between 0 and 100");
            this.health = 100;
            invalid = true;
        }
        else{
            this.health = health;
        }
        this.inventory = new Artifact[10];
        if(invalid){
            System.out.print(" Warning: Default values assigned for invalid inputs.");
        }

    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getNumArtifacts(){
        return numArtifacts;
    }
    public boolean collectArtifact(Artifact artifact){
        if(numArtifacts >=10){
            System.out.println("Error: Inventory is full, cannot add more artifacts.");
            return false;
        }
        inventory[numArtifacts] = artifact;
        numArtifacts++;
        return true;

    }
    public void takeDamage(int amount){
        if (amount < 0){
            System.out.println("Error: Damage amount cannot be negative.");
        }
        health -= amount;
        if(health < 0){
            health = 0;
        }
    }
    public String toString(){
        return  "Player{name='" + name + "', health=" + health + ", numArtifacts=" + numArtifacts + "}";
    }
}