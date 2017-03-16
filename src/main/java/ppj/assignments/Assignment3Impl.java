package ppj.assignments;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Martin on 06.03.2017.
 */
public class Assignment3Impl implements Assignment3 {
    @Override
    public int deepSumOfEvenSquaredNumbers(List<List<Integer>> src) {
        return src.stream().flatMap(List::stream).filter(a -> a % 2 == 0).mapToInt(n -> n*n).sum();
    }

    @Override
    public int sumOfDivisibleInRange(int from, int to, List<Integer> divisibleBy) {
        return IntStream.range(from,to).boxed().collect(Collectors.toList())
                .stream().filter(i -> divisibleBy.stream().allMatch(e -> i % e == 0)).mapToInt(n -> n).sum();
    }
}
