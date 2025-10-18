package modelo.umpramuitos;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date data;

    // Construtor Padrão Obrigatório //
    public Pedido () {
        this(new Date());
    }

    // Construtor //
    public Pedido(Date data) {
        super();
        this.data = data;
    }

    // Getters e Setters //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
