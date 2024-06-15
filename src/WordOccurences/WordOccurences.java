package WordOccurences;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurences {
    
    private static final String ONE_SPACE = " ";
    
    public static void main(String args[]){
        String sentence = "The old house creaked as the wind blew through its open windows";        
        includesCase(sentence);
        excludesCase(sentence);
        excludesCaseUsingStreams(sentence);
    }

    private static void excludesCaseUsingStreams(String sentence) {
        String[] splittedWords = sentence.split(ONE_SPACE);

        // Convert to lowercase and collect into a list
        List<String> lowercaseWords = Arrays.stream(splittedWords)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        // Count occurrences of each word using streams
        Map<String, Long> wordCounts = lowercaseWords.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        // Convert counts to Map<String, Integer>
        Map<String, Integer> mapValue = wordCounts.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().intValue()
                ));
        System.out.println("excludesCaseUsingStreams: " + mapValue);
    }

    private static void includesCase(String sentence) {
        List<String> splittedWords = Arrays.asList(sentence.split(ONE_SPACE));
        Map<String, Long> wordOccurencesMap = splittedWords.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println("includesCase: "+wordOccurencesMap);
    }
    
    private static void excludesCase(String sentence) {
        List<String> splittedWordsOriginalList = Arrays.asList(sentence.split(ONE_SPACE));
        List<String>  loweCaseWordList = splittedWordsOriginalList.stream().map(String::toLowerCase).collect(Collectors.toList());
        Map<String, Integer> mapValue = new HashMap<>();
        for(String originalWords : loweCaseWordList){
            int count = 0;
            for(String duplicateWords : loweCaseWordList) {
                if (originalWords.equals(duplicateWords)) {
                    count++;
                    mapValue.put(originalWords,count);
                }
            }
        }
        System.out.println("excludesCase: "+mapValue);     
    }
}
