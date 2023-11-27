package integador.repositorios;

import integador.entidades.Operador;

public interface OperadorRepositorio {

    void agregarOperador(Operador operador);
    void modificarOperador(Operador operador);
    void borrarOperador(Operador operador);
    Operador seleccionarOperador(Integer id);
}
