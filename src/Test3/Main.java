package Test3;

public class Main {
    public static void main(String[] args) {
        Person[] people = {new Person("Kairat Nurtas ", 35), new Person("Nyusha", 18)};
        Person person = new Person("Kairat Nurtas ", 35);
        System.out.println( Person.isUniquePerson(people,person));
    }

}
