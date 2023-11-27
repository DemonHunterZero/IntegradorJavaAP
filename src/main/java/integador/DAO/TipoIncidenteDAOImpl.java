package integador.DAO;

import integador.entidades.Cliente;
import jakarta.persistence.EntityManager;

public class TipoIncidenteDAOImpl implements ClienteDAO{

    EntityManager em;

    @Override
    public void create(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public Cliente read(Integer id) {
        return em.find(Cliente.class, id);
    }

    @Override
    public void update(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        em.remove(cliente);
    }

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
}
