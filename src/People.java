import java.util.Date;

public class People {
    private static int counter = 0;
    private Integer ID;
    private String name;
    private String gender;
    private Integer age;

    public People() {
        this.ID = counter;
        counter++;
        this.name = "noName";
        this.gender = "noGender";
        this.age = 0;
    }

    public People(String name, String gender, Integer age) {
        this.ID = counter;
        counter++;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void sayHi(People people){
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
