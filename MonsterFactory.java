public class MonsterFactory {

    private final Monster[] monsters = {skeleton(), slime(), zombie(), troll(), ogre(), wisp(), amalgamate(), bat(), mimic(), mummy(), ghost(), goblin(), hobgoblin(), bugBear(), construct()};
    private final Monster[] miniBosses = {champMinotaur(), giantFuckinRat(), banshee()};
    private final Monster[] bosses = {theDuck(), shadowBrute(), lich()};

    // 15 monsters, 3 mini bosses, 3 bosses
    /////////////////////////////////////////////////////////// Matthan's Creatures Below
    public Monster skeleton(){
        if(d!= null){
            InteractPerson skeleton = new Monster("Skeleton");
            skeleton.setHp(d.randomGenerator(5, 8));
            skeleton.setArmorClass(d.randomGenerator(3, 5));
            return (Monster) skeleton;
        }
        return null;
    } // DONE
    public Monster slime(){
        if(d!=null){
            InteractPerson slime = new Monster("Slime");
            slime.setHp(d.randomGenerator(3, 12));
            slime.setArmorClass(d.randomGenerator(1, 3));
            return (Monster) slime;
        }
        return null;
    } // DONE
    public Monster zombie(){
    if(d!=null){
        InteractPerson zombie = new Monster("Zombie");
        zombie.setHp(d.randomGenerator(5, 15));
        zombie.setArmorClass(d.randomGenerator(5, 10));
        return (Monster) zombie;
    }
    return null;
    } // DONE
    public Monster troll(){
        if(d!=null){
            InteractPerson troll = new Monster("Troll");
            troll.setHp(d.randomGenerator(20, 30));
            troll.setArmorClass(d.randomGenerator(7, 13));
            return (Monster) troll;
        }
        return null;
    } // DONE
    public Monster ogre(){
        if(d!=null){
            InteractPerson ogre = new Monster("Ogre");
            ogre.setHp(d.randomGenerator(15, 18));
            ogre.setArmorClass(d.randomGenerator(10, 13));
            return (Monster) ogre;
        }
        return null;

    } // DONE
    public Monster champMinotaur(){
        if(d!=null){
            InteractPerson champMinotaur = new Monster("Champion Minotaur");
            champMinotaur.setHp(d.randomGenerator(40,55));
            champMinotaur.setArmorClass(d.randomGenerator(12,16));
            return (Monster) champMinotaur;
        }
        return null;
    }
    public Monster theDuck(){
        if(d!=null){
            InteractPerson theDuck = new Monster("The Duck");
            theDuck.setHp(d.randomGenerator(75, 100));
            theDuck.setArmorClass(d.randomGenerator(15, 18));
            return (Monster) theDuck;
        }
        return null;
    }
    /////////////////////////////////////////////////////////// Matthan's Creatures Above
    /////////////////////////////////////////////////////////// Mabel's Creatures Below
    public Monster wisp(){
        if(d!=null){
            InteractPerson wisp = new Monster("Wisp");
            return (Monster) wisp;
        }
        return null;
    }
    public Monster amalgamate(){
        if(d!=null){
            InteractPerson amalgamate = new Monster("Amalgamate");
            return (Monster) amalgamate;
        }
        return null;
    }
    public Monster bat(){
        if(d!=null){
            InteractPerson bat = new Monster("Bat");
            return (Monster) bat;
        }
        return null;
    }
    public Monster mimic(){
        if(d!=null){
            InteractPerson mimic = new Monster("Mimic");
            return (Monster) mimic;
        }
        return null;
    }
    public Monster mummy(){
        if(d!=null){
            InteractPerson mummy = new Monster("Mummy");
            return (Monster) mummy;
        }
        return null;
        
    }
    public Monster giantFuckinRat(){
        if(d!=null){
            InteractPerson giantRat = new Monster("The Rat King");
            return (Monster) giantRat;
        }
        return null;
        
    } // DONE
    public Monster shadowBrute(){
        if(d!=null){
            InteractPerson shadowBrute = new Monster();
            return (Monster) shadowBrute;
        }
        return null;
    }
    /////////////////////////////////////////////////////////// Mabel's Creatures Above
    /////////////////////////////////////////////////////////// Aislin's Creatures Below
    public Monster ghost(){
        if(d!=null){
            InteractPerson ghost = new Monster("Ghost");
            return (Monster) ghost;
        }
        return null;
    }
    public Monster goblin(){
        if(d!=null){
            InteractPerson goblin = new Monster("Goblin");
            return (Monster) goblin;
        }
        return null;
    }
    public Monster hobgoblin(){
        if(d!=null){
            InteractPerson hobgoblin = new Monster("Hobgoblin");
            return (Monster) hobgoblin;
        }
        return null;
    }
    public Monster bugBear(){
        if(d!=null){
            InteractPerson bugBear = new Monster("Bug Bear");
            return (Monster) bugBear;
        }
        return null;
    }
    public Monster construct(){
        if(d!=null){
            InteractPerson construct = new Monster("Construct");
            return (Monster) construct;
        }
        return null;
    }
    public Monster banshee(){
        if(d!=null){
            InteractPerson banshee = new Monster();
            return (Monster) banshee;
        }
        return null;
    }
    public Monster lich(){
        if(d!=null){
            InteractPerson lich = new Monster();
            return (Monster) lich;
        }
        return null;
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
