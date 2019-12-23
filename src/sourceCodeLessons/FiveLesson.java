package sourceCodeLessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FiveLesson {

    public static void main(String[] args) {

        /**
         * Жизненный цикл потока данных:
         * 1. Поток создается.
         * 2. Над потоком применяются промежуточные операции.
         * 3. Терминальная операция (не больше одной).
         */

        Stream<String> stringStream = Arrays.stream( new String[] {"a", "b", "c"});
        stringStream.forEach(System.out::println);
        Stream<Integer> intStream = Arrays.stream( new Integer[] {1, 2, 3});
        intStream.forEach(System.out::println);

        Stream<String> stringStream1 = Stream.of("a", "b", "c");
        stringStream1.forEach(System.out::println);

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Tom", "Jerry", "Edward");
        list.stream().filter(x -> x.length() >= 4).forEach(System.out::println);


    }

}
