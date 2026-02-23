package com.lesson.three.find.frequency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "HW.txt";
        List<String> allWords = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String cleanLine = line.replaceAll("[^a-zA-Zа-яА-Я]", " ");
                String[] words = cleanLine.toLowerCase().split("\\s+");
                allWords.addAll(List.of(words));
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        Map<String, Integer> frequency = new HashMap<>();
        for (String word : allWords) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        int maxFrequency = Collections.max(frequency.values());

        List<String> maxFrequencyWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                maxFrequencyWords.add(entry.getKey());
            }
        }

        List<String> sortedWords = new ArrayList<>(frequency.keySet());
        Collections.sort(sortedWords);

        Collections.sort(allWords);
        System.out.println("Все слова в алфавитном порядке: " + allWords);
        System.out.println("\nЧастота слов:");
        for (String word : sortedWords) {
            System.out.println(word + " — " + frequency.get(word));
        }
        System.out.println("\nСлова с максимальной частотой: ");
        for (String word : maxFrequencyWords) {
            System.out.println(word + " — " + frequency.get(word));
        }
    }
}

