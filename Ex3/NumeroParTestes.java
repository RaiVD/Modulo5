package Ex3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class NumeroParTestes {
    @Test
    public void testNumerosPares() {
        NumeroPar numeroPar = new NumeroPar(0);

        assertTrue(numeroPar.verificarPar(2));
        assertTrue(numeroPar.verificarPar(10));
        assertTrue(numeroPar.verificarPar(20));
    }
}
