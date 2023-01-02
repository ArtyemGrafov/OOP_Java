public class Main {
    public static void main(String[] args) {
        People man1 = new People();
        People.sayHi(man1);
        People man2 = new People("DanBalan", "male", 22);
        People.sayHi(man2);
        People man3 = new People("Dasha", "female", 33);
        man3.setGender("male");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);
    }
}