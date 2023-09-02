package com.kiruha3.exception.hw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hwTask3Main {
    private static final List<String> words = new ArrayList<>(List.of("Автором", "этих", "постулатов", "считается", "Тим",
            "Пейтерс", "Основные", "постулаты", "Красивое", "лучше", "чем", "уродливое", "Явное", "лучше",
            "чем", "неявное", "Простое", "Лучше", "чем", "сложное", "Сложное", "лучше", "чем", "запутанное",
            "Плоское", "лучше", "чем", "вложенное", "Разреженное", "лучше", "чем", "плотное", "Читаемость",
            "имеет", "значение", "Особые", "случаи", "не"));
    public static void main(String[] args) {

        unicueWords(words);
    }

    private static void unicueWords(List<String> words) {
        Set<String> unicueWords = new HashSet<>(words);
        System.out.println(unicueWords);
    }
}
