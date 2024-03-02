package Test4;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Aynur", 18);
        Person person2 = new Person("Aynur", 18);
        Student student = new Student("Aynur", 18, 152796);
        Student student1 = new Student("Alice", 19, 52762);
        Employee employee = new Employee("Gauhar", 30, 188525);
        Employee employee1 = new Employee("Gauhar",30,188525);
        System.out.println(person.equals(person2));
        System.out.println(student.equals(student1));
        System.out.println(employee.equals(employee1));

    }


}
