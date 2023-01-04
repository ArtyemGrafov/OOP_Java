public interface HumanI {
    void printOb();
    default String toStringOb() {
        return "000";
    }

    static void sayHi(Human people) {
        System.out.println(people.getName() + " Created!");
    }

    String getData();
}
