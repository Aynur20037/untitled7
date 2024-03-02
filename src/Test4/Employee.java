package Test4;

public class Employee extends Person {
    private int id;

    public Employee(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}
