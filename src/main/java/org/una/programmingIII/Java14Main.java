package org.una.programmingIII;

@SuppressWarnings("ALL")
public class Java14Main {
    public static void main(String[] args) {
        // Coincidencia de Patrones para instanceof (Preview)
        Object obj = "Hello, Java 14!";
        if (obj instanceof String s) {
            System.out.println("Pattern Matching instanceof: " + s.toUpperCase());
        }

        // Registros (Preview)
        record Person(String name, int age) {}
        Person person = new Person("Alice", 30);
        System.out.println("Record Example: " + person.name() + " is " + person.age() + " years old.");

        // NullPointerExceptions Más Útiles
        String str = null;
        try {
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException with useful message: " + e.getMessage());
        }

        // Expresiones Switch
        int day = 5;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println("Day type: " + dayType);
    }
}
