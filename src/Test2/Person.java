package Test2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static boolean comparePersons(Person person1, Person person2) {
        return person1.name.equals(person2.name) && person1.age == person2.age;
    }

}
