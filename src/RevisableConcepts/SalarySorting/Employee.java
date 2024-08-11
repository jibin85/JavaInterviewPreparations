package RevisableConcepts.SalarySorting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {
    private int id;
    private BigDecimal salary;
}
