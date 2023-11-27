package integador.repositorios;

import integador.entidades.Tecnico;

public interface TecnicoRepositorio {

    void agregarTecnico(Tecnico tecnico);
    void modificarTecnico(Tecnico tecnico);
    void borrarTecnico(Tecnico tecnico);
    Tecnico seleccionarTecnico(Integer id);

}
