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

public class TranslatorTask {
    public static String translateSeason(String input) {
        return "Функция translateSeason пока не реализована";
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