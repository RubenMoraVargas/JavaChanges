package org.una.programmingIII;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class Java8Main {
    public static void main(String[] args) {
        // Expresiones Lambda
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Hello, " + name));

        // Stream API
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);

        // Clase Optional
        Optional<String> optionalName = findName("Alice");
        optionalName.ifPresent(name -> System.out.println("Found: " + name));

        // API de Fecha y Hora
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        System.out.println("Today: " + today.format(DateTimeFormatter.ISO_DATE));
        System.out.println("Current Time: " + now.format(DateTimeFormatter.ISO_TIME));

    }

    private static Optional<String> findName(String name) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        return names.stream()
                .filter(n -> n.equalsIgnoreCase(name))
                .findFirst();
    }
}
