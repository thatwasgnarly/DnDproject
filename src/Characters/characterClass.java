package Characters;
import Characters.Enemy;

public class characterClass {
    protected String name;

    public characterClass(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void useAbility(PlayerCharacter player, Enemy enemy);

    public abstract String getAbilityName();
}
