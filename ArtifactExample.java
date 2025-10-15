public class ArtifactExample {
    public static void main(String[] args) {
    // Valid artifact
    Artifact artifact1 = new Artifact("Excalibur", 5, false);
    System.out.println(artifact1);
    // Artifact{name='Excalibur', rarity=5, isCursed=false}
    System.out.println(artifact1.useArtifact());
    // You use the Excalibur artifact. It glows with magical power!
    // Invalid artifact name
    Artifact artifact2 = new Artifact("", 3, true);
    // Output: Error: Artifact name cannot be null or empty
    System.out.println(artifact2);
    // Artifact{name='Unknown', rarity=3, isCursed=true}
    // Invalid rarity
    Artifact artifact3 = new Artifact("Pandora's Box", 0, true);
    // Output: Error: Rarity must be between 1 and 5
    System.out.println(artifact3);
    // Artifact{name='Pandora's Box', rarity=1, isCursed=true}
    // Both invalid
    Artifact artifact4 = new Artifact("", 6, false);
    // Output:
    // Error: Artifact name cannot be null or empty
    // Error: Rarity must be between 1 and 5
    System.out.println(artifact4); // Artifact{name='Unknown', rarity=1, isCursed=false}
    // Static method usage
    System.out.println("Total artifacts created: " + Artifact.getTotalArtifacts());
    // Output: Total artifacts created: 4
    }
    }