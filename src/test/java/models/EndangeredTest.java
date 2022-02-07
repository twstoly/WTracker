package models;
import models.DatabaseRule;
import models.Endangered;
import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EndangeredTest {

    public Endangered setUpNewEndangered() {
        return new Endangered("elephant","healthy","young");
    }

    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void Endangered_instantiatesCorrectly_true() {
        Endangered testEndangered = setUpNewEndangered();
        assertNotNull(testEndangered);
    }

    @Test
    public void getName_instantiatesWithName_String() {
        Endangered testEndangered = setUpNewEndangered();
        assertEquals("elephant", testEndangered.getName());
    }


    @Test
    public void getHealth_instantiatesWithHealth_String() {
        Endangered testEndangered = setUpNewEndangered();
        assertEquals("healthy", testEndangered.getHealth());
    }

    @Test
    public void getAge_instantiatesWithAge_String() {
        Endangered testEndangered = setUpNewEndangered();
        assertEquals("young", testEndangered.getAge());
    }



    @Test
    public void equals_returnsTrueIfObjectsSame_true() {
        Endangered testEndangered = setUpNewEndangered();
        Endangered otherEndangered = setUpNewEndangered();
        assertTrue(testEndangered.equals(otherEndangered));
    }

    @Test
    public void save_savesObjectsToDatabase_false() {
        Endangered testEndangered = setUpNewEndangered();
        testEndangered.save();
        assertFalse(Endangered.all().get(0).equals(testEndangered));
    }


    @Test
    public void all_returnsAllInstancesOfEndangered_true() {
        Endangered testEndangered = setUpNewEndangered();
        testEndangered.save();
        Endangered otherEndangered = new Endangered("","","");
        otherEndangered.save();
        assertEquals(false,Endangered.all().get(0).equals(testEndangered));
        assertEquals(false,Endangered.all().get(1).equals(otherEndangered));
    }

    @Test
    public void find_returnsEndangeredWithSameId_otherEndangered() {
        Endangered firstEndangered =setUpNewEndangered();
        firstEndangered.save();
        Endangered secondEndangered = new Endangered("","","");
        secondEndangered.save();
        assertEquals(Endangered.find(secondEndangered.getId()), secondEndangered);
    }

    @Test
    public void delete_deletesEndangeredAnimal_true() {
        Endangered testEndangered = setUpNewEndangered();
        testEndangered.save();
        testEndangered.delete();
        assertEquals(null, Endangered.find(testEndangered.getId()));
    }



}