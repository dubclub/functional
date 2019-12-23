package sourceCodeLessons.SixLesson;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("v1", "v2", "v3", "v4", "v5");
//        stream.skip(2).forEach(System.out::println);
        stream.limit(2).forEach(System.out::println);

        Stream<Film> films = Stream.of(new Film("Deadpool", 100.0), new Film("Avatar", 200.0));
        films.map(Film::getPrice).filter(x -> x <= 100).forEach(System.out::println);

        Stream<Pizza> pizzaStream = Stream.of(new Pizza("Pep", 150));
        pizzaStream.flatMap(pizza -> Stream.of(
                String.format("Pizza: %s, price: $%d", pizza.getTitle(), pizza.getPrice()),
                String.format("(Happy ours discount - 50%%)%nPizza: %s, price: $%d", pizza.getTitle(), pizza.getPrice() / 2)
        )).forEach(System.out::println);


    }

}
