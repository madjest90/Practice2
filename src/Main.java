import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Виведення інформації про примітивні типи даних за допомогою класів-обгорток
        System.out.println("=== ІНФОРМАЦІЯ ПРО ПРИМІТИВНІ ТИПИ ДАНИХ ===");

        System.out.println("Тип: byte");
        System.out.println("  Розмір: " + Byte.SIZE + " біт (" + Byte.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Byte.MIN_VALUE);
        System.out.println("  Макс. значення: " + Byte.MAX_VALUE);
        System.out.println("----------------------------------------");

        System.out.println("Тип: short");
        System.out.println("  Розмір: " + Short.SIZE + " біт (" + Short.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Short.MIN_VALUE);
        System.out.println("  Макс. значення: " + Short.MAX_VALUE);
        System.out.println("----------------------------------------");

        System.out.println("Тип: int");
        System.out.println("  Розмір: " + Integer.SIZE + " біт (" + Integer.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Integer.MIN_VALUE);
        System.out.println("  Макс. значення: " + Integer.MAX_VALUE);
        System.out.println("----------------------------------------");

        System.out.println("Тип: long");
        System.out.println("  Розмір: " + Long.SIZE + " біт (" + Long.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Long.MIN_VALUE);
        System.out.println("  Макс. значення: " + Long.MAX_VALUE);
        System.out.println("----------------------------------------");

        System.out.println("Тип: float");
        System.out.println("  Розмір: " + Float.SIZE + " біт (" + Float.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Float.MIN_VALUE);
        System.out.println("  Макс. значення: " + Float.MAX_VALUE);
        System.out.println("----------------------------------------");

        System.out.println("Тип: double");
        System.out.println("  Розмір: " + Double.SIZE + " біт (" + Double.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Double.MIN_VALUE);
        System.out.println("  Макс. значення: " + Double.MAX_VALUE);
        System.out.println("----------------------------------------");

        System.out.println("Тип: char");
        System.out.println("  Розмір: " + Character.SIZE + " біт (" + Character.BYTES + " байт)");
        System.out.println("  Мін. значення: (int) " + (int) Character.MIN_VALUE);
        System.out.println("  Макс. значення: (int) " + (int) Character.MAX_VALUE);
        System.out.println("----------------------------------------");

        System.out.println("Тип: boolean");
        System.out.println("  Значення: true / false");
        System.out.println("========================================\n");

        // Зчитування рядків з термінала та перетворення за допомогою класів-обгорток
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ВВЕДЕННЯ ТА ПЕРЕТВОРЕННЯ ДАНИХ ===");

        System.out.print("Введіть ціле число (int): ");
        String intInput = scanner.nextLine();
        int parsedInt = Integer.parseInt(intInput);
        System.out.println("-> Успішно перетворено в int: " + parsedInt);

        System.out.print("Введіть короткє число (short): ");
        String shortInput = scanner.nextLine();
        short parsedShort = Short.parseShort(shortInput);
        System.out.println("-> Успішно перетворено в short: " + parsedShort);

        System.out.print("Введіть довге число (long): ");
        String longInput = scanner.nextLine();
        long parsedLong = Long.parseLong(longInput);
        System.out.println("-> Успішно перетворено в long: " + parsedLong);

        System.out.print("Введіть число з плаваючою комою (float): ");
        String floatInput = scanner.nextLine();
        float parsedFloat = Float.parseFloat(floatInput);
        System.out.println("-> Успішно перетворено в float: " + parsedFloat);

        System.out.print("Введіть число подвійної точності (double): ");
        String doubleInput = scanner.nextLine();
        double parsedDouble = Double.parseDouble(doubleInput);
        System.out.println("-> Успішно перетворено в double: " + parsedDouble);

        System.out.print("Введіть логічне значення (boolean - true/false): ");
        String boolInput = scanner.nextLine();
        boolean parsedBool = Boolean.parseBoolean(boolInput);
        System.out.println("-> Успішно перетворено в boolean: " + parsedBool);

        scanner.close();
    }
}