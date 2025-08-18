package top.sergeyslesarev;

import java.util.Scanner;

/**
 * Класс для перевода временных понятий (сезоны, дни недели, месяцы)
 */
public class Translator {
    /**
     * Переводит название сезона с русского на английский
     * Формат ввода: "сезон год" (пример: "лето 2025")
     * Возвращает null если:
     * - Входная строка null или пустая
     * - Не содержит известного сезона ("зима"/"весна"/"лето"/"осень")
     */
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

    /**
     * Переводит день недели с русского на английский
     * Формат ввода: "дата, день" (пример: "18.08.2025, понедельник")
     * Возвращает null если:
     * - Входная строка null или пустая
     * - Не содержит известного дня недели
     */
    public static String translateWeekday(String input) {
        if (input == null || input.trim().isEmpty()) {
            return null;
        }

        if (input.contains("понедельник")) {
            return input.replace("понедельник", "Monday");
        }
        if (input.contains("вторник")) {
            return input.replace("вторник", "Tuesday");
        }
        if (input.contains("среда")) {
            return input.replace("среда", "Wednesday");
        }
        if (input.contains("четверг")) {
            return input.replace("четверг", "Thursday");
        }
        if (input.contains("пятница")) {
            return input.replace("пятница", "Friday");
        }
        if (input.contains("суббота")) {
            return input.replace("суббота", "Saturday");
        }
        if (input.contains("воскресенье")) {
            return input.replace("воскресенье", "Sunday");
        }

        return null;
    }

    /**
     * Переводит название месяца с русского на английский
     * Формат ввода: "месяц год" (пример: "август 2025")
     * Возвращает null если:
     * - Входная строка null или пустая
     * - Не содержит известного месяца
     */
    public static String translateMonth(String input) {
        if (input == null || input.trim().isEmpty()) {
            return null;
        }

        if (input.contains("январь")) {
            return input.replace("январь", "January");
        }
        if (input.contains("февраль")) {
            return input.replace("февраль", "February");
        }
        if (input.contains("март")) {
            return input.replace("март", "March");
        }
        if (input.contains("апрель")) {
            return input.replace("апрель", "April");
        }
        if (input.contains("май")) {
            return input.replace("май", "May");
        }
        if (input.contains("июнь")) {
            return input.replace("июнь", "June");
        }
        if (input.contains("июль")) {
            return input.replace("июль", "July");
        }
        if (input.contains("август")) {
            return input.replace("август", "August");
        }
        if (input.contains("сентябрь")) {
            return input.replace("сентябрь", "September");
        }
        if (input.contains("октябрь")) {
            return input.replace("октябрь", "October");
        }
        if (input.contains("ноябрь")) {
            return input.replace("ноябрь", "November");
        }
        if (input.contains("декабрь")) {
            return input.replace("декабрь", "December");
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа перевода временных понятий");

        // Внешний цикл для выбора функции
        while (true) {
            System.out.println("\nВыберите тип перевода:");
            System.out.println("1 - Сезоны (формат: 'сезон год')");
            System.out.println("2 - Дни недели (формат: 'дата, день')");
            System.out.println("3 - Месяцы (формат: 'месяц год')");
            System.out.println("0 - Выход из программы");
            System.out.print("Ваш выбор: ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("0")) {
                System.out.println("Завершение работы программы");
                break;
            }

            // Внутренний цикл для повторения операций
            while (true) {
                String input = "";
                String result = null;
                String errorMsg = "";
                String formatHint = "";

                switch (choice) {
                    case "1":
                        formatHint = "сезон год (пример: лето 2025)";
                        System.out.print("\nВведите '" + formatHint + "' или 'exit' для возврата: ");
                        input = scanner.nextLine().trim();
                        if (input.equalsIgnoreCase("exit")) break;
                        result = translateSeason(input);
                        errorMsg = "Допустимые сезоны: зима, весна, лето, осень";
                        break;

                    case "2":
                        formatHint = "дата, день (пример: 18.08.2025, понедельник)";
                        System.out.print("\nВведите '" + formatHint + "' или 'exit' для возврата: ");
                        input = scanner.nextLine().trim();
                        if (input.equalsIgnoreCase("exit")) break;
                        result = translateWeekday(input);
                        errorMsg = "Допустимые дни: понедельник-воскресенье";
                        break;

                    case "3":
                        formatHint = "месяц год (пример: август 2025)";
                        System.out.print("\nВведите '" + formatHint + "' или 'exit' для возврата: ");
                        input = scanner.nextLine().trim();
                        if (input.equalsIgnoreCase("exit")) break;
                        result = translateMonth(input);
                        errorMsg = "Допустимые месяцы: январь-декабрь";
                        break;

                    default:
                        System.out.println("Некорректный выбор. Попробуйте снова.");
                        break;
                }

                if (input.equalsIgnoreCase("exit")) {
                    break; // Выход из внутреннего цикла
                }

                // Вывод результата
                if (result != null) {
                    System.out.println("Результат: " + result);
                } else if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                    continue; // Некорректный выбор функции
                } else {
                    System.out.println("Ошибка: некорректный ввод или формат");
                    System.out.println("Ожидаемый формат: " + formatHint);
                    System.out.println(errorMsg);
                }
            }
        }

        scanner.close();
    }
}