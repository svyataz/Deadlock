import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Dictionary<String, Deadlock_items> item_list = new Hashtable();
        ArrayList<String> names = new ArrayList<>();
        //W_EARLY
        W_EARLY buff;
        buff = new W_EARLY(500, "Basic Magazine");
        names.add("Basic Magazine");
        buff.setAmmo(0.24);
        buff.setWeapon_Damage(0.15);
        item_list.put("Basic Magazine", buff);

        buff = new W_EARLY(500, "Hollow Point Ward");
        names.add("Hollow Point Ward");
        buff.setSpirit_Power(4);
        buff.setSpirit_Shild_Health(85);
        item_list.put("Hollow Point Ward", buff);

        //S_EARLY
        S_EARLY SEbuff;
        SEbuff = new S_EARLY(500, "Extra Charge");
        names.add("Extra Charge");
        SEbuff.setBonus_Ability_Charge(1);
        item_list.put("Extra Charge", SEbuff);

        SEbuff = new S_EARLY(500, "Extra Spirit");
        names.add("Extra Spirit");
        SEbuff.setHealth_Regen(1);
        SEbuff.setBase_Health(35);
        SEbuff.setSpirit_Power(8);
        item_list.put("Extra Spirit", SEbuff);

        SEbuff = new S_EARLY(500, "Infuser");
        names.add("Infuser");
        SEbuff.setAmmo(0.1);
        SEbuff.setBonus_Health(50);
        SEbuff.setSpirit_Lifesteal(0.2);
        item_list.put("Infuser", SEbuff);

        //H_EARLY
        H_EARLY HEbuff;
        HEbuff = new H_EARLY("Enduring Spirit", 500);
        names.add("Enduring Spirit");
        HEbuff.setBase_Health(0.11);
        HEbuff.setSpirit_Lifesteal(0.08);
        HEbuff.setBonus_Health(75);
        HEbuff.setSpirit_Power(4);
        item_list.put("Enduring Spirit", HEbuff);

        HEbuff = new H_EARLY("Extra Halth", 500);
        names.add("Extra Halth");
        HEbuff.setBonus_Health(160);
        HEbuff.setWeapon_Damage(0.05);
        item_list.put("Extra Halth", HEbuff);

        HEbuff = new H_EARLY("Extra Regen", 500);
        names.add("Extra Regen");
        HEbuff.setAmmo(0.08);
        HEbuff.setBonus_Health(25);
        HEbuff.setHealth_Regen(2.8);
        item_list.put("Extra Regen", HEbuff);

        HEbuff = new H_EARLY("Extra Stamina", 500);
        names.add("Extra Stamina");
        HEbuff.setStamina(1);
        HEbuff.setFire_Rate(0.07);
        item_list.put("Extra Stamina", HEbuff);

        //W_MID
        W_MID WMbuff;
        WMbuff = new W_MID("Active Reload", 1250);
        names.add("Active Reload");
        WMbuff.setBullet_Lifesteal(0.22);
        WMbuff.setFire_Rate(0.2);
        WMbuff.setReload_Time(-0.2);
        WMbuff.setWeapon_Damage(0.1);
        item_list.put("Active Reload", WMbuff);

        WMbuff = new W_MID("Fleet Foot", 1250);
        names.add("Fleet Foot");
        WMbuff.setBonus_Health(75);
        item_list.put("Fleet Foot", WMbuff);

        WMbuff = new W_MID("Slowing Bullets", 1250);
        names.add("Slowing Bullets");
        WMbuff.setSpirit_Power(5);
        WMbuff.setWeapon_Damage(0.16);
        item_list.put("Slowing Bullets", WMbuff);

        WMbuff = new W_MID("Tesla Bullets", 3000);
        names.add("Tesla Bullets");
        WMbuff.setFire_Rate(0.14);
        item_list.put("Tesla Bullets", WMbuff);

        //S_MID
        S_MID SMbuff;
        SMbuff = new S_MID("Duration Extender", 1250);
        names.add("Duration Extender");
        SMbuff.setAbilities_Duration(0.16);
        SMbuff.setBonus_Health(100);
        SMbuff.setHealth_Regen(1.75);
        item_list.put("Duration Extender", SMbuff);

        SMbuff = new S_MID("Rapid Recharge", 3000);
        names.add("Rapid Recharge");
        SMbuff.setBonus_Ability_Charge(2);
        SMbuff.addToComponent(item_list.get("Extra Charge"));
        item_list.put("Rapid Recharge", SMbuff);

        //H_MID
        H_MID HMbuff;
        HMbuff = new H_MID("Bullet Armor", 1250);
        names.add("Bullet Armor");
        HMbuff.setBullet_Resist(0.2);
        HMbuff.setWeapon_Damage(0.05);
        item_list.put("Bullet Armor", HMbuff);

        HMbuff = new H_MID("Bullet Lifesteal", 1250);
        names.add("Bullet Lifesteal");
        HMbuff.setBullet_Lifesteal(0.23);
        HMbuff.setBonus_Health(75);
        item_list.put("Bullet Lifesteal", HMbuff);

        HMbuff = new H_MID("Spirit Armor", 1250);
        names.add("Spirit Armor");
        HMbuff.setSpirit_Power(5);
        HMbuff.setSpirit_Resist(0.2);
        item_list.put("Spirit Armor", HMbuff);

        HMbuff = new H_MID("Spirit Lifesteal", 1250);
        names.add("Spirit Lifesteal");
        HMbuff.setBonus_Health(75);
        HMbuff.setSpirit_Lifesteal(0.23);
        item_list.put("Spirit Lifesteal", HMbuff);

        HMbuff = new H_MID("Superior Stamina", 1250);
        names.add("Superior Stamina");
        HMbuff.setFire_Rate(0.07);
        HMbuff.setSpirit_Power(8);
        HMbuff.setStamina(3);
        HMbuff.addToComponent(item_list.get("Extra Stamina"));
        item_list.put("Superior Stamina", HMbuff);

        //W_LATE
        W_LATE WLbuff;
        WLbuff = new W_LATE("Silencer", 6000);
        names.add("Silencer");
        WLbuff.setWeapon_Damage(0.15);
        WLbuff.addToComponent(item_list.get("Slowing Bullets"));
        item_list.put("Silencer", WLbuff);

        WLbuff = new W_LATE("Titanic Magazine", 3000);
        names.add("Titanic Magazine");
        WLbuff.setWeapon_Damage(0.18);
        WLbuff.addToComponent(item_list.get("Basic Magazine"));
        item_list.put("Titanic Magazine", WLbuff);

        //S_LATE
        S_LATE SLbuff;
        SLbuff = new S_LATE("Improved Spirit", 3000);
        names.add("Improved Spirit");
        SLbuff.setSpirit_Power(21);
        SLbuff.setBonus_Health(75);
        SLbuff.setHealth_Regen(2);
        SLbuff.setMove_Speed(1);
        SLbuff.addToComponent(item_list.get("Extra Spirit"));
        item_list.put("Improved Spirit", SLbuff);


        SLbuff = new S_LATE("Boundless Spirit", 6000);
        names.add("Boundless Spirit");
        SLbuff.setSpirit_Lifesteal(60);
        SLbuff.setBonus_Health(300);
        SLbuff.setHealth_Regen(15);
        SLbuff.setMove_Speed(3);
        SLbuff.setWeapon_Damage(0.25);
        SLbuff.addToComponent(item_list.get("Improved Spirit"));
        item_list.put("Boundless Spirit", SLbuff);

        SLbuff = new S_LATE("Ethereal Shift", 3000);
        names.add("Ethereal Shift");
        SLbuff.setSpirit_Power(14);
        SLbuff.setMove_Speed(3);
        item_list.put("Ethereal Shift", SLbuff);

        SLbuff = new S_LATE("Mystic Slow", 4250);
        names.add("Mystic Slow");
        SLbuff.setBonus_Health(100);
        SLbuff.setHealth_Regen(3);
        SLbuff.setSpirit_Power(6);
        item_list.put("Mystic Slow", SLbuff);

        SLbuff = new S_LATE("Superior Duration", 3000);
        names.add("Superior Duration");
        SLbuff.setAbilities_Duration(0.32);
        SLbuff.setBonus_Health(175);
        SLbuff.setHealth_Regen(4);
        SLbuff.setWeapon_Damage(0.15);
        SLbuff.addToComponent(item_list.get("Duration Extender"));
        item_list.put("Superior Duration", SLbuff);

        SLbuff = new S_LATE("Surge of Power", 3000);
        names.add("Surge of Power");
        SLbuff.setSpirit_Power(34);
        SLbuff.setBonus_Health(75);
        item_list.put("Surge of Power", SLbuff);

        //H_LATE
        H_LATE HLbuff;
        HLbuff = new H_LATE("Improved Bullet Armor", 3000);
        names.add("Improved Bullet Armor");
        HLbuff.setBullet_Resist(0.45);
        HLbuff.setWeapon_Damage(0.1);
        HLbuff.addToComponent(item_list.get("Bullet Armor"));
        item_list.put("Improved Bullet Armor", HLbuff);

        HLbuff = new H_LATE("Improved Spirit Armor", 3000);
        names.add("Improved Spirit Armor");
        HLbuff.setSpirit_Power(8);
        HLbuff.setSpirit_Resist(0.45);
        HLbuff.addToComponent(item_list.get("Spirit Armor"));
        item_list.put("Improved Spirit Armor", HLbuff);

        HLbuff = new H_LATE("Leech", 6000);
        names.add("Leech");
        HLbuff.setBullet_Lifesteal(0.35);
        HLbuff.setWeapon_Damage(0.15);
        HLbuff.setBonus_Health(175);
        HLbuff.setSpirit_Power(12);
        HLbuff.setSpirit_Lifesteal(0.35);
        HLbuff.addToComponent(item_list.get("Bullet Lifesteal"));
        HLbuff.addToComponent(item_list.get("Spirit Lifesteal"));
        item_list.put("Leech", HLbuff);

        HLbuff = new H_LATE("Majestic Leap", 3000);
        names.add("Majestic Leap");
        HLbuff.setBonus_Health(125);
        HLbuff.setSpirit_Power(10);
        item_list.put("Majestic Leap", HLbuff);
        queries(item_list, names);
    }
    public static void queries(Dictionary<String, Deadlock_items> item_list, ArrayList<String> names) {

        System.out.println("---------items with price more then 1500---------");
        for (String i : names) {
            if (item_list.get(i) instanceof Deadlock_items) {
                if (item_list.get(i).getPrice() > 1500) {
                    System.out.println(i + ": " + item_list.get(i).getClass() + " Price more then 1500");
                    for (String j : names) {
                        if (item_list.get(j).getComponent().contains(item_list.get(i))) {
                            System.out.println(j + ": " + item_list.get(j).getClass() + " containing" + i);
                        }
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("---------items containing Extra Spirit---------");
        for (String i : names) {
            if (item_list.get(i) instanceof Deadlock_items) {
                if (item_list.get(i).getComponent().contains(item_list.get("Extra Spirit"))) {
                    System.out.println(i + ": " + item_list.get(i).getClass() + " containing Extra Spirit");
                    for (String j : names) {
                        if (item_list.get(j).getComponent().contains(item_list.get(i))) {
                            System.out.println(j + ": " + item_list.get(j).getClass() + " containing " + i);
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}