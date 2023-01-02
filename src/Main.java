public class Main {
    public static void main(String[] args) {
        Human man1 = new Human();
        Human.sayHi(man1);
        Human man2 = new Human("DanBalan", "male", 22);
        Human.sayHi(man2);
        Human man3 = new Human("Dasha", "female", 33);

        Human.sayHi(man3);

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);
    }
}