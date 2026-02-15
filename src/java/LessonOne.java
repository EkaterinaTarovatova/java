import java.io.*;
import java.nio.charset.StandardCharsets;

public class LessonOne {
    public static void main(String[] args) {
        char[] vowels = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', 'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я'};
        char[] consonants = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ'};
        int vCount = 0;
        int conCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt", StandardCharsets.UTF_8));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder newLine = new StringBuilder();

                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);
                    boolean isVowel = false;
                    boolean isConsonant = false;

                    for (char vowel : vowels) {
                        if (symbol == vowel) {
                            newLine.append('a');
                            vCount++;
                            isVowel = true;
                            break;
                        }
                    }

                    if (!isVowel) {
                        for (char consonant : consonants) {
                            if (symbol == consonant) {
                                newLine.append('м');
                                conCount++;
                                isConsonant = true;
                                break;
                            }
                        }
                    }
                    if (!isVowel && !isConsonant) {
                        newLine.append(symbol);
                    }
                }

                writer.write(newLine.toString());
                writer.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Количество гласных - " + vCount);
        System.out.println("Количество согласных - " + conCount);
    }
}