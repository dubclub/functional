import java.util.stream.Stream;

public class MethodReferencesLesson {

    public static void main(String[] args) {
        Stream.of("one", "two").map(x -> x.toUpperCase());
        Stream.of("one", "two").map(String::toUpperCase);

        Stream.of(new Student("max"), new Student("Mike")).map(Student::getName).forEach(System.out::println);
        Stream.of("max", "Mike").map(Student::new).forEach(System.out::println);

    }

}

class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
