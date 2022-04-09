
public class BaseStatsSkills {
    
    int strStat, dexStat, conStat, 
        intStat, wisStat, charStat;
    
    int proficiency;
    int passivePerception;
    int initiative;
    
    int acrobatics, animalHandling, arcana, athletics,
        deception, history, insight, intimidation,
        investigation, medicine, nature, perception,
        performance, persuasion, religion, sleightOfHand,
        stealth, survival;
    
    int strSave, dexSave, conSave, 
        intSave, wisSave, charSave;
    
    boolean strProf, dexProf, conProf,
    intProf, wisProf, charProf;
    
    boolean acroProf, animalProf, arcanaProf, athleticProf,
        decepProf, historyProf, insightProf, intimProf,
        invesProf, medProf, natureProf, percepProf,
        performProf, persuaProf, religionProf, sohProf,
        stealthProf, survivalProf;
    
    public BaseStatsSkills(int str, int dex, int con, int intel, 
            int wis, int charis, int prof) {
        setStrength(str);
        setDexterity(dex);
        setConstitution(con);
        setIntelligence(intel);
        setWisdom(wis);
        setCharisma(charis);
        setProficiency(prof);
    }
    
    public static void main(String[] args) {
        //System.out.printf("I have run without error");
    }
    
    /*
     * Gets the modifier of the stat using the base value
     * If the value is less than 1 or greater than 20, the
     * method returns -10 as an error value.
     */
    public int getModifier(int baseStat) {
        int modifier;
        
        switch(baseStat) {
            case 1:
                modifier = -5;
                break;
            case 2: case 3:
                modifier = -4;
                break;
            case 4: case 5:
                modifier = -3;
                break;
            case 6: case 7:
                modifier = -2;
                break;
            case 8: case 9:
                modifier = -1;
                break;
            case 10: case 11:
                modifier = 0;
                break;
            case 12: case 13:
                modifier = 1;
                break;
            case 14: case 15:
                modifier = 2;
                break;
            case 16: case 17:
                modifier = 3;
                break;
            case 18: case 19:
                modifier = 4;
                break;
            case 20:
                modifier = 5;
                break;
            default:
                modifier = -10;
        }
        
        return modifier;
    }
    
    /*
     * Sets or updates the strength stat value, saving
     * throw, and all associated skill modifiers
     */
    public void setStrength(int val) {
        this.strStat = val;
        int strMod = getModifier(this.strStat);
        this.strSave = strMod;
        //skills
        this.athletics = strMod;
        
        //add proficiency
        if(strProf) {
            this.strSave += this.proficiency;
        }
        
        if(athleticProf) {
            this.athletics += this.proficiency;
        }
    }
    
    /*
     * Sets or updates the dexterity stat value, saving
     * throw, and all associated skill modifiers
     */
    public void setDexterity(int val) {
        this.dexStat = val;
        int dexMod = getModifier(this.dexStat);
        this.initiative = dexMod;
        this.dexSave = dexMod;
        //skills
        this.acrobatics = dexMod;
        this.sleightOfHand = dexMod;
        this.stealth = dexMod;
        
        //add proficiency
        if(dexProf) {
            this.dexSave += this.proficiency;
        }
        if(acroProf) {
            this.acrobatics += this.proficiency;
        }
        if(sohProf) {
            this.sleightOfHand += this.proficiency;
        }
        if(stealthProf) {
            this.stealth += this.proficiency;
        }
    }
    
    /*
     * Sets or updates the constitution stat value and
     * the saving throw
     */
    public void setConstitution(int val) {
        this.conStat = val;
        this.conSave = getModifier(this.conStat);
        
        //add proficiency
        if(conProf) {
            this.conSave += this.proficiency;
        }
    }
    
    /*
     * Sets or updates the intelligence stat value, saving
     * throw, and all associated skill modifiers
     */
    public void setIntelligence(int val) {
        this.intStat = val;
        int intMod = getModifier(this.intStat);
        this.intSave = intMod;
        //skills
        this.arcana = intMod;
        this.history = intMod;
        this.investigation = intMod;
        this.nature = intMod;
        this.religion = intMod;
        
        //add proficiency
        if(intProf) {
            this.intSave += this.proficiency;
        }
        if(arcanaProf) {
            this.arcana += this.proficiency;
        }
        if(historyProf) {
            this.history += this.proficiency;
        }
        if(invesProf) {
            this.investigation += this.proficiency;
        }
        if(natureProf) {
            this.nature += this.proficiency;
        }
        if(religionProf) {
            this.religion += this.proficiency;
        }
    }
    
