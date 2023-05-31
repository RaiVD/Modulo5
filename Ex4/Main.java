package Ex4;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        Conta contaRaissa = new Conta(1550,2341,2234);
        Conta contaAna = new Conta(1000,1467,2134);
        Conta contaPedro = new Conta(2000,1234,2222);
        Conta contaPaulo = new Conta(3500,1425,2143);

        contas.add(contaRaissa);
        contas.add(contaAna);
        contas.add(contaPedro);
        contas.add(contaPaulo);


        for (Conta calculo :contas) {
            System.out.println("Poupança com tributo: "+calculo.tributosPoupanca()+"\nCorrente com tributo:  "+(calculo.tributosContaCorrente()+calculo.getSaldoCorrente())+"\nSeguro de vida com tributo: "+calculo.tributosSeguro());
            System.out.println("---------------------------------------------------------------------");
        }



    }
}

