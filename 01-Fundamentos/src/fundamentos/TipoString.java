package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá, pessoal!".charAt(3));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa")); //booelan
        System.out.println(s.toLowerCase().startsWith("boa")); //booelan
        System.out.println(s.toUpperCase().endsWith("TARDE")); //boolean
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde")); //boolean
        System.out.println(s.equalsIgnoreCase("boa tarde")); //boolean

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n";
        System.out.println(maisUmaFrase);

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual")); //boolean
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6,10));



    }
}
