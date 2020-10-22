

public class Pokemon {

    private String name;
    private String typ;
    private int HP;
    private int Level;
    private int atk;
    private int def;
    private int Spdef;
    private int Spatk;
    Attacken attacke;

    public Pokemon(String name, String typ, int HP, int level, int atk, int def, int spdef, int spatk, Attacken attacke) {
        this.name = name;
        this.typ = typ;
        this.HP = HP;
        this.Level = level;
        this.atk = atk;
        this.def = def;
        this.Spdef = spdef;
        this.Spatk = spatk;
        this.attacke = attacke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpdef() {
        return Spdef;
    }

    public void setSpdef(int spdef) {
        Spdef = spdef;
    }

    public int getSpatk() {
        return Spatk;
    }

    public void setSpatk(int spatk) {
        Spatk = spatk;
    }

    public Attacken getAttacke() {
        return attacke;
    }

    public void setAttacke(Attacken attacke) {
        this.attacke = attacke;

    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", typ='" + typ + '\'' +
                ", HP=" + HP +
                ", Level=" + Level +
                ", atk=" + atk +
                ", def=" + def +
                ", Spdef=" + Spdef +
                ", Spatk=" + Spatk +
                ", attacke=" + attacke +
                '}';
    }
}
