package org.una.programmingIII;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

@SuppressWarnings("ALL")
public class Java19Main {
    public static void main(String[] args) throws InterruptedException {
        // Threads Virtuales (Preview)
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                executor.submit(() -> {
                    System.out.println("Hello from virtual thread: " + Thread.currentThread());
                });
            }
        }

        // Coincidencia de Patrones para Switch (Preview)
        Object obj = 123;
        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown type";
        };
        System.out.println("Pattern Matching for switch: " + result);

        // Vectores (Tercera Incubadora)

        // API de Acceso a Memoria Extranjera (Tercera Incubadora) Facilitates interaction with memory and functions outside the JVM.
    }
}
