package ch.emf.atelierpo.wrk;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WorkerTest {
    @Test
    public void testControlePlaqueImmatriculation() {
        boolean test;
        Worker wrk = new Worker();
        // Test 1 : Test valeur null null
        test = wrk.controlePlaqueImmatriculation(null, null);
        assertFalse(test);

        // Test 2 : Test valeur "" ""
        test = wrk.controlePlaqueImmatriculation("", "");
        assertFalse(test);

    }
}
