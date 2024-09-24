package RevisableConcepts.MissingValuesFromCatalogue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingValuesFinder {
    public static void main(String[] args) {
        // Catalogue list (values present in the catalogue file)
        Set<String> catalogueSet = new HashSet<>(Arrays.asList(
                "D0001000-DC", "D0001850-DC", "D0001851-DC", "D0001350-DC", "D0001351-DC",
                "DB007500-DC", "DB007600-DC", "DG001350-DC", "DG001350|100007", "DG001350|115369",
                "DG001850-DC", "DG001850|100007", "DG001850|115369", "MG001350-DC", "MG001350|100007",
                "MG001350|115369", "BG001350-DC", "BG001350|100007", "BG001350|115369", "D0001250-DC"
        ));

        // SQL list (values present in the SQL file)
        Set<String> sqlSet = new HashSet<>(Arrays.asList(
                "D0001000-DC", "D0001850-DC", "D0001851-DC", "D0001350-DC", "D0001351-DC",
                "DB007500-DC", "DB007600-DC", "DG001350|100007", "DG001350|115369",
                "DG001850-DC", "DG001850|100007", "DG001850|115369", "MG001350|100007",
                "MG001350|115369", "BG001350|100007", "BG001350|115369", "D0001250-DC"
        ));

        // Find missing values
        Set<String> missingValues = new HashSet<>(catalogueSet);
        missingValues.removeAll(sqlSet);

        // Print missing values
        System.out.println("Missing values:");
        for (String value : missingValues) {
            System.out.println(value);
        }
    }
}

