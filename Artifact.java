public class Artifact{
    private String name;
    private int rarity;
    boolean isCursed;
    public static int totalArtifacts = 0;

    public Artifact(String name, int rarity, boolean isCursed){
        if(name == null || name.isEmpty()){
            System.out.println("Error: Artifact name cannot be null or empty");
            this.name = "Unknown";
        }
        else{
            this.name = name;
        }
        if(rarity < 1 || rarity > 5){
            System.out.println("Error: Rarity must be between 1 and 5");
            this.rarity = 1;
        }
        else{
            this.rarity = rarity;
        }
        totalArtifacts++;
        this.isCursed = isCursed;
    }
    public String getName(){
        return name;
    }
    public int getRarity(){
        return rarity;
    }
    public boolean isCursed(){
        return isCursed;
    }
    public static int getTotalArtifacts(){
        return totalArtifacts;
    }
    public String useArtifact(){
        if(isCursed){
            return "The artifact is cursed! Beware!";
        }
        else{
            return "You use the " + name + " artifact. It glows with magical power!";

    }
}
    public static void resetTotalArtifacts(){
        totalArtifacts = 0;
    }
    public String toString(){
        return "Artifact{name='" + name + "', rarity=" + rarity + ", isCursed=" + isCursed + "}"; 
    }
}