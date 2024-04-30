package java11Features.Strings.Strings;

import java.util.Arrays;
import java.util.List;

public class VarExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 2, 6, 1, 4);
        numbers.sort((var a, var b) -> b.compareTo(a));
        System.out.println(numbers);

        var task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task executed");
            }
        };

        System.out.println(task.getClass().getName());
    }
}
