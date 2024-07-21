package org.una.programmingIII;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.io.*;

@SuppressWarnings("ALL")
public class Java17Main {
    public static void main(String[] args) {
        // Clases Selladas

        // Generadores de Números Pseudoaleatorios Mejorados
        RandomGeneratorFactory<RandomGenerator> factory = RandomGeneratorFactory.of("L32X64MixRandom");
        RandomGenerator randomGenerator = factory.create();
        System.out.println("Random number: " + randomGenerator.nextInt(100));

        // Filtros de Deserialización Específicos de Contexto
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("example.ser"))) {
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // API de Funciones y Memoria Extranjera  Facilitates interaction with memory and functions outside the JVM.
    }
}

