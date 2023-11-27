package integador.DAO;

import integador.entidades.Cliente;

public interface ClienteDAO {

    void create(Cliente cliente);

    Cliente read(Integer id);

    void update(Cliente cliente);

    void delete(Cliente cliente);
}
