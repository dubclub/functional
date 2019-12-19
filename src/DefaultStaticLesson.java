public class DefaultStaticLesson {

    public static void main(String[] args) {

        System.out.println(A.add(5, 6));
        D d = new D();
        d.sayHello();
        E e = new E();
        e.sayHello();

    }
}

interface A {
    static int add(int x, int y) {
        return x + y;
    }
}

interface B {
    void printMessage(String message);
    default void sayHello() {
        printMessage("Hello");
    }
}

interface C extends B {
    default void sayHello() {
        System.out.println("123");
    }
}

class D implements B, C {
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}

class E implements B {
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void sayHello() {
        System.out.println("Say");
        printMessage("Hello");
    }
}
