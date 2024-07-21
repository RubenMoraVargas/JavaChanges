package org.una.programmingIII;

import java.util.List;
import java.util.Map;

@SuppressWarnings("ALL")
public class Java10Main {
    public static void main(String[] args) {
        // Inferencia de Tipo de Variable Local (var)
        var message = "Hello, Java 10!";
        System.out.println(message);

        // Usando var en una lista
        var names = List.of("Alice", "Bob", "Charlie");
        System.out.println("Names: " + names);

        // Usando var en un mapa
        var map = Map.of("Alice", 1, "Bob", 2, "Charlie", 3);
        System.out.println("Map: " + map);

        // Usando var en un bucle
        for (var name : names) {
            System.out.println("Hello, " + name);
        }

    }
}
