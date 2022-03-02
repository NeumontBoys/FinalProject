public class Room {

    private Monster[] monsters;
    private MonsterFactory monster = new MonsterFactory();

    public Room(){}

    public int howManyMonsters(){
        Die d = new Die();
        int howMany = d.randomGenerator(1,5);
        return howMany;
    }

    public void populateArray(){
        Die d = new Die();
        for (int i = 0; i < getMonsters().length; i++) {
            monsters[i] = monster.getMonsters()[d.randomGenerator(0, monster.getMonsters().length - 1)];
        }
    }

    public Monster[] getMonsters() {
        return monsters;
    }
    public void setMonsters(Monster[] monsters) {
        this.monsters = monsters;
    }

    public void setMonstersSize(int howManyMonsters){
        monsters = new Monster[howManyMonsters];
    }

    public void displayRoom(){
        String[] monsterNames = new String[monsters.length];
        System.out.println("Room: ");
        for (int i = 0; i < monsters.length; i++) {
            monsterNames[i] = monsters[i].getName();
        }
        ConsoleIO.promptForMenuSelection(monsterNames, false);
    }

    public void test(){
        setMonstersSize(howManyMonsters());
        populateArray();
        displayRoom();
    }
}
