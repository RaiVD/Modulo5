package Ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaCorrenteTeste {
    ContaCorrente conta = new ContaCorrente(123456, "Raissa");

    @Test
    public void testarOSaldoPositivos() {
        conta.depositoConta(100.0);
        conta.saqueConta(50.0);

        Assertions.assertEquals(55.0, conta.getSaldoConta());
    }
    @Test
    public void testarParaQueOsaldoNaoFiqueNegativo() {
        conta.depositoConta(100.0);
        conta.saqueConta(150.0);
        if (conta.getSaldoConta() - conta.valor < 5.0) {
        }
        Assertions.assertEquals(105.0, conta.getSaldoConta());
    }
}
