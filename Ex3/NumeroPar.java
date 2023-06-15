package Ex3;

public class NumeroPar {
    int numero;
    public NumeroPar(int numero) {
        this.numero = numero;
    }
    public boolean verificarPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
