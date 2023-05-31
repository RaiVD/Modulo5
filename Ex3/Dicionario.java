package Ex3;
import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    public void setDicionario() {
        Map<String, String> dicionario = new HashMap<>();

        dicionario.put("Bola", "Azul");
        dicionario.put("Boneca", "Amarela");
        dicionario.put("Dado", "Rosa");
        dicionario.put("Carrinho", "Verde");
        dicionario.put("Baralho", "Branco");


        System.out.println("Dicionario: ");
        dicionario.forEach((k,v) -> System.out.println("Chave: " + k +" | Valor: "+ v ));

    }
}
