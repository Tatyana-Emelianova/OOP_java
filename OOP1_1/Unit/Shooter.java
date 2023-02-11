package OOP1_1.Unit;

public class Shooter extends Human{
    Integer fireSpeed;
    Integer fireRange;
    Integer arrowCount;


    public Shooter(String name, Integer hp, Integer attack, Integer secrecy, Integer speed, Integer protection, Integer damageMin, Integer damageMax) {
        super(name, hp, attack, secrecy, speed, protection, damageMin, damageMax);
    }
}


