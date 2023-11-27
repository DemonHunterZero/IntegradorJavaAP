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
@Table(name = "Tipo_Incidente")

public class TipoIncidente {

    @OneToOne
    @JoinColumn(name="Tec_Especialidades_idTec_Especialidades", referencedColumnName = "idTec_Especialidades")
    private TecEspecialidad incidenteEspecialidad;

    @OneToMany
    private List<Incidente> incidentes;

    @Id
    @Column(name ="idTipo_Incidente")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idTipoIncidente;



}
