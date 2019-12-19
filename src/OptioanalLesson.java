import java.util.Optional;

public class OptioanalLesson {

    public static void main(String[] args) {

        Optional<String> optional = getString();
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        String a = null;

        String optional1 = Optional.ofNullable(a).orElse("1");
        System.out.println(optional1);



    }

    static Optional<String> getString() {
        return Optional.empty();
    }

}
