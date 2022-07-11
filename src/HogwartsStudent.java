import java.util.Objects;

public class HogwartsStudent {
    private int id;
    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudent(int id, String name, int magic, int transgression) {
        this.id = id;
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    public int ability(){
        return magic + transgression;
    }
    public void print () {
        System.out.println(this);
    }



    public void compareHogwarts(HogwartsStudent hogwartsStudent) {
        int ability1 = ability();
        int ability2 = hogwartsStudent.ability();
        if (ability1 > ability2) {
            System.out.println(" Студент %s лучше , чем студент %s: %d VS %d%  "
                    + " " + getName()+ " VS " + hogwartsStudent.getName()+ " : " +ability1+ " VS " +ability2);

        } else if (ability1 < ability2) {
            System.out.println(" Студент %s лучше , чем студент %s: %d VS %d%  "
                    + " " + hogwartsStudent.getName() + " VS " + getName()+ " : " + ability2+ " VS " + ability1);
        } else {
            System.out.println(" Студент %s такой же , как студент %s: %d VS %d%  "
                    +  hogwartsStudent.getName()+ " VS " + getName()+ " : " +ability1+ " VS "+ ability2);
        }
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HogwartsStudent that = (HogwartsStudent) o;
        return id == that.id && magic == that.magic && transgression == that.transgression && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, magic, transgression);
    }
}