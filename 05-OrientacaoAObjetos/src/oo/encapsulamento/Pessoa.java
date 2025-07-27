package oo.encapsulamento;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    //Construtor
    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    public int getIdade() {
        return idade;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade); //Para alterar numero passado para positivo
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        } else {
            System.out.println("Informe uma novaIdade real.");
        }
    }

    @Override
    public String toString() {
        return "Olá, eu sou " + getNomeCompleto() + " e tenho " + getIdade() + " anos.";
    }
}
