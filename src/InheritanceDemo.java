class carnivores {
    void eat() {
        System.out.println("Animal is eating...");
    }
}
class cat extends carnivores {
    void meow() {
        System.out.println("cat sounds like meow...");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        cat c = new cat();
        c.eat();
        c.meow();
    }
}
