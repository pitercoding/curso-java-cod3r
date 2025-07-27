package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        // System.out.println(segredo); // PRIVATE Ana somente
        // System.out.println(facoDentroDeCasa); // Somente pacote da Casa A tem acesso
        System.out.println(formaDeFalar); //Disponível via herança somente
        System.out.println(todosSabem);
    }

}
