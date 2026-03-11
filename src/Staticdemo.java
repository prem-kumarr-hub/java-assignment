class Student2 {

    int id;
    String name;
    static String college = "ABC College";

    Student2(int i, String n) {
        id = i;
        name = n;
    }

    static void changeCollege() {
        college = "XYZ College";
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

public class Staticdemo {
    public static void main(String[] args) {

        Student.changeCollege();

        Student2 s1 = new Student2(1, "Rahul");
        Student2 s2 = new Student2(2, "Anjali");

        s1.display();
        s2.display();
    }
}