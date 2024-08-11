package RevisableConcepts.ArithmeticException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class DivideExample {
    public static void main(String[] args) {
        BigDecimal[] set1 = {BigDecimal.valueOf(10.00), BigDecimal.valueOf(2.00)};
        BigDecimal[] set2 = {BigDecimal.valueOf(10.00), BigDecimal.valueOf(3.00)};
        List<String> list = new ArrayList<>();
        try {
            BigDecimal result1 = set1[0].divide(set1[1]);
            list.add(result1.toString());
            
            //compliant solution, Doesn't throw exception but takes the scale and retuns value
            BigDecimal result3 = set2[0].divide(set2[1], 2, RoundingMode.FLOOR);
            list.add(result3.toString());

            //throws Arithmetic Exception and discards value non-complainat, denominator is the reason
            BigDecimal result2 = set2[0].divide(set2[1]);
            list.add(result2.toString());
            
            System.out.println("Value added to List");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(list);
        System.out.println("System is not short-circuited");
    }
}
