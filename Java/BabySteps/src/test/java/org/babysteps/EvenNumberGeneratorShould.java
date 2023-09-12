package org.babysteps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenNumberGeneratorShould {

    @Test
    void GenerateEvenNumber(){
        // Arrange
        EvenNumberGenerator evenNumberGenerator = new EvenNumberGenerator();

        // Act
        int generatedNumber= evenNumberGenerator.generate();

        // Assert
        assertTrue(generatedNumber % 2 == 0);
    }
}