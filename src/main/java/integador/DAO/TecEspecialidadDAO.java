package integador.DAO;

import integador.entidades.TecEspecialidad;

public interface TecEspecialidadDAO {

    void create(TecEspecialidad tecEspecialidad);

    TecEspecialidad read(Integer id);

    void update(TecEspecialidad tecEspecialidad);

    void delete(TecEspecialidad tecEspecialidad);
}
