package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 18, 95);
        System.out.println("student1 = "+ student1);
        Student student2 = createStudent("학생2", 19, 85);
        System.out.println("student2 = "+ student2);


        printStudent(student1);
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student = "+student);
        student.name = name;
        student.age = age;
        student.grede = grade;
        return student;

    }

    static void printStudent(Student student) {
        System.out.println("name : " + student.name + "  age : " + student.age + "  grade : " + student.grede);


    }
}
