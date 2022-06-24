package ChapterSixTest;

import ChapterSix.TemperatureConversions;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class TemperatureConversionsTest {
    @Test
    public void testThatTemperatureConversionCanBeCreated(){
        TemperatureConversions temperature = new TemperatureConversions();
        assertNotNull(temperature);
    }
    @Test
    public void testThatKelvinTemperatureCanBeCalculated(){
        TemperatureConversions temperature = new TemperatureConversions();
        temperature.calculateKelvin(32.5);
        assertEquals(305.65, temperature.getKelvin());
    }
    @Test
    public void testThatCelsiusTemperatureCanBeCalculated(){
        TemperatureConversions temperature = new TemperatureConversions();
        temperature.calculateCelsius(315.0);
        assertEquals(41.85, temperature.getCelsius());
    }
}
