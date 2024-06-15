package DuplicateElement;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> originalList = Arrays.asList(new Integer[] {1,3,6,3,2,5,7,3,2,4,2,4});
        System.out.println("Original List : " +originalList);
        usingCollectionsFrequency(originalList);
        usingSet(originalList);
        usingMap(originalList);
    }

    private static void usingMap(List<Integer> integerList) {
        Map<Integer, Long> duplicateMap = integerList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> duplicateList =  duplicateMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Duplicate List from usingMap: " +duplicateList);
    }
   
    private static void usingSet(List<Integer> integerList) {
        Set<Integer> newSet = new HashSet<>();
        Set<Integer> duplicateSet =
                integerList.stream().filter(values -> !newSet.add(values)).collect(Collectors.toSet());
        System.out.println("Duplicate List from usingSet: " +duplicateSet);
    }

    private static void usingCollectionsFrequency(List<Integer> integerList) {
        List<Integer> duplicateList =
                integerList.stream().filter(values -> Collections.frequency(integerList, values) > 1).distinct().collect(Collectors.toList());
        System.out.println("Duplicate List from usingCollectionsFrequency: " +duplicateList);
    }
    
    
}