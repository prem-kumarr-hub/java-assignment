public class GarbageCollectionDemo {

    public void finalize1() {
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {

        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}