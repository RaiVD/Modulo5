package Ex2;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class DiasDaSemanaTeste {
    @Test
    public void verificarSeHojeEDomingo() {
        String resultado = DiasDaSemana.melhorDiaFeira();
        assertEquals("Hoje é domingo! É o melhor dia para ir à feira.", resultado);
    }
    @Test
    public void verificarSeQualDiaDaSemanaAtual() {
        DayOfWeek diaAtualDaSemana = LocalDate.now().getDayOfWeek();
        String resultadoDiaDaSemana = diaAtualDaSemana.getDisplayName(TextStyle.FULL, Locale.getDefault());

        String nomeDiaDaSemana = DiasDaSemana.diaDaSemanaAtual();

        assertEquals("Hoje é "+resultadoDiaDaSemana, nomeDiaDaSemana);
    }

}
