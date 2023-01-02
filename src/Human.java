public class Human {

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

    public static void sayHi(Human people) {
        System.out.println(people.getName() + "   created !");
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
}
