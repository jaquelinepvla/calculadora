/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class AppTest {
    Calculadora c;

    @Before public void setUp() {
      c = new Calculadora();
    }

    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void testSuma() {
//      Calculadora c = new Calculadora();
        assertTrue(c.suma(2,3)==5);
    }
}
