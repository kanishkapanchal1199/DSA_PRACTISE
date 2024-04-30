package java11Features.Strings.Strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciGenerator {

    public static void main(String[] args) {
        List<Integer> fibonacciNumbers = generateFibonacci();
        System.out.println(fibonacciNumbers);
    }

    static List<Integer> generateFibonacci() {
        return Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(10)
                .map(fibPair -> fibPair[0])
                .collect(Collectors.toList());
    }
}
