package Ex1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdutosTestes {

    @Test
    public void TestarSeOProduto1EMenorQueOsOutros(){
        double produtoMaisBarato = 0;
        Produto produto = new Produto(210.50,211.99,315.75);
        if (produto.getProduto1() < produto.getProduto2() && produto.getProduto1() < produto.getProduto3()) {
            produtoMaisBarato = produto.getProduto1();
        }
        Assertions.assertEquals(210.50, produtoMaisBarato);
    }
    @Test
    public void TestarSeOProduto2EMenorQueOsOutros(){
        double produtoMaisBarato = 0;
        Produto produto = new Produto(211.99,210.50,315.75);

        if (produto.getProduto2() < produto.getProduto1() && produto.getProduto2() < produto.getProduto3()) {
            produtoMaisBarato = produto.getProduto2();
        }

        Assertions.assertEquals(210.50, produtoMaisBarato);
    }


}
