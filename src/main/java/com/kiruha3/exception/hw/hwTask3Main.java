package com.kiruha3.exception.hw;

import java.util.ArrayList;
import java.util.List;

public class hwTask3Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Автором", "этих", "постулатов", "считается", "Тим",
                "Пейтерс", "Основные", "постулаты", "Красивое", "лучше", "чем", "уродливое", "Явное", "лучше",
                "чем", "неявное", "Простое", "лучше", "чем", "сложное", "Сложное", "лучше", "чем", "запутанное",
                "Плоское", "лучше", "чем", "вложенное", "Разреженное", "лучше", "чем", "плотное", "Читаемость",
                "имеет", "значение", "Особые", "случаи", "не"));
        unicueWords(words);
    }

    private static void unicueWords(List<String> words) {
        List<String> unicueWords = new ArrayList<>();
        for (int word = 0; word < words.size(); word++) {
                if (!unicueWords.contains(words.get(word).toLowerCase())) {
                    unicueWords.add(words.get(word));
            }
        }
        System.out.println(unicueWords);
    }
}
