public class Companion{
    private String name;
    private String role;
    private String ability;
    private int power;
    private Player owner;

    public Companion(String name, String role, int power, Player owner){
        boolean ifInvalid = false;
        if(name == null || name.isEmpty()){
            System.out.println("Error: Companion name cannot be null or empty");
            this.name = "Unknown";
            ifInvalid = true;
        }
        else{
            this.name = name;
        }
        if (role == null || role.isEmpty() || !(role.equals("Mage") || role.equals("Warrior") || role.equals("Healer"))) {
            System.out.println("Error: Companion role should be a Mage, Warrior, or Healer");
            this.role = "Unknown Role Type";
            this.ability = this.name + " rolls around on the ground...";
            ifInvalid = true;
        }
        else {
            this.role = role;
        }
        if(power < 1 || power > 100){
            System.out.println("Error: Power must be between 1 and 100");
            this.power = 1;
            ifInvalid = true;
        }
        else {
            this.power = power;
        }
        if(owner == null){
            System.out.println("Error: Companion must be assigned to a valid Player");
            this.owner = new Player("Default Player", 100);
            ifInvalid = true;
        }
        else{
            this.owner = owner;
        }
        if(ifInvalid){
            System.out.println("Warning: Default values assigned for invalid inputs.");
        }
    }

    public String getName(){
        return name;
    }
    public String getRole(){
        return role;
    }
    public int getPower(){
        return power;
    }
    public Player getOwner(){
        return owner;
    }
    public String useAbility(){
        if(this.role.equals("Mage")){
            return "Mage casts a fireball!";
        }
        else if(this.role.equals("Warrior")){
            return "Warrior swings a mighty sword!";
        }
        else if(this.role.equals("Healer")){
            return "Healer heals the party!";
        }
        else{
            return this.name + "rolls around on the ground...";
        }
    }
    public String toString(){
        return "Companion{name='" + this.name + "', role='" + this.role + "', power=" + this.power + ", " + "owner=" + owner.getName() + "}";
    }
}