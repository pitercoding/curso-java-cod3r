package oo.desafio;

public class Sistema {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Guitarra Fender", 4000, 1);
        compra1.adicionarItem("Amplificador Laney", 1500, 2);
        System.out.println("Quantidade Primeira Compra: " + compra1.itens.size());
        System.out.printf("Valor Primeira Compra: R$%.2f\n", compra1.valorTotal());

        Compra compra2 = new Compra();
        compra2.adicionarItem("Headset", 300, 1);
        compra2.adicionarItem("Placa de som", 400, 1);
        System.out.println("\nQuantidade Segunda Compra: " + compra2.itens.size());
        System.out.printf("Valor Segunda Compra: R$%.2f\n", compra2.valorTotal());

        Cliente cliente1 = new Cliente("Rebeca Justino");
        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);

        System.out.println("\nTotal a pagar: R$" + cliente1.obterValorTotal());

    }
}
