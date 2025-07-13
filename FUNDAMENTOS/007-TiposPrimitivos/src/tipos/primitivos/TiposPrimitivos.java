package tipos.primitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionário

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //Tipos numéricos Reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipos booleano
        boolean estaDeFerias = false; //true

        //Tipos caractere
        char status = 'A'; //ativo

        //Calculos
        System.out.println("Dias de Empresa: " + anosDeEmpresa * 365);
        System.out.println("Número de viagens: " + numeroDeVoos / 2);
        System.out.println("Pontos por Real: " + pontosAcumulados / vendasAcumuladas);
        System.out.println("ID: " + id + " ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
