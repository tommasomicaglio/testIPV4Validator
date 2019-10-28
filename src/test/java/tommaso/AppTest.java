package tommaso;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertFalse("123.456.789.0", false);
    }
    @Test
    public void shouldAnswerWithTrue1()
    {
        assertTrue("127.0.0.1", true);
    }

}
