package org.una.programmingIII;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.sun.net.httpserver.HttpServer;

@SuppressWarnings("ALL")
public class Java18Main {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        // Acceso a Memoria y Funciones Extranjeras (Segunda Incubadora)

        // Servidor Web Simple
        startSimpleHttpServer();

        // API de Dirección y Resolución de URI
        URI uri = new URI("https://www.example.com/path?query=java18");
        System.out.println("URI: " + uri);
        System.out.println("Scheme: " + uri.getScheme());
        System.out.println("Host: " + uri.getHost());
        System.out.println("Path: " + uri.getPath());
        System.out.println("Query: " + uri.getQuery());

        // Cliente HTTP para realizar una solicitud a la URI
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(uri).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("HTTP Response: " + response.body());
    }

    private static void startSimpleHttpServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/").setHandler(exchange -> {
            String response = "Hello from Simple HTTP Server!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });
        System.out.println("Starting Simple HTTP Server on port 8000...");
        server.start();
    }
}