    /*
     * Sets or updates the wisdom stat value, saving
     * throw, and all associated skill modifiers
     * Also updates the passive perception
     */
    public void setWisdom(int val) {
        this.wisStat = val;
        int wisMod = getModifier(this.wisStat);
        
        this.passivePerception = 10 + wisMod;
        this.wisSave = wisMod;
        //skills
        this.animalHandling = wisMod;
        this.insight = wisMod;
        this.medicine = wisMod;
        this.perception = wisMod;
        this.survival = wisMod;
        
        //add proficiency
        if(wisProf) {
            this.wisSave += this.proficiency;
        }
        if(animalProf) {
            this.animalHandling += this.proficiency;
        }
        if(insightProf) {
            this.insight += this.proficiency;
        }
        if(medProf) {
            this.medicine += this.proficiency;
        }
        if(percepProf) {
            this.perception += this.proficiency;
        }
        if(survivalProf) {
            this.survival += this.proficiency;
        }
    }
    
    /*
     * Sets or updates the wisdom stat value, saving
     * throw, and all associated skill modifiers
     */
    public void setCharisma(int val) {
        this.charStat = val;
        int charMod = getModifier(this.charStat);
        this.charSave = charMod;
        //skills
        this.deception = charMod;
        this.intimidation = charMod;
        this.performance = charMod;
        this.persuasion = charMod;
        
        //add proficiency
        if(charProf) {
            this.charSave += this.proficiency;
        }
        if(decepProf) {
            this.deception += this.proficiency;
        }
        if(intimProf) {
            this.intimidation += this.proficiency;
        }
        if(performProf) {
            this.performance += this.proficiency;
        }
        if(persuaProf) {
            this.persuasion += this.proficiency;
        }
    }
    
    
    //sets or updates the proficiency modifier
    public void setProficiency(int val) {
        this.proficiency = val;
        
        setStrength(this.strStat);
        setDexterity(this.dexStat);
        setConstitution(this.conStat);
        setIntelligence(this.intStat);
        setWisdom(this.wisStat);
        setCharisma(this.charStat);
    }
    
    public int rollDice(int mod, boolean advantage, boolean disadvantage) {
        String nat1_1 = "";
        String nat1_2 = "";
        String nat20_1 = "";
        String nat20_2 = "";
        int roll1 = 1 + (int)(Math.random() * ((20 - 1) + 1));
        int roll2 = 1 + (int)(Math.random() * ((20 - 1) + 1));
        
        if(roll1 == 1) {
            nat1_1 = "YOU ROLLED A NAT 1\n";
        }
        if(roll1 == 20) {
            nat20_1 = "YOU ROLLED A NAT 20\n";
        }
        
        if(roll2 == 1) {
            nat1_2 = "YOU ROLLED A NAT 1\n";
        }
        if(roll2 == 20) {
            nat20_2 = "YOU ROLLED A NAT 20\n";
        }
        
        roll1 += mod;
        roll2 += mod;
        
        if(advantage == true && disadvantage == true) {
            System.out.printf("error: advantage and disadvantage can't both be true");
        }
        else if(advantage == true) {
            System.out.print("rolling with advantage \n");
            if(roll1 > roll2) {
                System.out.print(nat1_1 + nat20_1);
                return roll1;
            }
            else {
                System.out.print(nat1_2 + nat20_2);
                return roll2;
                }
        }
        else if(disadvantage == true) {
            System.out.print("rolling with disadvantage \n");
            if(roll1 < roll2) {
                System.out.print(nat1_1 + nat20_1);
                return roll1;
            }
            else {
                System.out.print(nat1_2 + nat20_2);
                return roll2;
            }
        }
        else {
            System.out.print(nat1_1 + nat20_1);
            return roll1;
        }
        
        return 0;
    }
    
}
