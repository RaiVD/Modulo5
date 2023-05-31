package Ex4;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        Conta contaRaissa = new Conta(1550,2341,22);
        Conta contaAna = new Conta(1000,1467,21);
        Conta contaPedro = new Conta(2000,1234,22);
        Conta contaPaulo = new Conta(3500,1425,21);

        contas.add(contaRaissa);
        contas.add(contaAna);
        contas.add(contaPedro);
        contas.add(contaPaulo);

        for (Conta calculo :contas) {
            System.out.println("Tributos da Conta Poupança: "+calculo.tributosPoupanca()+"\nTributos da Conta Corrente:  "+calculo.tributosContaCorrente()+"\nTributos do Seguro de vida: "+calculo.tributosSeguro());
            System.out.println("---------------------------------------------------------------------");
        }

    }
}

