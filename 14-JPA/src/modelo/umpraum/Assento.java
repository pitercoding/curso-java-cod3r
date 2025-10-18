package modelo.umpraum;

import javax.persistence.*;

@Entity
@Table(name = "assentos")
public class Assento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // Construtor Padrão Obrigatório //
    public Assento() {

    }

    // Construtor //
    public Assento(String nome) {
        this.nome = nome;
    }

    // Getters e Setters //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
