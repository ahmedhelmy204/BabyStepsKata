package org.babysteps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenNumberGeneratorShould {

    @Test
    void GenerateEvenNumber() {
        // Arrange
        EvenNumberGenerator evenNumberGenerator = new EvenNumberGenerator();

        // Act
        int generatedNumber = evenNumberGenerator.generate();

        // Assert
        assertTrue(generatedNumber % 2 == 0);
    }

    @Test
    void GenerateEvenNumberEndsIn4() {
        // Arrange
        EvenNumberGenerator evenNumberGenerator = new EvenNumberGenerator();

        // Act
        int generatedNumber = evenNumberGenerator.generate();
        String generatedNumberString = String.valueOf(generatedNumber);

        // Assert
        assertTrue(generatedNumberString.endsWith("4"));
    }

    @Test
    void GenerateEvenNumberGreaterThan9(){
        // Arrange
        EvenNumberGenerator evenNumberGenerator = new EvenNumberGenerator();

        // Act
        int generatedNumber = evenNumberGenerator.generate();

        // Assert
        assertTrue(generatedNumber > 9);
    }

    @Test
    void GenerateEvenNumberLessThan100(){
        // Arrange
        EvenNumberGenerator evenNumberGenerator = new EvenNumberGenerator();

        // Act
        int generatedNumber = evenNumberGenerator.generate();

        // Assert
        assertTrue(generatedNumber < 100);
    }
}