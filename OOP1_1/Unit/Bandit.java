package OOP1_1.Unit;

public class Bandit extends Human{
    Boolean root; //Разбойник имеет особую способность - обездвижить противника на 1 или несколько ходов.(связывание)


    public Bandit(String name, Integer hp, Integer attack, Integer secrecy, Integer speed, Integer protection, Integer damageMin, Integer damageMax) {
        super(name, hp, attack, secrecy, speed, protection, damageMin, damageMax);
    }
}
