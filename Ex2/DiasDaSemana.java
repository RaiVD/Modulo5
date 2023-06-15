package Ex2;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
public class DiasDaSemana {
    public static String diaDaSemanaAtual(){
        DayOfWeek diaAtualDaSemana = LocalDate.now().getDayOfWeek();
        String nomeDiaSemana = diaAtualDaSemana.getDisplayName(TextStyle.FULL, Locale.getDefault());

        return "Hoje é "+nomeDiaSemana;
    }
    public static String melhorDiaFeira() {
        DayOfWeek dataAtual = LocalDate.now().getDayOfWeek();

        if (dataAtual == DayOfWeek.SUNDAY) {
            return "Hoje é domingo, o melhor dia para ir à feira.";
        } else {
            int diasQueFaltam = DayOfWeek.SUNDAY.getValue() - dataAtual.getValue();
            return "Ainda não é um bom dia para ir a feira, aguarde " + diasQueFaltam + " dias para domingo.";
        }
    }
}
