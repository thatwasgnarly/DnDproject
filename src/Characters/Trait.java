package Characters;

public class Trait {
    private String name;
    private String description;
    private String bonusType;

    public Trait(String name, String description, String bonusType) {
        this.name = name;
        this.description = description;
        this.bonusType = bonusType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getBonusType() {
        return bonusType;
    }

    public static Trait getTraitByChoice(int choice) {
        switch (choice) {
            case 1:
                return new Trait("Tough", "Gain bonus HP", "hp");
            case 2:
                return new Trait("Clever", "Bonus to Intelligence", "intelligence");
            case 3:
                return new Trait("Fast", "Bonus to Dexterity", "dexterity");
            default:
                System.out.println("Invalid choice. Defaulting to 'Normal'.");
                return new Trait("Normal", "No special trait", "none");
        }
    }

    public void printTraitInfo() {
        System.out.println("Trait: " + name + " - " + description);
    }
}
