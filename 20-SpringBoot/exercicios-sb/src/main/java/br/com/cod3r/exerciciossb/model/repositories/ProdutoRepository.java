package br.com.cod3r.exerciciossb.model.repositories;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProdutoRepository
        extends CrudRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

    //    Outra opção usando Query:
//    @Query("SELECT p FROM  Produto p WHERE p.nome LIKE %nome%")
//    public Iterable<Produto> searchByNameLike(@Param("nome") String nome);

//    Algumas Convenções:

//    findByNomeContaining
//    findByNomeIsContaining
//    findByNomeContains
//
//    findByNomeStartsWith
//    findByNomeEndsWith

//    findByNomeNotContaining


}
