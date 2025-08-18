package top.sergeyslesarev;

import java.util.Scanner;

public class TranslatorArrayTask {
    // Массивы для хранения данных
    private static final String[] RUS_SEASONS = {"зима", "весна", "лето", "осень"};
    private static final String[] ENG_SEASONS = {"winter", "spring", "summer", "autumn"};

    private static final String[] RUS_WEEKDAYS = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
    private static final String[] ENG_WEEKDAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    private static final String[] RUS_MONTHS = {"январь", "февраль", "март", "апрель", "май", "июнь",
            "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
    private static final String[] ENG_MONTHS = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

    public static String translateSeason(String input) {
        return "Функция пока не реализована";
    }

    public static String translateWeekday(String input) {
        return "Функция пока не реализована";
    }

    public static String translateMonth(String input) {
        return "Функция пока не реализована";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа перевода временных понятий (версия с массивами)");

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
                        errorMsg = "Допустимые сезоны: " + String.join(", ", RUS_SEASONS);
                        break;

                    case "2":
                        formatHint = "дата, день (пример: 18.08.2025, понедельник)";
                        System.out.print("\nВведите '" + formatHint + "' или 'exit' для возврата: ");
                        input = scanner.nextLine().trim();
                        if (input.equalsIgnoreCase("exit")) break;
                        result = translateWeekday(input);
                        errorMsg = "Допустимые дни: " + String.join(", ", RUS_WEEKDAYS);
                        break;

                    case "3":
                        formatHint = "месяц год (пример: август 2025)";
                        System.out.print("\nВведите '" + formatHint + "' или 'exit' для возврата: ");
                        input = scanner.nextLine().trim();
                        if (input.equalsIgnoreCase("exit")) break;
                        result = translateMonth(input);
                        errorMsg = "Допустимые месяцы: " + String.join(", ", RUS_MONTHS);
                        break;

                    default:
                        System.out.println("Некорректный выбор. Попробуйте снова.");
                        break;
                }

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                if (result != null) {
                    System.out.println("Результат: " + result);
                } else if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                    continue;
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