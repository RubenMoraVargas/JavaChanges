package org.una.programmingIII;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@SuppressWarnings("ALL")
public class Java12Main {
    public static void main(String[] args) {
        // Expresiones Switch (Preview)
        int day = 3;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println("Day type: " + dayType);

        // Nuevos Métodos en String
        String text = " Hello Java 12 ";
        String transformed = text.transform(String::trim);
        System.out.println("Transformed String: '" + transformed + "'");

        String indentedText = "Java\nis\nfun".indent(4);
        System.out.println("Indented Text:\n" + indentedText);

        // Nuevos Métodos en Files
        try {
            Path filePath = Paths.get("example.txt");
            List<String> lines = Files.readAllLines(filePath);
            lines.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
