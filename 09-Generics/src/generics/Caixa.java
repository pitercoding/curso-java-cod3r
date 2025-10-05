package generics;

public class Caixa<T> {

    private T coisa;

    // Setter //
    public void aguardar(T coisa) {
        this.coisa = coisa;
    }

    // Getter //
    public T abrir() {
        return coisa;
    }
}
