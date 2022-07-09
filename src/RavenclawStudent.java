import java.util.Objects;

public class RavenclawStudent extends HogwartsStudent{
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magic, int transgression, int cleverness, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "RavenclawStudent{" +
                "cleverness=" + cleverness +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RavenclawStudent that = (RavenclawStudent) o;
        return cleverness == that.cleverness && wisdom == that.wisdom && wit == that.wit && creativity == that.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cleverness, wisdom, wit, creativity);
    }
}
