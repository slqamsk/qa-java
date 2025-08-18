package top.sergeyslesarev;

import java.util.Scanner;

/**
 * Реализовать функцию translateSeason, которая:
 * - Принимает строку формата "время_года год" (пример: "лето 2025")
 * - Заменяет русское название сезона на английское ("summer 2025") и возвращает полученную строку
 * - Возвращает null если:
 *   * Входная строка null или пустая
 *   * Не содержит известного сезона ("зима"/"весна"/"лето"/"осень")
 */

public class Translator {
    public static String translateSeason(String input) {
        if (input == null || input.trim().isEmpty()) {
            return null;
        }

        if (input.contains("зима")) {
            return input.replace("зима", "winter");
        }
        if (input.contains("весна")) {
            return input.replace("весна", "spring");
        }
        if (input.contains("лето")) {
            return input.replace("лето", "summer");
        }
        if (input.contains("осень")) {
            return input.replace("осень", "autumn");
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа перевода сезонов (для выхода введите 'exit')");

        while (true) {
            System.out.print("\nВведите строку формата 'сезон год': ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Завершение работы программы");
                break;
            }

            String result = translateSeason(input);

            if (result != null) {
                System.out.println("Результат: " + result);
            } else {
                System.out.println("Ошибка: некорректный ввод или неизвестный сезон");
                System.out.println("Допустимые сезоны: зима, весна, лето, осень");
            }
        }

        scanner.close();
    }
}