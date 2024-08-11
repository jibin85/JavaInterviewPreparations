package RevisableConcepts.SalarySorting;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo {
    public static void main(String args[]){
        List<Employee> employeeList = employeeList();
        ascendingOrderSorting(employeeList);
        descendingOrderSorting(employeeList);
    }

    private static void ascendingOrderSorting(List<Employee> employeeList) {
        List<Employee> sortedEmployee =
                employeeList.stream().sorted(Comparator.comparingInt(o -> o.getSalary().intValue())).collect(Collectors.toList());
        System.out.println("Sorted Employee list based on Salary in Ascending Order: \n" +sortedEmployee);
    }

    private static void descendingOrderSorting(List<Employee> employeeList) {
        List<Employee> sortedEmployee =
                employeeList.stream().sorted((o1, o2) ->  o2.getSalary().intValue() - o1.getSalary().intValue()).collect(Collectors.toList());
        System.out.println("Sorted Employee list based on Salary in Descending Order: \n" +sortedEmployee);
    }

    private static List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, BigDecimal.valueOf(10000.00)));
        employeeList.add(new Employee(2, BigDecimal.valueOf(10500.00)));
        employeeList.add(new Employee(3, BigDecimal.valueOf(20000.00)));
        employeeList.add(new Employee(4, BigDecimal.valueOf(20500.00)));
        employeeList.add(new Employee(5, BigDecimal.valueOf(30000.00)));
        employeeList.add(new Employee(6, BigDecimal.valueOf(30500.00)));
        employeeList.add(new Employee(7, BigDecimal.valueOf(40000.00)));
        employeeList.add(new Employee(8, BigDecimal.valueOf(40500.00)));
        employeeList.add(new Employee(9, BigDecimal.valueOf(50000.00)));
        employeeList.add(new Employee(10, BigDecimal.valueOf(50500.00)));
        return employeeList;
    }
}
