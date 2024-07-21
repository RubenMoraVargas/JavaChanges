package org.una.programmingIII;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


@SuppressWarnings("ALL")
public class Java20Main {
    public static void main(String[] args) throws InterruptedException {
        // Threads Virtuales (Segunda Preview)
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                executor.submit(() -> {
                    System.out.println("Hello from virtual thread: " + Thread.currentThread());
                });
            }
        }

        // Coincidencia de Patrones para Switch (Segunda Preview)
        Object obj = 123;
        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown type";
        };
        System.out.println("Pattern Matching for switch: " + result);

        // Clases de Registro (Estándar)

    }
}