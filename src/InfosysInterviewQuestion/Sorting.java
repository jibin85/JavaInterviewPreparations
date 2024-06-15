package InfosysInterviewQuestion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        
        //Question 1: Sort the given array in whatever order 
        String[] array = {"Java", "Python", "C#", "Java", "Kotlin", "Python"};
        List<String> arrayList = Arrays.asList(array);
        List<String> sortedList =
                arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List : " +sortedList);

        //Question 2: Identify the duplicate elements of the given array with its frequency
        Map<String, Long> mapValue = arrayList.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println("Duplicate Map : " +mapValue);
    }
}
