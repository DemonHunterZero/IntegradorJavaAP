package integador.DAO;

import integador.entidades.Incidente;

public interface IncidenteDAO {
    void create(Incidente incidente);

    Incidente read(Integer id);

    void update(Incidente incidente);

    void delete(Incidente incidente);
}
