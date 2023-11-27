package integador.DAO;

import integador.entidades.Tecnico;

public interface TecnicoDAO {

    void create(Tecnico tecnico);

    Tecnico read(Integer id);

    void update(Tecnico tecnico);

    void delete(Tecnico tecnico);
}
