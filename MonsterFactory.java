public class MonsterFactory {

    private final Monster[] monsters = {skeleton(), slime(), zombie(), troll(), ogre(), wisp(), amalgamate(), bat(), mimic(), mummy(), ghost(), goblin(), hobgoblin(), bugBear(), construct()};
    private final Monster[] miniBosses = {champMinotaur(), giantFuckinRat(), banshee()};
    private final Monster[] bosses = {theDuck(), shadowBrute(), lich()};

    // 15 monsters, 3 mini bosses, 3 bosses
    /////////////////////////////////////////////////////////// Matthan's Creatures Below
    public Monster skeleton(){
        InteractPerson skeleton = new Monster("Skeleton");
        return (Monster) skeleton;
    }
    public Monster slime(){
        InteractPerson slime = new Monster("Slime");
        return (Monster) slime;
    }
    public Monster zombie(){
        InteractPerson zombie = new Monster("Zombie");
        return (Monster) zombie;
    }
    public Monster troll(){
        InteractPerson troll = new Monster("Troll");
        return (Monster) troll;
    }
    public Monster ogre(){
        InteractPerson ogre = new Monster("Ogre");
        return (Monster) ogre;
    }
    public Monster champMinotaur(){
        InteractPerson champMinotaur = new Monster();
        return (Monster) champMinotaur;
    }
    public Monster theDuck(){
        InteractPerson theDuck = new Monster();
        return (Monster) theDuck;
    }
    /////////////////////////////////////////////////////////// Matthan's Creatures Above
    /////////////////////////////////////////////////////////// Mabel's Creatures Below
    public Monster wisp(){
        InteractPerson wisp = new Monster("Wisp");
        return (Monster) wisp;
    }
    public Monster amalgamate(){
        InteractPerson amalgamate = new Monster("Amalgamate");
        return (Monster) amalgamate;
    }
    public Monster bat(){
        InteractPerson bat = new Monster("Bat");
        return (Monster) bat;
    }
    public Monster mimic(){
        InteractPerson mimic = new Monster("Mimic");
        return (Monster) mimic;
    }
    public Monster mummy(){
        InteractPerson mummy = new Monster("Mummy");
        return (Monster) mummy;
    }
    public Monster giantFuckinRat(){
        InteractPerson giantRat = new Monster();
        return (Monster) giantRat;
    }
    public Monster shadowBrute(){
        InteractPerson shadowBrute = new Monster();
        return (Monster) shadowBrute;
    }
    /////////////////////////////////////////////////////////// Mabel's Creatures Above
    /////////////////////////////////////////////////////////// Aislin's Creatures Below
    public Monster ghost(){
        InteractPerson ghost = new Monster("Ghost");
        return (Monster) ghost;
    }
    public Monster goblin(){
        InteractPerson goblin = new Monster("Goblin");
        return (Monster) goblin;
    }
    public Monster hobgoblin(){
        InteractPerson hobgoblin = new Monster("Hobgoblin");
        return (Monster) hobgoblin;
    }
    public Monster bugBear(){
        InteractPerson bugBear = new Monster("Bug Bear");
        return (Monster) bugBear;
    }
    public Monster construct(){
        InteractPerson construct = new Monster("Construct");
        return (Monster) construct;
    }
    public Monster banshee(){
        InteractPerson banshee = new Monster();
        return (Monster) banshee;
    }
    public Monster lich(){
        InteractPerson lich = new Monster();
        return (Monster) lich;
    }
    /////////////////////////////////////////////////////////// Aislin's Creatures Above

    public Monster[] getMonsters() {
        return monsters;
    }
    public Monster[] getMiniBosses() {
        return miniBosses;
    }
    public Monster[] getBosses() {
        return bosses;
    }
}
