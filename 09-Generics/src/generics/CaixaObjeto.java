package generics;

public class CaixaObjeto {

    private Object coisa;

    // Setter //
    public void aguardar(Object coisa) {
        this.coisa = coisa;
    }

    // Getter //
    public Object abrir() {
        return coisa;
    }
}
