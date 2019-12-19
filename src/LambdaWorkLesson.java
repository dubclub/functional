import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaWorkLesson {


    /**
     * Итого: Оперции stateful - например sorted выполняются полностью сразу, а stateless - выполняются последовательно (в цикле вызывается каждый раз каждая операция)
     * stateful не смешиваются с другими операциями.
     * @param args
     */
    public static void main(String[] args) {

        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        System.out.println(forkJoinPool.getParallelism());

        Stream<String> stream = Stream.of("a", "b", "c");
//        Supplier<Stream<String>> supplier = () -> stream;
        Supplier<Stream<String>> supplier = () -> Stream.of("a", "b", "c");
        supplier.get().sorted((s1, s2) -> {
            System.out.println("Sort " + s1 + " " + s2);
            return s1.compareTo(s2);
        }).map(s -> {
            System.out.println("Map " + s);
            return s.toUpperCase();
        }).map(s -> {
            System.out.println("Map2 " + s);
            return s.toLowerCase();
        }).filter(s -> s.equals("a"))
                .forEach(s -> System.out.println(s));

        supplier.get().forEach(s -> System.out.println(s));

        supplier.get().parallel().forEach(s -> System.out.println(s + " " + Thread.currentThread().getName()));


    }

}
