package integador.DAO;

import integador.entidades.Operador;

public interface OperadorDAO {

    void create(Operador operador);

    Operador read(Integer id);

    void update(Operador operador);

    void delete(Operador operador);
}
