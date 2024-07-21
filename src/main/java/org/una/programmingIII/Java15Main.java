package org.una.programmingIII;

@SuppressWarnings("ALL")
public class Java15Main {
    public static void main(String[] args) {
        // Bloques de Texto
        String textBlock = """
                This is a text block in Java 15.
                It is now a standard feature.
                It can span multiple lines and maintains the formatting.
                """;
        System.out.println("Text Block Example:\n" + textBlock);

        // Clases Selladas (Preview)
        // Definición de una clase sellada
        SealedClassExample example = new SealedClassExample();
        example.showDetails();

        // Clases Ocultas, Useful for frameworks to dynamically generate classes that are not exposed outside the runtime.

        // API de Acceso a Memoria Extranjera Foreign Memory Access API - Facilitates interaction with memory outside the Java heap.
    }
}

sealed class SealedClassExample permits SubClass1, SubClass2 {
    void showDetails() {
        System.out.println("This is a sealed class.");
    }
}

final class SubClass1 extends SealedClassExample {
    // Implementation details
}

final class SubClass2 extends SealedClassExample {
    // Implementation details
}
