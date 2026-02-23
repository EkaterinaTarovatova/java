package com.lesson.three.read.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите путь к файлу или название: ");
            String filePath = scanner.nextLine();

            String name = null;
            String surname = null;
            Integer age = null;

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains("=")) {
                        String[] parts = line.split("=");
                        String key = parts[0].trim();
                        String value = parts[1].trim();
                        switch (key) {
                            case "name":
                                name = value;
                                break;
                            case "surname":
                                surname = value;
                                break;
                            case "age":
                                age = Integer.parseInt(value);
                                break;
                            default:
                                System.out.println("Неизвестный ключ");
                        }
                    }
                }

            } catch (FileNotFoundException e) {
                System.out.println("По данному пути файл не найден. Проверьте корректность пути и попробуйте ещё раз.");
            } catch (IOException e) {
                System.out.println("Ошибка чтения файла: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Значение возраста не является числом.");
            }

            if (name == null || surname == null || age == null) {
                System.out.println("В файле отсутствует одно или несколько обязательных полей");
                continue;
            }
            System.out.println("{");
            System.out.println("  \"name\": \"" + name + "\",");
            System.out.println("  \"surname\": \"" + surname + "\",");
            System.out.println("  \"age\": " + age);
            System.out.println("}");
        }
    }
}










