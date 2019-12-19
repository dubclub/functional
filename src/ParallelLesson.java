import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class ParallelLesson {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
            list.add(10_000_000 - i);
        }
        System.out.println(new Date());
//        list.stream().sorted().filter(x -> x%2 == 0).map(x -> new Double(x)).forEach(x -> x.toString());
        list.parallelStream().sorted().filter(x -> x%2 == 0).map(x -> new Double(x)).forEach(x -> x.toString());

        System.out.println(new Date());

        int size = 10;
        double[] values =  new double[size];
        for (int i = 0; i < values.length; i++) {
            values[i] = i;
        }
        double[] values2 =  new double[size];

        Arrays.parallelSetAll(values2, x -> x);

    }

}
