package org.una.programmingIII;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

@SuppressWarnings("ALL")
public class Java9Main {
    public static void main(String[] args) throws Exception {
        // Sistema de Módulos (Project Jigsaw)

        // Este archivo utiliza el módulo java.net.http que es parte del sistema de módulos.

        // Cliente HTTP/2
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("HTTP/2 Example: " + response.body());

        // Métodos de Fábrica para Colecciones
        List<String> immutableList = List.of("Alice", "Bob", "Charlie");
        Map<String, Integer> immutableMap = Map.of("Alice", 1, "Bob", 2, "Charlie", 3);
        System.out.println("Immutable List: " + immutableList);
        System.out.println("Immutable Map: " + immutableMap);

        // Mejoras en la API de Procesos
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Process ID: " + currentProcess.pid());
        currentProcess.children().forEach(proc -> System.out.println("Child Process ID: " + proc.pid()));
    }
}
