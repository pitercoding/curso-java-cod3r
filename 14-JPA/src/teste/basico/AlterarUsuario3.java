package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("14-JPA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 6L);
        em.detach(usuario); // Estado desassociado

        usuario.setNome("Leonardo");
        em.merge(usuario);
        System.out.println("Persistindo...");
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
