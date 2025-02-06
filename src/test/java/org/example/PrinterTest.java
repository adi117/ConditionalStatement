package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    @DisplayName("Multiplication Table")
    void testMultipicationTable(){
        assertEquals("1 2 3 4 5\n" +
                "2 4 6 8 10\n" +
                "3 6 9 12 15\n" +
                "4 8 12 16 20\n" +
                "5 10 15 20 25\n", Printer.multiplicationTable(5));
    }

    @Test
    @DisplayName("Triangle Pattern")
    void testTrianglePattern(){
        assertEquals("*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n", Printer.printTriangle(5));
    }

    @Test
    @DisplayName("Input Number Iteration")
    void testInputNumber(){
        String input = "1\n y\n 2\n y\n 3\n n\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        assertEquals("1,2,3,", Printer.inputNumberIteration(scanner));
    }

}