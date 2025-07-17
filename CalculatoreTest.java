ackage com.brand.calculatore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatoreTest {
private Calculatore calculatore = new Calculatore();
@Test
public void testSum() {
assertEquals(8, calculatore.sum(3, 5));
}
}
