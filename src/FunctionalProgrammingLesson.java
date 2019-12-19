import java.util.function.Function;

public class FunctionalProgrammingLesson {

    public static void main(String[] args) {

        /**
         * Автор поясняет про пользу функционального программирования.
         * Приводит примеры кода, который ведет к багам (неявные параметры методов), и написание его в функциональном стиле.
         */

        Function<Integer, Integer> add = x -> x * x;
    }

}
