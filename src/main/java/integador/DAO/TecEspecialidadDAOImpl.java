package integador.DAO;

import integador.entidades.TecEspecialidad;
import jakarta.persistence.EntityManager;

public class TecEspecialidadDAOImpl implements TecEspecialidadDAO{

    EntityManager em;

    @Override
    public void create(TecEspecialidad tecEspecialidad) {
        em.persist(tecEspecialidad);
    }

    @Override
    public TecEspecialidad read(Integer id) {
        return em.find(TecEspecialidad.class, id);
    }

    @Override
    public void update(TecEspecialidad tecEspecialidad) {
        em.merge(tecEspecialidad);
    }

    @Override
    public void delete(TecEspecialidad tecEspecialidad) {
        em.remove(tecEspecialidad);
    }

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
}
