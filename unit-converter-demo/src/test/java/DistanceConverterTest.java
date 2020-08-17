import com.training.service.DistanceConverter;
import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceConverterTest {

    @Test
    public void convertKilometersToNauticalMiles() {
        DistanceConverter dc = new DistanceConverter();
        double result = dc.convertKilometersToNauticalMiles(10);
        assertEquals("expect conversion to nautical miles to work", 18.55, result, 1.0);
    }
}