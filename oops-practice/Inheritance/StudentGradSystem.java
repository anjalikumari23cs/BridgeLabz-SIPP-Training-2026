// 1.A university system has Person → Student → GradStudent. Each level
// adds attributes (GPA, thesis). Override toString() at each level. Use super()
// to chain constructors. Make studentId final. Demonstrate that GradStudent
// IS-A Student IS-A Person.
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class Student extends Person {
    private final String studentId;
    private double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", gpa=" + gpa +
                "} " + super.toString();
    }
}

class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int age, double gpa, String thesis) {
        super(name, age, "GS" + System.nanoTime(), gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return "GradStudent{" +
                "thesis='" + thesis + '\'' +
                "} " + super.toString();
    }
}

public class StudentGradSystem {
    public static void main(String[] args) {
        GradStudent gradStudent = new GradStudent("John Doe", 20, 3.8, "AI in Healthcare");
        System.out.println(gradStudent);
    }
}
