import java.util.ArrayList;
import java.util.Arrays;

public class Parents extends Children {
    ArrayList<Children> kids;

    public Parents() {
        super();
        kids = new ArrayList<>();
    }

    public Parents(String name, String gender, Integer age, Human mother, Human father, ArrayList<Children> kids) {
        super(name, gender, age, mother, father);
        this.kids = kids;
    }

    public String getChildren() {
        return Arrays.toString(kids.toArray());
    }

    public void addChild(Children child) {
        this.kids.add(child);
    }

    @Override
    public String toString() {
        return "Parent{" +
                "ID=" + super.getID() +
                ", name='" + super.getName() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", age=" + super.getAge() +
                ", Mother=" + super.getMother().getName() +
                ", Father=" + super.getFather().getName() +
                ", Kids=" + Arrays.toString(kids.toArray()) +
                '}';
    }
}
