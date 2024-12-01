import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;
public class CalTest {

    @Test
    public void testAdd() {
        
        assertEquals(5.0, Calculator.add(2.0, 1.0));
        assertEquals(0.0, Calculator.add(-2.0, 2.0));
    }
}