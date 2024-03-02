package Test4;

public class Student extends Person {
    private int id;

    public Student(String name, int age, int id) {
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
        Student student = (Student) obj;
        return id == student.id;

    }
}
