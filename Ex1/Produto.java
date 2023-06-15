package Ex1;

public class Produto {
    double produto1;
    double produto2;
    double produto3;

    public Produto(double produto1, double produto2, double produto3) {
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
    }

    public double getProduto1() {
        return produto1;
    }

    public double getProduto2() {
        return produto2;
    }

    public double getProduto3() {
        return produto3;
    }

    public void produtoMaisBarato() {
        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("Você deve comprar o primeiro produto.");
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("Você deve comprar o segundo produto.");
        } else {
            System.out.println("Você deve comprar o terceiro produto.");
        }
    }
}