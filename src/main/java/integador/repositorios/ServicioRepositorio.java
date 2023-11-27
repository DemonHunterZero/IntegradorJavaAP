package integador.repositorios;

import integador.entidades.Servicio;

public interface ServicioRepositorio {

    void agregarServicio(Servicio servicio);
    void modificarServicio(Servicio servicio);
    void borrarServicio(Servicio servicio);
    Servicio seleccionarServicio(Integer id);
}
