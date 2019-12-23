package sourceCodeLessons;

public class SecondLesson {

    public static void main(String[] args) {
        Operation<Integer> integerOperation = Integer::sum;
        System.out.println(integerOperation.getResult(1, 2));

        Operation<String> stringOperation = (v1, v2) -> v1 + v2;
        System.out.println(stringOperation.getResult("a", "b"));
    }



}
