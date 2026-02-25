public class Student {

    String name;
    int age;
    String course;

    Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
        System.out.println("Default Constructor Called");
    }

    Student(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Prem", 21, "Computer Science");
        s2.display();
    }
}
