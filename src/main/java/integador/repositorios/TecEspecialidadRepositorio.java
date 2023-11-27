package integador.repositorios;

import integador.entidades.TecEspecialidad;

public interface TecEspecialidadRepositorio {

    void agregarTecEspecialidad(TecEspecialidad tecEspecialidad);
    void modificarTecEspecialidad(TecEspecialidad tecEspecialidad);
    void borrarTecEspecialidad(TecEspecialidad tecEspecialidad);
    TecEspecialidad seleccionarTecEspecialidad(Integer id);

}
