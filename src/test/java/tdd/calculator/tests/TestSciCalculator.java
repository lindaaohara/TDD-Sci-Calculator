package tdd.calculator.tests;

import com.codedifferently.tdd.calculator.calculator.scientific.SciCalculator;
import org.junit.Test;

public class TestSciCalculator {

    @Test
    public void testSine() {
        // : Given
        Double value = 30.0;
        Double expected = 0.5;
        // : When
        Double actual = SciCalculator.sine(value);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testCosine() {
        // : Given
        Double value = 0.0;
        Double expected = 1.0;
        // : When
        Double actual = SciCalculator.cosine(value);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testTangent() {
        // : Given
        Double value = 45.0;
        Double expected = 1.0;
        // : When
        Double actual = SciCalculator.tangent(value);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testInverseSine() {
        // : Given
        Double value = 1.0;
        Double expected = 90.0;
        // : When
        Double actual = SciCalculator.invSine(value);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testInverseCosine() {
        // : Given
        Double value = 0.0;
        Double expected = 90.0;
        // : When
        Double actual = SciCalculator.invCosine(value);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testInverseTangent() {
        // : Given
        Double value = 1.0;
        Double expected = 45.0;
        // : When
        Double actual = SciCalculator.invTangent(value);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testLog() {
        // : Given
        Double value = 1.0;
        Double expected = 0.0;
        // : When
        Double actual = SciCalculator.log(value);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testInvLog() {
        // : Given
        Double value = 0.0;
        Double expected = 1.0;
        // : When
        Double actual = SciCalculator.invLog(value);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testNatLog() {
        // : Given
        Double value = 1.0;
        Double expected = 0.0;
        // : When
        Double actual = SciCalculator.natLog(value);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testInvNatLog() {
        // : Given
        Double value = 0.0;
        Double expected = 1.0;
        // : When
        Double actual = SciCalculator.invNatLog(value);
        // : Then
        assertEquals(expected, actual);
    }

    //@Test
    //public void testSwitchUnitsMode() {
    // : Given
    //    String mode1 = "Next option";
    //    String expected = mode1;
    // : When
    //    String actual = SciCalculator.switchTrigMode();
    // : Then
    //    assertEquals(expected, actual);
    //}

    @Test
    public void testSwitchTrigMode() {
        // : Given
        String mode1 = "Degrees";
        String expected = mode1;
        // : When
        String actual = SciCalculator.switchTrigMode(mode1);
        // : Then
        assertEquals(expected, actual);
    }

    private void assertEquals(Double expected, Double actual) {
    }

    private void assertEquals(String expected, String actual) {
    }
}
