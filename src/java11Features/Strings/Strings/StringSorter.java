package java11Features.Strings.Strings;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StringSorter {

    public static void main(String[] args) {
        List<String> inputList = List.of("Java", "Python", "C++", "Kotlin", "COBOL");
        List<String> sortedList = sort(inputList);
        System.out.println(sortedList);
    }

    static List<String> sort(List<String> listOfStrings) {
        return listOfStrings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }
}
