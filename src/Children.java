public class Children extends Human {

    private Human mother;
    private Human father;

    public Children() {
        super();
        this.mother = new Human();
        this.father = new Human();
    }

    public Children(String name, String gender, Integer age, Human mother, Human father) {
        super(name, gender, age);
        this.mother = mother;
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }



    @Override
    public String toString() {
        return "Children{" +
                "ID=" + super.getID() +
                ", name='" + super.getName() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", age=" + super.getAge() +
                ", Mother=" + mother.getName() +
                ", Father=" + father.getName() +
                '}';
    }
}
