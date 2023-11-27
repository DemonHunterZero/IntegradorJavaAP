package integador.repositorios;

import integador.entidades.TipoIncidente;

public interface TipoIncidenteRepositorio {

    void agregarTipoIncidente(TipoIncidente tipoIncidente);
    void modificarTipoIncidente(TipoIncidente tipoIncidente);
    void borrarTipoIncidente(TipoIncidente tipoIncidente);
    TipoIncidente seleccionarTipoIncidente(Integer id);

}
