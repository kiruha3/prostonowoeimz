package com.kiruha3.exception.hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hwTask4Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("один", "два", "три","два", "три", "три"));
        unicueWords(strings);
    }
    private static void countRepaterWords(Map<String, Integer> unicueWords, List<String> words) {
        for (int word = 0; word < words.size(); word++) {
            if (unicueWords.containsKey(words.get(word))) {
                unicueWords.put(words.get(word),unicueWords.get(words.get(word))+1);
            }
        }
        System.out.println(unicueWords.values());
    }
    private static void count1RepaterWords(List<String> strings) {

    }

    private static void unicueWords(List<String> words) {
        Map<String,Integer> unicueWords = new HashMap<>();
        for (int word = 0; word < words.size(); word++) {
            unicueWords.put(words.get(word),0);
        }
        countRepaterWords(unicueWords,words);

    }




}
