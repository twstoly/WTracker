package models;

import models.Animal;
import org.junit.*;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AnimalTest {

    public Animal setUpNewAnimal() {
        return new Animal("cat");
    }

    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void animal_instantiatesCorrectly_true() {
        Animal testAnimal = setUpNewAnimal();
        assertNotNull(testAnimal);
    }

    @Test
    public void getName_instantiatesWithName_String() {
        Animal testAnimal = setUpNewAnimal();
        assertEquals("cat", testAnimal.getName());
    }


    @Test
    public void equals_returnsTrueObjectsAreSame_true() {
        Animal testAnimal = setUpNewAnimal();
        Animal otherAnimal = setUpNewAnimal();
        assertEquals(testAnimal, otherAnimal);
    }

    @Test
    public void find_returnsAnimalWithSameId_otherAnimal() {
        Animal firstAnimal =setUpNewAnimal();
        firstAnimal.save();
        Animal secondAnimal = new Animal("");
        secondAnimal.save();
        assertEquals(Animal.find(secondAnimal.getId()), secondAnimal);
    }


    @Test
    public void delete_deletesAnimalFromDatabase_true() {
        Animal testAnimal = setUpNewAnimal();
        testAnimal.save();
        testAnimal.delete();
        assertNull(Animal.find(testAnimal.getId()));
    }
}
















