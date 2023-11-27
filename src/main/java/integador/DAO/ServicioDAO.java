package integador.DAO;

import integador.entidades.Servicio;

public interface ServicioDAO {

    void create(Servicio servicio);

    Servicio read(Integer id);

    void update(Servicio servicio);

    void delete(Servicio servicio);
}
