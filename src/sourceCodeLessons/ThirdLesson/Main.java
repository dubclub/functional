package sourceCodeLessons.ThirdLesson;

public class Main {

    public static void main(String[] args) {

        System.out.println(getOperation('*').getResult(5, 3));
        System.out.println(getOperation('/').getResult(5, 3));
        System.out.println(getOperation('+').getResult(5, 3));
        System.out.println(getOperation('-').getResult(5, 3));

    }

    private static Operation getOperation(char sym) {
        switch (sym) {
            case '*':
                return (v1, v2) -> v1 * v2;
            case '/':
                return (v1, v2) -> v1 / v2;
            case '+':
                return Integer::sum;
            case '-':
                return (v1, v2) -> v1 - v2;
            default:
                return (v1, v2) -> 0;
        }
    }

}
