package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("14-JPA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 6L);
        System.out.println(usuario.getEmail());
        usuario.setNome("Leo");
        usuario.setEmail("leo@lanche.com.br");
        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
