import java.util.*;
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
    
    ArrayList<String> languages;
    ArrayList<String> toolProfs;
    String personality, ideals, bonds, flaws;

    public CharacterInfo(String name, String classT, String background,
                         String race, String alignment, String playerName,
                         int speed, int hpMax, int armorClass, int hpCur,
                         int hpTemp, int sp, int pp, int ep, int gp, int cp,
                         ArrayList<String> languages, ArrayList<String> toolProfs,
                         String personality, String ideals, String bonds, String flaws

    ){
        setCharName(name);
        setCharClass(classT);
        setBackground(background);
        setRace(race);
        setAlignment(alignment);
        setPlayerName(playerName);
        setSpeed(speed);
        setHpMax(hpMax);
        setArmorClass(armorClass);
        setHpCur(hpCur);
        setHpTemp(hpTemp);
        setSp(sp);
        setPp(pp);
        setEp(ep);
        setGp(gp);
        setCp(cp);
        setLanguages(languages);
        setToolProfs(toolProfs);
        setPersonality(personality);
        setIdeals(ideals);
        setBonds(bonds);
        setFlaws(flaws);
    }

    public CharacterInfo(){
        setCharName("Mr. Human Man");
        setCharClass("Fighter");
        setBackground("Noble");
        setRace("Human");
        setAlignment("Lawful Good");
        setPlayerName("Amelia Martin");
        setSpeed(30);
        setHpMax(10);
        setArmorClass(0);
        setHpCur(10);
        setHpTemp(0);
        setSp(0);
        setPp(0);
        setEp(0);
        setGp(0);
        setCp(0);
        setLanguages(new ArrayList<String>());
        setToolProfs(new ArrayList<String>());
        setPersonality("");
        setIdeals("");
        setBonds("");
        setFlaws("");
    }

    /*
    Setters for the character info variables
     */
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

    public void setArmorClass(int newAC) { this.armorClass = newAC; }

    public void setHpMax(int maxHealth) { this.hpMax = maxHealth; }

    public void setHpCur(int curHealth) { this.hpCur = curHealth; }

    public void setHpTemp(int tempHealth) { this.hpTemp = tempHealth; }

    public void setCp(int cp) { this.cp = cp; }

    public void setSp(int sp) { this.sp = sp; }

    public void setEp(int ep) { this.ep = ep; }

    public void setGp(int gp) { this.gp = gp; }

    public void setPp(int pp) { this.pp = pp; }

    public void setLanguages(ArrayList<String> languages)  { this.languages = languages; }

    public void setToolProfs(ArrayList<String> toolProfs) { this.toolProfs = toolProfs; }

    public void setPersonality(String personality) { this.personality = personality; }

    public void setIdeals(String ideals) { this.ideals = ideals; }

    public void setBonds(String bonds) { this.bonds = bonds;}

    public void setFlaws(String flaws) { this.flaws = flaws; }

    /*
    Getters for the character info variables
     */
    public String getCharName() { return this.charName; }

    public String getCharClass() { return this.charClass; }

    public String getBackground() { return this.background; }

    public String getRace() { return this.race; }

    public String getAlignment() { return this.alignment; }

    public String getPlayerName() { return this.playerName; }

    public int getSpeed() { return this.speed; }

    public int getArmorClass() { return this.armorClass; }

    public int getHpMax() { return this.hpMax; }

    public int getHpCur() { return this.hpCur; }

    public int getHpTemp() { return this.hpTemp; }

    public int getCp() { return this.cp; }

    public int getSp() { return this.sp; }

    public int getEp() { return this.ep; }

    public int getGp() { return this.gp; }

    public int getPp() { return this.pp; }

    public ArrayList<String> getLanguages() { return this.languages; }

    public ArrayList<String> getToolProfs() { return this.toolProfs; }

    public String getPersonality() { return this.personality; }

    public String getIdeals() { return this.ideals; }

    public String getBonds() { return this.bonds; }

    public String getFlaws() { return this.flaws; }
}
