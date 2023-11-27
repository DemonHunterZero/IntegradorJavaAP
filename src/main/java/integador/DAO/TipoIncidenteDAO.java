package integador.DAO;

import integador.entidades.TipoIncidente;

public interface TipoIncidenteDAO {

    void create(TipoIncidente tipoIncidente);

    TipoIncidente read(Integer id);

    void update(TipoIncidente tipoIncidente);

    void delete(TipoIncidente tipoIncidente);
}
