public class Quest{
    private String description;
    private int difficulty;
    private Companion[] companions;
    private int numCompanions;

    public Quest(String description, int difficulty){
        if(description == null || description.isEmpty()){
            System.out.println("Error: Quest description cannot be null or empty");
            this.description = "Unnamed Quest";
        }
        else{
            this.description = description;
        }
        if(difficulty < 1 || difficulty > 10){
            System.out.println("Error: Difficulty must be between 1 and 10");
            this.difficulty = 1;
        }
        else{
            this.difficulty = difficulty;
        }
        this.companions = new Companion[5];
        this.numCompanions = 0;
    }

    public String getDescription(){
        return description;
    }
    public int getDifficulty(){
        return difficulty;
    }
    public int getNumCompanions(){
        return numCompanions;
    }
    public boolean addRequiredCompanion(Companion companion){
        if(companions.length > numCompanions){
            companions[numCompanions] = companion;
            numCompanions++;
            return true;
        }
        else{
            System.out.println("Error: Cannot add more companions to this quest.");
            return false;
        }
    }
    public boolean canComplete(Player player){
        if(numCompanions < (difficulty/2)){
            return false;
        }
        int totalPower = 0;
        for (int i = 0; i < numCompanions; i++){
            totalPower += companions[i].getPower();
        }
        if(totalPower < 10 * difficulty){
            return false;
        }
        if(player.getNumArtifacts() < numCompanions){
            return false;
        }
        return true;
    }
    public String attemptQuest(Player player){
        if(canComplete(player)){
            return "Quest completed successfully! " + description;
        }
        else{
            player.takeDamage(difficulty * 10);
            return "Quest failed! The player has taken damage.";
        }
    }
    public String toString(){
        return "Quest{" + "description='" + description + "', difficulty=" + difficulty + ", numCompanions=" + numCompanions + '}';
    }
}