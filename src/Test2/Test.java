package Test2;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("A", 28);
        Person person2 = new Person("A", 28);
        System.out.println(Person.comparePersons(person1, person2));
    }
}
