package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos() {
        Ana sogra = new Ana();

        // System.out.println(sogra.segredo); // PRIVATE Ana somente
        // System.out.println(sogra.facoDentroDeCasa); // Somente pacote da Casa A tem acesso
        // System.out.println(sogra.formaDeFalar); // Sem acesso. Não extends Ana
        System.out.println(sogra.todosSabem);
    }
}
