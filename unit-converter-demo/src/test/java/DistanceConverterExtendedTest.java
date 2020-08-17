import com.training.service.DistanceConverter;
import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class DistanceConverterExtendedTest {

    private static DistanceConverter dc;

    @BeforeClass
    public static void classSetUp(){
        System.out.println("Before class");
        dc = new DistanceConverter();
    }

    //@Before
    public void setUp(){
        System.out.println("Before");
    }

    @Test
    public void testConversion1(){
        double res1 = dc.convertKilometersToNauticalMiles(4);
        assertEquals(7, res1, 1.0);
    }

    @Test
    public void testConversion2(){
        double res1 = dc.convertKilometersToNauticalMiles(7);
        assertEquals(12, res1, 1.0);
    }

    @Test(expected = RuntimeException.class)
    public void testThrowsException(){
        dc.convertInchToCm(1.3);
    }

    @After
    public void tearDown(){
        System.out.println("tear down");
    }

    @AfterClass
    public static void classTearDown(){
        System.out.println("class tear down");
    }


}
