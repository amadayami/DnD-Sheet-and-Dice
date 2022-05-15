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

    private boolean saveCharacterToFile(){
        LinkedList<Object> cis = new LinkedList<>();
        cis.add(0, curCharInfo.getCharName());
        cis.add(1, curCharInfo.getBackground());
        cis.add(2, curCharInfo.getRace());
        cis.add(3, curCharInfo.getAlignment());
        cis.add(4, curCharInfo.getPlayerName());
        cis.add(5, curCharInfo.getSpeed());
        cis.add(6, curCharInfo.getHpMax());
        cis.add(7, curCharInfo.getArmorClass());
        cis.add(8, curCharInfo.getHpCur());
        cis.add(9, curCharInfo.getHpTemp());
        cis.add(10, curCharInfo.getSp());
        cis.add(11, curCharInfo.getPp());
        cis.add(12, curCharInfo.getEp());
        cis.add(13, curCharInfo.getGp());
        cis.add(14, curCharInfo.getEp());


        return true;
    }


}
