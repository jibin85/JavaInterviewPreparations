package DesignPatterns.StructuralDesignPatterns.ProxyPattern;

import DesignPatterns.StructuralDesignPatterns.ProxyPattern.Exception.InvalidFrequencyException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RealSubjectClass implements Subject{
    @Override
    public void method(String passKey) {
        System.out.println("\n-------------------------REAL CLASS--------------------------");
        Credentials credentials = new Credentials();
        credentials.setFrequency(getFrequency(passKey));
        System.out.println("Frequency of the request is: "+ credentials.getFrequency());
    }

    public int getFrequency(String passKey) {
        int number = 0;
        Matcher matcher = Pattern.compile("jibin-\\d+").matcher(passKey);
        // Check if the matcher found any digits
        if (matcher.find()) {
            // Extract the first match
            String numberString = matcher.group().replace("jibin-", "");
            // Convert the extracted string to an integer
            number = Integer.parseInt(numberString);
            // Sets the frequency for the extracted
        } else {
            throw new InvalidFrequencyException("PassKey doesn't contain appropriate frequency code :-(");
        }
        return 2*number;
    }
}
