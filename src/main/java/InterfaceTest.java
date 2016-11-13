/**
 * Created by hlieu on 11/13/16.
 */
public class InterfaceTest implements FooInterface{
    public void testA() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        InterfaceTest t = new InterfaceTest();
        t.testA();
    }
}

// a non-public interface and class
// can be declared in the same file as another public class,
// but it is not recommended
interface FooInterface{
    void testA();
}

class FooClass2 implements FooInterface {
    public void testA() {
        System.out.println("B");
    }
}
