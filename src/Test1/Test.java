package Test1;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Petya", 19);
        Person person1 = new Person("Petya", 19);
        System.out.println(person.equals(person1));
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person.hashCode() == person1.hashCode());
    }
}
