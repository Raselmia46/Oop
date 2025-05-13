package cpn;
//Interface: All characters can attack
interface Character {
 void attack();
}

//Abstract class: Only magical beings share mana and magic preparation
abstract class MagicalBeing implements Character {
 int mana = 100;

 void prepareMagic() {
     System.out.println("Preparing magic... Charging mana...");
 }
}

//Concrete class: Wizard
class Wizard extends MagicalBeing {
 public void attack() {
     prepareMagic();
     System.out.println("Wizard casts Fireball! (-20 mana)");
     mana -= 20;
 }
}

//Concrete class: Warrior (not magical, but still a character)
class Warrior implements Character {
 public void attack() {
     System.out.println("Warrior swings sword with brute force!");
 }
}

//Concrete class: Druid (another magical being)
class Druid extends MagicalBeing {
 public void attack() {
     prepareMagic();
     System.out.println("Druid summons nature’s wrath! (-15 mana)");
     mana -= 15;
 }
}

public class GuildDemo {
 public static void main(String[] args) {
     Character wizard = new Wizard();
     Character warrior = new Warrior();
     Character druid = new Druid();

     System.out.println("Battle begins!");

     wizard.attack();
     warrior.attack();
     druid.attack();
 }
}

