package modelo.muitospramuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sobrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany (mappedBy = "sobrinhos")
    private List<Tio> tios = new ArrayList<>();

    // Construtor Padrão Obrigatório //
    public Sobrinho() {

    }

    // Construtor //
    public Sobrinho(String nome) {
        this.nome = nome;
    }

    // Getters e Setters //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tio> getTios() {
        return tios;
    }

    public void setTios(List<Tio> tios) {
        this.tios = tios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
