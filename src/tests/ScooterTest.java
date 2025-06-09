package tests;
import static org.junit.Assert.*;

import model.Scooter;
import org.junit.Test;

public class ScooterTest {
    @Test
    public void testScooterPricing() {
        Scooter scooter = new Scooter(5);
        assertEquals("Scooter price should match", 5, scooter.getPrice(), 0.001);
    }
}
