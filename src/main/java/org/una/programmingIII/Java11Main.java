package org.una.programmingIII;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.function.Consumer;

@SuppressWarnings("ALL")
public class Java11Main {
    public static void main(String[] args) throws Exception {
        // Nuevos Métodos de String
        String multilineString = "Line1\nLine2\nLine3";
        multilineString.lines().forEach(System.out::println);

        String spacedString = "  Hello World!  ";
        System.out.println("Strip: '" + spacedString.strip() + "'");
        System.out.println("Repeat: " + "Java".repeat(3));

        // Sintaxis de Variable Local para Parámetros Lambda
        Consumer<String> printConsumer = (var message) -> System.out.println(message);
        printConsumer.accept("Hello from lambda with var!");

        // Cliente HTTP/2
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("HTTP Response: " + response.body());

        // Control de Acceso Basado en anidacion
        OuterClass outer = new OuterClass();
        outer.innerClassAccess();

        // ZGC (Garbage Collector) - No hay ejemplo directo en código, pero es importante mencionar su uso.
    }
}

@SuppressWarnings("ALL")
class OuterClass {
    private String outerField = "Outer field value";

    void innerClassAccess() {
        InnerClass inner = new InnerClass();
        inner.printOuterField();
    }

    class InnerClass {
        void printOuterField() {
            System.out.println("Accessing from InnerClass: " + outerField);
        }
    }
}