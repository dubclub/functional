package sourceCodeLessons.FourLesson;

import javax.crypto.spec.PSource;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        /**
         * Здесь метод filter - промежуточный, а forEach - терминальный. Применить промежуточный поток к терминальным нельзя.
         */
        IntStream.of(-2, -1, 0, 1, 2).filter(x -> x < 0).forEach(System.out::println);

    }

}
