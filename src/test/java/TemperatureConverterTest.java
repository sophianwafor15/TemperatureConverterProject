import org.example.TemperatureConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    public void testTemperatureConverter() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(41, temperatureConverter.celsiusToFahrenheit(5));
    }

    @Test
    public void testTemperatureConverter2() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(5,temperatureConverter.fahrenheitToCelsius(41));
    }

    @Test
    public void testTemperatureConverter3() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(373.15, temperatureConverter.celsiusToKelvin(100));


    }
}