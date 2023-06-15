package Ex1;
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(210.50,211.99,315.75);

        System.out.println("Valor do produto1: R$"+produto.produto1);
        System.out.println("Valor do produto2: R$"+produto.produto2);
        System.out.println("Valor do produto3: R$"+produto.produto3);
        produto.produtoMaisBarato();

    }
}
