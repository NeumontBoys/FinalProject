public class MonsterFactory {

    private final Monster[] monsters = {skeleton(), slime(), zombie(), troll(), ogre(), wisp(), amalgamate(), bat(), mimic(), mummy(), ghost(), goblin(), hobgoblin(), bugBear(), construct()};
    private final Monster[] miniBosses = {champMinotaur(), giantFuckinRat(), banshee()};
    private final Monster[] bosses = {theDuck(), shadowBrute(), lich()};

    // 15 monsters, 3 mini bosses, 3 bosses
    public Monster skeleton(){
        InteractPerson skeleton = new Monster("Skeleton");
        return (Monster) skeleton;
    } // DONE
    public Monster slime(){
        InteractPerson slime = new Monster("Slime", d.randomGenerator(3, 12), 3, 1);
        return (Monster) slime;
    } // DONE
    public Monster zombie(){
        InteractPerson zombie = new Monster("Zombie", d.randomGenerator(5, 15), d.randomGenerator(5, 10), d.randomGenerator(7, 9));
        zombie.setHp(d.randomGenerator(5, 15));
        return (Monster) zombie;
    } // DONE
    public Monster troll(){
        InteractPerson troll = new Monster("Troll", d.randomGenerator(20, 30), d.randomGenerator(7, 13), d.randomGenerator(2, 16));
        return (Monster) troll;
    } // DONE
    public Monster ogre(){
        InteractPerson ogre = new Monster("Ogre", d.randomGenerator(15, 18), d.randomGenerator(10, 13), d.randomGenerator(5, 9));
        return (Monster) ogre;
    } // DONE
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
        InteractPerson giantRat = new Monster("The Rat King", d.randomGenerator(45, 55), d.randomGenerator(8, 12), d.randomGenerator(4, 18));
        return (Monster) giantRat;
    } // DONE
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
