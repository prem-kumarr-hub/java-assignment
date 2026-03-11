final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

class Parent {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
}

public class Finaldemo {
    public static void main(String[] args) {

        final int x = 10;

        System.out.println("Final variable value: " + x);

        Child c = new Child();
        c.show();

        FinalClass f = new FinalClass();
        f.display();
    }
}