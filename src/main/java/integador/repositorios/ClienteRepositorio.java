package integador.repositorios;

import integador.entidades.Cliente;

public interface ClienteRepositorio {

    void agregarCliente(Cliente cliente);
    void modificarCliente(Cliente cliente);
    void borrarCliente(Cliente cliente);
    Cliente seleccionarCliente(Integer id);

}
