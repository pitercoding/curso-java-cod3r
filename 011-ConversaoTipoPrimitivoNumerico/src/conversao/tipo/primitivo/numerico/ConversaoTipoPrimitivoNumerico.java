package conversao.tipo.primitivo.numerico;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; //implícita
        System.out.println(a);

        // float b = 1.123456788888F;    ->Opção mais simples
        float b = (float) 1.123456788888; //Conversão explícita (CAST)
        System.out.println(b);

        int c = 4; //Funciona número dentro do range de um byte
        byte d = (byte) c; //Conversão explícita (CAST)
        System.out.println(d);

        int e = 340; //Converte um valor estrnaho já que não tá no range do byte
        byte f = (byte) e; //Conversão explícita (CAST)
        System.out.println(f);

        double g = 1.999999;
        int h = (int) g; //Perda de informação - Conversão explícita (CAST)
        System.out.println(h);
    }
}
