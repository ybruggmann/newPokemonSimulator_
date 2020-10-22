

public class Attacken {

    private String typ;
    private String name;
    private int stärke;
    private boolean physisch;

    public Attacken(String typ, String name, int stärke, boolean physisch) {
        this.typ = typ;
        this.name = name;
        this.stärke = stärke;
        this.physisch = physisch;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStärke() {
        return stärke;
    }

    public void setStärke(int stärke) {
        this.stärke = stärke;
    }

    public boolean isPhysisch() {
        return physisch;
    }

    public void setPhysisch(boolean physisch) {
        this.physisch = physisch;
    }


}
