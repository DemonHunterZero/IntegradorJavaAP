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
@Table(name = "Servicios")
public class Servicio {

    @ManyToMany (mappedBy = "servicios")
    private List<Cliente> clientes;

    @OneToMany
    private List<Incidente> incidente;

    @Id
    @Column(name = "idServicios")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idServicio;

    @Column(name = "Nombre/Tipo")
    private String nombreServicio;

}
