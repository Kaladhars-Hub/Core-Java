package basics.GarbageCollection;

public class GarbageCollectionEx {

    public void finalize() {
        System.out.println("Finalize method is called");
        }
    public static void main(String[] args) {
        // unused objects
        // un-referenced objects
        // anonymous objects

        GarbageCollectionEx gce1 = new GarbageCollectionEx();
        GarbageCollectionEx gce2 = new GarbageCollectionEx();
        GarbageCollectionEx gce3 = new GarbageCollectionEx();

        gce1 = null;
        gce2 = gce3;

        System.gc();
    }
}
