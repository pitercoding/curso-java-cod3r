package teste.basico;

import infra.DAO;

public class NovoProduto {

    public static void main(String[] args) {

        Produto produto = new Produto("Monitor 23", 789.98);

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.incluirAtomico(produto).fecharDAO();

        System.out.println("Id do produto: " + produto.getId());
    }
}
