package integador.DAO;

import integador.entidades.Servicio;
import jakarta.persistence.EntityManager;

public class ServicioDAOImpl implements ServicioDAO{

    EntityManager em;

    @Override
    public void create(Servicio servicio) {
        em.persist(servicio);
    }

    @Override
    public Servicio read(Integer id) {
        return em.find(Servicio.class, id);
    }

    @Override
    public void update(Servicio servicio) {
        em.merge(servicio);
    }

    @Override
    public void delete(Servicio servicio) {
        em.remove(servicio);
    }

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
}
