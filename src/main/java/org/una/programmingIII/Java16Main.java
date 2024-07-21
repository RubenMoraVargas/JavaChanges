package org.una.programmingIII;

@SuppressWarnings("ALL")
public class Java16Main {
    public static void main(String[] args) {
        // Registros (Records)
        Person person = new Person("Alice", 30);
        System.out.println("Record Example: " + person.name() + " is " + person.age() + " years old.");

        // Coincidencia de Patrones para instanceof
        Object obj = "Hello, Java 16!";
        if (obj instanceof String s) {
            System.out.println("Pattern Matching instanceof: " + s.toUpperCase());
        }

        // Clases Selladas

    }
}

record Person(String name, int age) {}
