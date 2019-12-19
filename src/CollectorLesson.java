import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CollectorLesson {

    public static void main(String[] args) {

        Stream.of("one", "two").collect(toCollection(ArrayList::new));
        Stream.of("one", "two").collect(toCollection(TreeSet::new));
        Stream.of("one", "two").collect(maxBy(Comparator.comparing(x -> x)));
        Stream.of(1, 2).collect(averagingInt(x -> x));
        Stream.of(1, 2).collect(minBy(Comparator.comparing(x -> x)));

        Map<Boolean, List<Integer>> map = Stream.of(1, 2, 3, 4).collect(partitioningBy(x -> x > 2));
        System.out.println(map);
        Map<Integer, List<Integer>> map1 = Stream.of(1, 2, 1, 4).collect(groupingBy(x -> x));
        System.out.println(map1);
        String result = Stream.of("one", "two", "three").collect(joining(",", "{", "}"));
        System.out.println(result);
        Map<Integer, Long> map2 = Stream.of(1, 2, 1, 4).collect(groupingBy(x -> x, counting()));
        System.out.println(map2.get(1));

    }

}
