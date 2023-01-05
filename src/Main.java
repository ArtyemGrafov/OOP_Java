import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Human man1 = new Human();
        HumanI.sayHi(man1);
        Human man2 = new Human("DanBalan", "male", 22);
        HumanI.sayHi(man2);
        Human man3 = new Human("Dasha", "female", 33);
        Children child1 = new Children("Vsya", "male", 4, man2, man3);

        HumanI.sayHi(man3);

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);
        System.out.println(child1);
        child1.setName("www");
        System.out.println(child1.getName());
        child1.setFather(new Human("newFather", "male", 77));
        System.out.println(child1);
        Children child2 = new Children("AAA", "female", 34, man3, man2);
        ArrayList<Children> kids = new ArrayList<>();
        kids.add(child1);
        kids.add(child2);
        Parents mother1 = new Parents("mother1", "female", 44, man1, man2,
                                        kids);
        System.out.println(mother1);
        System.out.println(mother1.getChildren());
        mother1.printOb();

        System.out.println(child1.getData());


        HumanI humanI = child1.getFather();
        System.out.println(humanI.getData());

        Supplier<Human> humanSupplier = () -> {
            Human human = new Children("sd", "male", 0,
                            new Human("mather123", "female", 44),
                            new Human("father123", "male", 55));
            return human;
        };

        Human newKid = humanSupplier.get();
        System.out.println(newKid);

        BinaryOperator<Integer> sumAge = (age1, age2) -> age1 + age2;
        System.out.println(sumAge.apply(child1.getAge(), child2.getAge()));
    }

}