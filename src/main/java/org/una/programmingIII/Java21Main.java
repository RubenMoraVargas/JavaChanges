package org.una.programmingIII;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

@SuppressWarnings("ALL")
public class Java21Main {
    public static void main(String[] args) throws InterruptedException {
        // Threads Virtuales (Estándar)
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                executor.submit(() -> {
                    System.out.println("Hello from virtual thread: " + Thread.currentThread());
                });
            }
        }

        // Coincidencia de Patrones para Switch (Estándar)
        Object obj = 123;
        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown type";
        };
        System.out.println("Pattern Matching for switch: " + result);

        // Expresiones Record
        record Point(int x, int y) {
            Point {
                if (x < 0 || y < 0) {
                    throw new IllegalArgumentException("Coordinates must be non-negative");
                }
            }
        }
        Point point = new Point(10, 20);
        System.out.println("Record Example: Point(" + point.x() + ", " + point.y() + ")");

        // API de Memoria Extranjera (Estándar)

        // API de Vectores (Quinta Incubadora)
    }
}
