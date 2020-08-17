import com.training.model.ConversionOperation;
import com.training.model.ConversionResult;
import com.training.model.Unit;
import com.training.parser.UnitSyntaxParser;
import com.training.service.ConverterController;
import com.training.service.UnitConverter;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ConverterControllerTest {

    private static ConverterController converterController;

    private static UnitSyntaxParser unitSyntaxParser = mock(UnitSyntaxParser.class);
    private static UnitConverter unitConverter = mock(UnitConverter.class);

    @BeforeClass
    public static void init() {
        converterController = new ConverterController(unitSyntaxParser, unitConverter);
    }

    @Test
    public void testKilometersToMetersShouldWork() {
        ConversionOperation operation = new ConversionOperation(2000, Unit.KILOMETER, Unit.METER);
        when(unitSyntaxParser.parse(anyString())).thenReturn(operation);
        ConversionResult conversionResult = mock(ConversionResult.class);
        when(unitConverter.convert(operation)).thenReturn(conversionResult);
        when(conversionResult.toString()).thenReturn("2000 meters");
        assertEquals("2000 meters", converterController.convertFromString("2 kilometers to meters"));
    }
}