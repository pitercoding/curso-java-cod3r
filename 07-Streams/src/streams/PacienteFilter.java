package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PacienteFilter {
    public static void main(String[] args) {

        Paciente p1 = new Paciente("Ana", 35, "F",true);
        Paciente p2 = new Paciente("Gui", 12, "M",true);
        Paciente p3 = new Paciente("Jorge", 48, "M",false);
        Paciente p4 = new Paciente("Tamires", 18, "F",false);
        Paciente p5 = new Paciente("Paulo", 78, "M",true);
        Paciente p6 = new Paciente("Jane", 57, "F",false);
        Paciente p7 = new Paciente("Sarah", 3, "F",true);
        Paciente p8 = new Paciente("Rebeca", 1, "F",true);
        Paciente p9 = new Paciente("Francisco", 65, "M",false);
        Paciente p10 = new Paciente("Piter", 35, "M",true);

        List<Paciente> pacientes = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

        Predicate<Paciente> idadeMaiorQueTrinta = p -> p.idade > 30;
        Predicate<Paciente> planoDeSaude = p -> p.temPlanoDeSaude;
        Function<Paciente, String> situacaoCadastral =
                p -> "Parabéns " + p.nome + "! Situação cadastral em dia. Deseja agendar uma consulta?";

        pacientes.stream()
                .filter(idadeMaiorQueTrinta)
                .filter(planoDeSaude)
                .map(situacaoCadastral)
                .forEach(System.out::println);
    }
}
