class GameCharacter {
    String characterName;

    public GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println(characterName + " attacks!");
    }
}

class Warrior extends GameCharacter {
    public Warrior(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " swings a sword!");
    }
}

class Mage extends GameCharacter {
    public Mage(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " casts a fireball!");
    }
}

class Archer extends GameCharacter {
    public Archer(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " fires an arrow!");
    }
}

public class AdventureGameCharacter {
    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = new Warrior("Conan");
        characters[1] = new Mage("Gandalf");
        characters[2] = new Archer("Legolas");

        startBattle(characters);
    }

    public static void startBattle(GameCharacter[] characters) {
        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        for (GameCharacter character : characters) {
            character.performAttack();
            if (character instanceof Warrior) {
                warriorCount++;
            } else if (character instanceof Mage) {
                mageCount++;
            } else if (character instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println("Warriors: " + warriorCount);
        System.out.println("Mages: " + mageCount);
        System.out.println("Archers: " + archerCount);
    }
}
