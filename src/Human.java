public class Human implements HumanI {

    private static int counter = 0;
    private final Integer ID;
    private String name;
    private final Gender gender;
    private final Integer age;

    public Human() {
        this.ID = counter++;
        this.name = "noName";
        this.gender = null;
        this.age = 0;
    }

    public Human(String name, String gender, Integer age) {
        this.ID = counter++;
        this.name = name;
        this.gender = Gender.stringToEnum(gender);
        this.age = age;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "People{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void printOb() {
        System.out.println(this);
    }

    @Override
    public String toStringOb() {
        return HumanI.super.toStringOb();
    }

    @Override
    public String getData() {
        return name + " " + gender + " " + age +" !";
    }

}
