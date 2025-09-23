package streams;

public class Paciente {
    final String nome;
    final int idade;
    final String sexo;
    final boolean temPlanoDeSaude;

    public Paciente(String nome, int idade, String sexo, boolean temPlanoDeSaude) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.temPlanoDeSaude = temPlanoDeSaude;
    }
}
