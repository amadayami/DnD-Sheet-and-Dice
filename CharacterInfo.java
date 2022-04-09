
public class CharacterInfo {
    String charName;
    String charClass;
    String background;
    String race;
    String alignment;
    String playerName;
    
    int speed;
    int armorClass;
    int hpMax, hpCur, hpTemp;
    
    int cp, sp, ep, gp, pp;
    
    String languages, personality, ideals, bonds, flaws;

    public CharacterInfo(String name, String classT, String background,
                         String race, String alignment, String playerName,
                         int speed){
        setCharName(name);
        setCharClass(classT);
        setBackground(background);
        setRace(race);
        setAlignment(alignment);
        setPlayerName(playerName);
        setSpeed(speed);
    }

    public CharacterInfo(){
        setCharName("Mr. Human Man");
        setCharClass("Fighter");
        setBackground("Noble");
        setRace("Human");
        setAlignment("Lawful Good");
        setPlayerName("Amelia Martin");
        setSpeed(30);
    }
    
    public void setCharName(String newName) {
        this.charName = newName;
    }
    
    public void setCharClass(String newClass) {
        this.charClass = newClass;
    }
    
    public void setBackground(String newBackground) {
        this.background = newBackground;
    }

    public void setRace(String newRace) { this.race = newRace; }
    
    public void setAlignment(String newAlignment) {
        this.alignment = newAlignment;
    }
    
    public void setPlayerName(String newPlayer) {
        this.playerName = newPlayer;
    }
    
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
}
