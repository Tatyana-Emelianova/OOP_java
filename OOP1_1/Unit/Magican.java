package OOP1_1.Unit;

public class Magican extends  Human{
    Integer mana;
    Integer spell;
    Integer hill;


    public Magican(String name, Integer hp, Integer attack, Integer secrecy, Integer speed, Integer protection, Integer damageMin, Integer damageMax, Integer mana, Integer spell, Integer hill) {
        super(name, hp, attack, secrecy, speed, protection, damageMin, damageMax);
        this.mana = mana;
        this.spell = spell;
        this.hill = hill;
    }
}
