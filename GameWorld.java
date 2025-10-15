public class GameWorld{
    private Player[] players;
    private int numPlayers;
    private Artifact[] artifacts;
    private int numArtifacts;
    private Quest[] quests;
    private int numQuests;
    private static GameWorld instance;

    public static GameWorld getInstance() {
        if (instance == null){
            instance = new GameWorld();
        }
        return instance;
    }

    public static GameWorld resetWorld(){
        GameWorld.instance = new GameWorld();
        return instance;
    }

    public GameWorld(){
        this.players = new Player[100];
        this.numPlayers = 0;
        this.artifacts = new Artifact[50];
        this.numArtifacts = 0;
        this.quests = new Quest[20];
        this.numQuests = 0;
    }

    public boolean addPlayer(Player player){
        if(numPlayers < 100){
            players[numPlayers] = player;
            numPlayers++;
            return true;
        }
        else{
            System.out.println("Error: Cannot add more players to the GameWorld.");
            return false;
        }
    }
    public boolean addArtifact(Artifact artifact){
        if(numArtifacts < 50){
            artifacts[numArtifacts] = artifact;
            numArtifacts++;
            return true;
        }
        else{
            System.out.println("Error: Cannot add more artifacts to the GameWorld.");
            return false;
        }
    }
    public boolean addQuest(Quest quest){
        if(numQuests < 20){
            quests[numQuests] = quest;
            numQuests++;
            return true;
        }
        else{
            System.err.println("Error: Cannot add more quests to the GameWorld.");
            return false;
        }
    }
    public Artifact getRandomArtifact() {
        if (numArtifacts > 0){
            int randomIndex = (int) (Math.random() * numArtifacts);
            return artifacts[randomIndex];
        } else {
            System.err.println("Error: No artifacts available in the GameWorld.");
            return null;
        }
    }
    public Player[] getPlayers(){
        Player[] newPlayer = new Player[numPlayers];
        System.arraycopy(players, 0, newPlayer, 0, numPlayers);
        return newPlayer;
    }
    public Quest[] getQuests(){
        Quest[] newQuest = new Quest[numQuests];
        System.arraycopy(quests, 0, newQuest, 0, numQuests);
        return newQuest;
    }
}