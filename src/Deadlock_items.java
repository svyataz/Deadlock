import java.util.ArrayList;

public abstract class Deadlock_items {
    private double Abilities_Duration = 0;
    private double Ammo = 0;
    private int Bonus_Health = 0;
    private double Bullet_Lifesteal = 0;
    private double Base_Health = 0;
    private double Bullet_Resist = 0;
    private int Bonus_Ability_Charge = 0;
    private double Fire_Rate = 0;
    private double Health_Regen = 0;
    private int Move_Speed = 0;
    private String Name;
    private int Price = 0;
    private double Reload_Time = 0;
    private double Spirit_Lifesteal = 0;
    private int Spirit_Power = 0;
    private double Spirit_Resist = 0;
    private int Spirit_Shild_Health = 0;
    private int Stamina = 0;
    private double Weapon_Damage = 0;
    protected ArrayList<Deadlock_items> Component;

    public Deadlock_items(int price, String name) {
        this.Price = price;
        this.Name = name;
        Component = new ArrayList<>();
    }

    public double getAbilities_Duration() {
        return Abilities_Duration;
    }

    public void setAbilities_Duration(double abilities_Duration) {
        Abilities_Duration = abilities_Duration;
    }

    public double getAmmo() {
        return Ammo;
    }

    public void setAmmo(double ammo) {
        Ammo = ammo;
    }

    public int getBonus_Health() {
        return Bonus_Health;
    }

    public void setBonus_Health(int bonus_Health) {
        Bonus_Health = bonus_Health;
    }

    public double getBullet_Lifesteal() {
        return Bullet_Lifesteal;
    }

    public void setBullet_Lifesteal(double bullet_Lifesteal) {
        Bullet_Lifesteal = bullet_Lifesteal;
    }

    public double getBase_Health() {
        return Base_Health;
    }

    public void setBase_Health(double base_Health) {
        Base_Health = base_Health;
    }

    public double getBullet_Resist() {
        return Bullet_Resist;
    }

    public void setBullet_Resist(double bullet_Resist) {
        Bullet_Resist = bullet_Resist;
    }

    public int getBonus_Ability_Charge() {
        return Bonus_Ability_Charge;
    }

    public void setBonus_Ability_Charge(int bonus_Ability_Charge) {
        Bonus_Ability_Charge = bonus_Ability_Charge;
    }

    public double getFire_Rate() {
        return Fire_Rate;
    }

    public void setFire_Rate(double fire_Rate) {
        Fire_Rate = fire_Rate;
    }

    public double getHealth_Regen() {
        return Health_Regen;
    }

    public void setHealth_Regen(double health_Regen) {
        Health_Regen = health_Regen;
    }

    public int getMove_Speed() {
        return Move_Speed;
    }

    public void setMove_Speed(int move_Speed) {
        Move_Speed = move_Speed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public double getReload_Time() {
        return Reload_Time;
    }

    public void setReload_Time(double reload_Time) {
        Reload_Time = reload_Time;
    }

    public double getSpirit_Lifesteal() {
        return Spirit_Lifesteal;
    }

    public void setSpirit_Lifesteal(double spirit_Lifesteal) {
        Spirit_Lifesteal = spirit_Lifesteal;
    }

    public int getSpirit_Power() {
        return Spirit_Power;
    }

    public void setSpirit_Power(int spirit_Power) {
        Spirit_Power = spirit_Power;
    }

    public double getSpirit_Resist() {
        return Spirit_Resist;
    }

    public void setSpirit_Resist(double spirit_Resist) {
        Spirit_Resist = spirit_Resist;
    }

    public int getSpirit_Shild_Health() {
        return Spirit_Shild_Health;
    }

    public void setSpirit_Shild_Health(int spirit_Shild_Health) {
        Spirit_Shild_Health = spirit_Shild_Health;
    }

    public int getStamina() {
        return Stamina;
    }

    public void setStamina(int stamina) {
        Stamina = stamina;
    }

    public double getWeapon_Damage() {
        return Weapon_Damage;
    }

    public void setWeapon_Damage(double weapon_Damage) {
        Weapon_Damage = weapon_Damage;
    }

    public ArrayList<Deadlock_items> getComponent() {
        return Component;
    }

    public void addToComponent(Deadlock_items ob) {
        Component.add(ob);
    }
}
