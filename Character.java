import java.io.FileOutputStream;
import java.util.*;
import java.io.File;
public class Character {
    BaseStatsSkills curCharSkills;
    CharacterInfo curCharInfo;

    /*
    Creates a character with default stats and information
     */
    public Character(){
        curCharInfo = new CharacterInfo();
        curCharSkills = new BaseStatsSkills();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

    private boolean mapCharacterToFile(){
        HashMap<String, Object> cis = new HashMap<String, Object>();
        cis.put("name", curCharInfo.getCharName());
        cis.put("class", curCharInfo.getCharClass());
        cis.put("background", curCharInfo.getBackground());
        cis.put("race", curCharInfo.getRace());
        cis.put("alignment", curCharInfo.getAlignment());
        cis.put("playerName", curCharInfo.getPlayerName());
        cis.put("speed", curCharInfo.getSpeed());
        cis.put("maxHP", curCharInfo.getHpMax());
        cis.put("armorClass", curCharInfo.getArmorClass());
        cis.put("curHP", curCharInfo.getHpCur());
        cis.put("tempHP", curCharInfo.getHpTemp());
        cis.put("sp", curCharInfo.getSp());
        cis.put("pp", curCharInfo.getPp());
        cis.put("ep", curCharInfo.getEp());
        cis.put("gp", curCharInfo.getGp());
        cis.put("cp", curCharInfo.getCp());
        return true;
    }

}
