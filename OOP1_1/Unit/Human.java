package OOP1_1.Unit;

// Абстрактный класс: имя, раса, здоровье, атака, защита, скорость
//

//Крестьянин: Имя, раса, здоровье, выносливость, навык труда, специализация,
// Разбойник:  Имя, раса, здоровье, выносливость, навык атаки, скрытность, владение оружием
// Снайпер: Имя, раса, здоровье, выносливость, навык атаки, скрытность, владение стрелковым оружием, дальность атаки
// Колдун: Имя, раса, здоровье, знание заклинаний, мана, владение посохом
// Копейщик: Имя, раса, здоровье, выносливость, навык атаки, скорость, атака против всадников
// Арбалетчик: Имя, раса, здоровье, выносливость, навык атаки, скрытность, меткость, скорость перезарядки
// Монах: Имя, раса, здоровье, выносливость, молитвы, исцеление, владение книгами, владение оружием

public class Human {
    String name;
    Integer hp;
    protected Integer attack;
    Integer secrecy;
    Integer speed;
    Integer protection;
    Integer damageMin;
    Integer damageMax;

    public Human(String name, Integer hp, Integer attack, Integer secrecy, Integer speed, Integer protection, Integer damageMin, Integer damageMax) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.secrecy = secrecy;
        this.speed = speed;
        this.protection = protection;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
    }




    public String getName() {
        return name;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getSecrecy() {
        return secrecy;
    }

    public Integer getSpeed() {
        return speed;
    }
}
