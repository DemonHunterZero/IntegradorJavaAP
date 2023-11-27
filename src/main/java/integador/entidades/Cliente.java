package integador.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Clientes")
public class Cliente {

    @ManyToMany
    private List<Servicio> servicios;

    @OneToMany
    private List<Incidente> incidente;

    @Id
    @Column(name = "idClientes")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idCliente;

    @Column(name = "Nombre_Apellido")
    private String nombreYApellidoCliente;

    @Column(name = "DNI")
    private int dniCliente;

    @Column(name = "CUIL")
    private int cuilCliente;

    @Column(name = "Edad")
    private int edadCliente;

    @Column(name = "Telefono")
    private int telefonoCliente;

    @Column(name = "Email")
    private String emailCliente;

    @Column(name = "Direccion")
    private String direccionCliente;

    @Column(name = "Localidad")
    private String localidadCliente;

}
