import java.util.function.Function;

public class FunctionalProgrammingLesson {

    static double v3 = 3.0;

    public static void main(String[] args) {

        /**
         * Автор поясняет про пользу функционального программирования.
         * Приводит примеры кода, который ведет к багам (неявные параметры методов), и написание его в функциональном стиле.
         */

        Function<Integer, Integer> add = x -> x * x;

        double v1 = 2.0;
        double v2 = 2.0;

        Operation operation = () -> {
            return v1 + v2 + v3;
        };



        System.out.println(operation.getResult());
        System.out.println(v1);
        System.out.println(v2);

        System.out.println(v3);

    }


}

interface Operation {
    double getResult();
}
