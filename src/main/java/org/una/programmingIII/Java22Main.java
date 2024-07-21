/* package org.una.programmingIII;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.List;

@SuppressWarnings("ALL")
public class Java22Main {
    public static void main(String[] args) throws Exception {
        // Concurrencia Estructurada (Segunda Preview)
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Future<String> future1 = scope.fork(() -> {
                TimeUnit.SECONDS.sleep(1);
                return "Task 1 result";
            });

            Future<String> future2 = scope.fork(() -> {
                TimeUnit.SECONDS.sleep(2);
                return "Task 2 result";
            });

            scope.join();  // Wait for all tasks to complete
            scope.throwIfFailed();  // Throw if any task failed

            System.out.println(future1.resultNow());
            System.out.println(future2.resultNow());
        }

        // Valores con Ámbito (Segunda Preview)
        ScopedValue<String> userId = ScopedValue.newInstance();
        try (var handle = userId.bind("user-123")) {
            System.out.println("Scoped value: " + userId.get());
        }

        // API de Vectores (Séptima Incubadora)
        Vector22Example vectorExample = new Vector22Example();
        vectorExample.performVectorOperations();

        // Compatibilidad con Unicode 15.1
        String unicodeString = "𐍈";
        System.out.println("Unicode 15.1 Character: " + unicodeString);

        // Lanzador de Programas con Múltiples Archivos Fuente - Allows running programs supplied as multiple files of Java source code.");

        // Pinning de Regiones para G1 - Reduces latency by implementing region pinning in G1.
    }
}

 */