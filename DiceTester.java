
public class DiceTester {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Character character = new Character();
        BaseStatsSkills skills = character.curCharSkills;
        CharacterInfo info = character.curCharInfo;
        int mod = skills.getModifier(skills.strStat);
        System.out.println(skills.rollDice(mod, false, false));
    }

}
