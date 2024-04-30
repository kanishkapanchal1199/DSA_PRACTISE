package DSA_TOPICS.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayCountExample {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0};

        List<Integer> resultList = getUniqueListWithRepetition(arr);

        // Print the result list
        System.out.println(resultList);
    }

    private static List<Integer> getUniqueListWithRepetition(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
       // Set<Integer> uniqueSet = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        // Count the occurrences of each element in the array
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Add the elements to the result list in the order they appear in the array, repeated according to count
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num);
                for (int i = 0; i < count; i++) {
                    resultList.add(num);
                    //uniqueSet.add(num); // Add to the HashSet to ensure uniqueness
                }
                countMap.remove(num); // Remove the element from the map to avoid duplicates
            }
        }

        return resultList;
    }

}
