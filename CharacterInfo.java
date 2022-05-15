
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
    
    String languages, tools, personality, ideals, bonds, flaws;

    public CharacterInfo(String name, String classT, String background,
                         String race, String alignment, String playerName,
                         int speed, int hpMax, int armorClass, int hpCur,
                         int hpTemp, int sp, int pp, int ep, int gp, int cp){
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
}
