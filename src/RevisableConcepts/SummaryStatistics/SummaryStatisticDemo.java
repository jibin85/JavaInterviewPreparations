package RevisableConcepts.SummaryStatistics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatisticDemo {
    public static void main(String[] args) {
        Integer[] values = {1,3,6,3,2,5,7,3,2,4,2,4};
        List<Integer> originalList = Arrays.asList(values);
        IntSummaryStatistics statistics = originalList.stream().mapToInt(value -> value).summaryStatistics();
        System.out.println("Min Value : " +statistics.getMin());
        System.out.println("Max Value : " +statistics.getMax());
        System.out.println("Average Value: " +statistics.getAverage());
        System.out.println("Sum : " +statistics.getSum());
        System.out.println("Count : " +statistics.getCount());
    }
}
