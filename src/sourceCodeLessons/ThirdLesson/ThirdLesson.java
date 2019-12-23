package sourceCodeLessons.ThirdLesson;

import java.util.function.Consumer;

public class ThirdLesson {

    public static void main(String[] args) {

        Consumer<String> consumer = ThirdLesson::printLn;
        consumer.accept("Hello!");

        Database database = User::new;
        User user = database.create("Alex", "Black");
        System.out.printf("Name: %s%nPassword: %s", user.getName(), user.getPassword());

    }

    private static void printLn(String text) {
        System.out.println(text);
    }

}


