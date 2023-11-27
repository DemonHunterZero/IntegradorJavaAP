package integador.DAO;

import integador.entidades.Incidente;
import jakarta.persistence.EntityManager;

public class IncidenteDAOImpl implements IncidenteDAO{

    private EntityManager em;

    @Override
    public void create(Incidente incidente) {
        em.persist(incidente);
    }

    @Override
    public Incidente read(Integer id) {
        return em.find(Incidente.class, id);
    }

    @Override
    public void update(Incidente incidente) {
        em.merge(incidente);
    }

    @Override
    public void delete(Incidente incidente) {
        em.remove(incidente);
    }

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
}
