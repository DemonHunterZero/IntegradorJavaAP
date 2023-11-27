package integador.DAO;

import integador.entidades.Operador;
import jakarta.persistence.EntityManager;

public class OperadorDAOImpl implements OperadorDAO{

    private EntityManager em;

    @Override
    public void create(Operador operador) {
        em.persist(operador);
    }

    @Override
    public Operador read(Integer id) {
        return em.find(Operador.class,id);
    }

    @Override
    public void update(Operador operador) {
        em.merge(operador);
    }

    @Override
    public void delete(Operador operador) {
        em.remove(operador);
    }

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

}
