import java.util.function.*;

public class FunctionalInterfaceLesson {

    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(3));

        Consumer<Integer> consumer = x -> System.out.println(x.byteValue());
        consumer.accept(10);

        Function<Integer, String> function = x -> x.toString();
        System.out.println(function.apply(5));

        Supplier<Integer> supplier = () -> new Integer(5);
        System.out.println(supplier.get());

        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = (x, y) -> x - y;
        System.out.println(binaryOperator.apply(3, 5));

        /**
         * Есть еще куча других функциональных интерфесов, это только самые часто используемые.
         * Также можно свой сделать.
         */

        MyPredicate<String> myPredicate = (x, y, z) -> System.out.println(x + y + z);
        myPredicate.test("123", "54", "99");


    }

    interface MyPredicate<T> {

        void test(T t, T r, T g);

    }

}
