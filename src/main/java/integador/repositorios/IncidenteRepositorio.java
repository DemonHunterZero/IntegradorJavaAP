package integador.repositorios;

import integador.entidades.Incidente;

public interface IncidenteRepositorio {

    void agregarIncidente(Incidente incidente);
    void modificarIncidente(Incidente incidente);
    void borrarIncidente(Incidente incidente);
    Incidente seleccionarIncidente(Integer id);
}
