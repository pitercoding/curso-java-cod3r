package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João","da Silva", 50); //Nome e idade no construtor

        //p1.idade = -30; //alterar se idade public
        //System.out.println(p1.idade); //acessar/ler se idade public

        p1.setNome("Ana"); //Nome alterado com setNome();
        p1.setSobrenome("Soares"); //Sobrenome alterado com setSobrenome();
        p1.setIdade(20); //Idade alterada com setIdade();
        System.out.println(p1.getIdade());
        System.out.println(p1.toString()); //método para retornar String completa
    }
}
